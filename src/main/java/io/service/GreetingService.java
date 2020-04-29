package io.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.model.Greeting;
import io.repository.GreetingRepository;
@Service
public class GreetingService implements IGreetingService {
	
	@Autowired
	private GreetingRepository greetingRepository;
	

	@Override
	public Greeting save(Greeting greeting) {
		return greetingRepository.save(greeting);
	}

	@Override
	public Greeting one(Integer greetingId) throws RuntimeException {
		return greetingRepository.findById(greetingId).orElseThrow(()-> new RuntimeException("No Message is available"));
	}

	@Override
	public void update(Integer greetingId, Greeting greeting) {
		Greeting persitent=one(greetingId);
		persitent.setMessage(greeting.getMessage());
		greetingRepository.save(persitent);
	}

	@Override
	public void delete(Integer greetingId) {
		greetingRepository.deleteById(greetingId);
	}

	@Override
	public List<Greeting> all() {
		return greetingRepository.findAll();
	}

}
