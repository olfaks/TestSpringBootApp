package com.version1.TestSpringBootApp;

import com.version1.TestSpringBootApp.model.inheritance.*;
import com.version1.TestSpringBootApp.model.inheritance.business.Customer;
import com.version1.TestSpringBootApp.model.inheritance.business.EmailContactService;
import com.version1.TestSpringBootApp.model.inheritance.business.PostalContactService;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

//@SpringBootTest
class TestSpringBootAppApplicationTests {

	@Test
	void animalNoise() {

		Animal dog = new Dog();
		dog.name = "Rover";
		dog.makeString();
		Animal cat = new Cat();
		Animal snake = new Snake();

		PetOwnerService petOwnerService = new PetOwnerService();
		petOwnerService.havePetMakeNoise(dog);
		petOwnerService.havePetMakeNoise(cat);
		petOwnerService.havePetMakeNoise(snake);

//		dog.makeNoise();
//		cat.makeNoise();

	}

	@Test
	public void contactTest() {

		Customer alex = new Customer();
		alex.setName("Alex");
		alex.setAddress("some Address");
		alex.setEmailAddress("some email Address");
		alex.setContactService(new EmailContactService());

		Customer seth = new Customer();
		seth.setName("Seth");
		seth.setAddress("actual real address");
		seth.setEmailAddress("email we won't use");
		seth.setContactService(new PostalContactService());

		ArrayList<Customer> customerArrayList = new ArrayList<>();
		customerArrayList.add(alex);
		customerArrayList.add(seth);

		for (Customer c : customerArrayList) {
			c.getContactService().contactCustomer();
		}



	}

}
