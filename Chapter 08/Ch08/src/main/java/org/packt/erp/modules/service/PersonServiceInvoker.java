package org.packt.erp.modules.service;

import java.util.List;

import org.packt.erp.modules.model.data.Person;
import org.packt.erp.modules.model.form.PersonForm;

public interface PersonServiceInvoker {
	public void setPerson(PersonForm person);
	public Person getPerson(Integer id);
	public List<Person> getPersons();
}
