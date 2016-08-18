package org.packt.online.cart.portal.service;

import java.io.Serializable;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public interface CustomerUserDetailsService extends Serializable,UserDetailsService {
	public UserDetails loadUserByUsername(String username)
            throws UsernameNotFoundException;
}
