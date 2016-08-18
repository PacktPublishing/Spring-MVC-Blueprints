package org.packt.erp.modules;

import java.util.ArrayList;
import java.util.List;

public class AxisService {
	public String getMessage(String username) {
		return "Hello " + username + "! from spring web service.";
	}

	public List<Person> getAllPersons() {

		Person p1 = new Person();
		p1.setLastName("sdfdf");
		p1.setLastName("dfgdfg");
		p1.setAge(343);

		List<Person> records = new ArrayList<>();
		records.add(p1);
		return records;
	}

}
