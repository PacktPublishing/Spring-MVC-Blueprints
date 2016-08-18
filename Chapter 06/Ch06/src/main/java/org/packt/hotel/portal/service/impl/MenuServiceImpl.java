package org.packt.hotel.portal.service.impl;

import java.util.List;

import org.packt.hotel.portal.mapper.MenuMapper;
import org.packt.hotel.portal.model.data.HmsMenu;
import org.packt.hotel.portal.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class MenuServiceImpl implements MenuService {
	
	@Autowired
	private MenuMapper menuMapper;

	@Override
	public List<HmsMenu> getAllMenuOptions() {
		// TODO Auto-generated method stub
		return menuMapper.getMenu();
	}

}
