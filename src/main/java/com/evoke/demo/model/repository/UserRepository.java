package com.evoke.demo.model.repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.evoke.demo.model.User;

@Repository
public class UserRepository implements ObjRepository<User> {


	private Map<Integer, User> repository;
	
	public UserRepository() {
		this.repository = new HashMap<Integer, User>();
	}

	public void store(User t) {
		repository.put(t.getId(), t);
	}

	public User retrieve(int id) {
		return repository.get(id);
	}

	public User search(String name) {
		Collection<User> ts = repository.values();
		for(User t:ts) {
			if(t.getName().equalsIgnoreCase(name))
				return t;
		}
		return null;
	}

	public User delete(int id) {
		User u = repository.get(id);
		this.repository.remove(id);
		return u;
	}

}
