package com.evoke.demo;

import java.sql.SQLException;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.evoke.demo.model.User;
import com.evoke.demo.model.repository.UserRepository;

public class MainClass {

	public static void main(String[] args) throws SQLException {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.evoke.demo");
		context.refresh();

		UserRepository repository = context.getBean(UserRepository.class);

		repository.store(new User(1, "Karthik", "Vizag"));
		repository.store(new User(2, "Aishu", "Hyd"));
		repository.store(new User(3, "Sindhu", "Delhi"));

		User t = repository.retrieve(1);
		System.out.println(t);

		User Delhi = repository.search("Sindhu");
		System.out.println(Delhi);

		
		User Hyd = repository.delete(2);
		System.out.println(Hyd);

		context.close();

	}

}
