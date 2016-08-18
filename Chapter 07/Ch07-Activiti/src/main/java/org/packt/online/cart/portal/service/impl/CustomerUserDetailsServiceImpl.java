package org.packt.online.cart.portal.service.impl;

import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import org.packt.online.cart.portal.dao.CustomerAccountDao;
import org.packt.online.cart.portal.dao.LoginDao;
import org.packt.online.cart.portal.model.data.Login;
import org.packt.online.cart.portal.model.data.Role;
import org.packt.online.cart.portal.security.userdetails.CustomerUserDetails;
import org.packt.online.cart.portal.service.CustomerUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly=true)
public class CustomerUserDetailsServiceImpl implements CustomerUserDetailsService {
	
	@Autowired
	CustomerAccountDao customerAccountDao;
	
	public LoginDao getLoginDao() {
		return loginDao;
	}

	public void setLoginDao(LoginDao loginDao) {
		this.loginDao = loginDao;
	}

	private  LoginDao loginDao;

    @Override
    public UserDetails loadUserByUsername(String username)
            throws UsernameNotFoundException {
    	
    	 
         Login user = loginDao.getLogin(username.trim());
        
        try {
        	 
            boolean enabled = true;
            boolean accountNonExpired = true;
            boolean credentialsNonExpired = true;
            boolean accountNonLocked = true;
            
            System.out.println(user.getUsername());
            System.out.println(user.getPassword());
            System.out.println(getAuthorities(user.getId(),loginDao.getUserRoleIds(user.getId())));

            // adapt as needed
            return new CustomerUserDetails(user.getUsername(),user.getEncPassword(), enabled, accountNonExpired,credentialsNonExpired, accountNonLocked,getAuthorities(user.getId(),loginDao.getUserRoleIds(user.getId())));

        } catch (Exception e) {
        	System.out.println("error");
            throw new RuntimeException(e);
        }
    }

    private  class SimpleGrantedAuthorityComparator implements
            Comparator<SimpleGrantedAuthority> {

        @Override
        public int compare(SimpleGrantedAuthority o1, SimpleGrantedAuthority o2) {
            return o1.equals(o2) ? 0 : -1;
        }
    }

    /**
     * Retrieves a collection of {@link GrantedAuthority} based on a list of
     * roles
     * 
     * @param roles
     *            the assigned roles of the user
     * @return a collection of {@link GrantedAuthority}
     */
    public Collection<? extends GrantedAuthority> getAuthorities(int userId,Set<Integer> roles) {

        Set<SimpleGrantedAuthority> authList = new TreeSet<SimpleGrantedAuthority>(
                new SimpleGrantedAuthorityComparator());

        authList.add(new  SimpleGrantedAuthority("USER"));
        for (int role : roles) {
            authList.addAll(getGrantedAuthorities(userId,role));
        }

        return authList;
    }

    /**
     * Wraps a {@link Role} role to {@link SimpleGrantedAuthority} objects
     * 
     * @param roles
     *            {@link String} of roles
     * @return list of granted authorities
     */
    public Set<SimpleGrantedAuthority> getGrantedAuthorities(int userId, int role) {

        Set<SimpleGrantedAuthority> authorities = new HashSet<SimpleGrantedAuthority>();

        Set<String> rolePermissions = loginDao.getUserPermissions(userId, role);
        for (String rp : rolePermissions) {
            authorities.add(new SimpleGrantedAuthority(rp));
        }

        return authorities;
    }
}
