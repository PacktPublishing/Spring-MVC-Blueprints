package org.packt.erp.modules.service.impl;

import java.util.Date;
import java.util.List;

import org.packt.erp.modules.dao.SalesPersonDao;
import org.packt.erp.modules.model.data.Person;
import org.packt.erp.modules.model.form.PersonForm;
import org.packt.erp.modules.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

// Hessian Remoting
@Service("/personService.http")
@Transactional
public class PersonServiceImpl implements PersonService{

	@Autowired
	SalesPersonDao personDao;
	
	@Transactional
	@Override
	public void setPerson(PersonForm person) {
		Person personData = new Person();
		personData.setFirstName(person.getFirstName());
		personData.setMiddleName(person.getMiddleName());
		personData.setLastName(person.getLastName());
		personData.setBirthDate(new Date());
		personData.setMobile(person.getMobile());
		personData.setMobile(person.getMobile());
		personData.setTelephone(person.getTelephone());
		personData.setEmail(person.getEmail());
		personData.setPosition(person.getPosition());
		personDao.setPerson(personData);
	}

	@Override
	public Person getPerson(Integer id) {
		// TODO Auto-generated method stub
		return personDao.getPerson(id);
	}

	@Override
	public List<Person> getPersons() {
		// TODO Auto-generated method stub
		return personDao.getPersons();
	}

}
