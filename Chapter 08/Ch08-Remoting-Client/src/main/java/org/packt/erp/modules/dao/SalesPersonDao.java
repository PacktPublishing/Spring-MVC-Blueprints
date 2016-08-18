package org.packt.erp.modules.dao;

import java.util.List;

import org.packt.erp.modules.model.data.Customer;
import org.packt.erp.modules.model.data.Person;

public interface SalesPersonDao {
	
	public void setPerson(Person person);
	public Person getPerson(Integer id);
	public List<Person> getPersons();

}
