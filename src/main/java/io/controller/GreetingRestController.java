package io.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.model.Greeting;
import io.service.GreetingService;

@RestController
@RequestMapping("/greetings")
@CrossOrigin(origins = "*", allowedHeaders = "*",methods = {RequestMethod.DELETE,
		                 RequestMethod.GET,RequestMethod.PUT,RequestMethod.POST})
public class GreetingRestController {
	
	@Autowired
	private GreetingService greetingService;
	
	@PostMapping
	public Greeting save(@RequestBody Greeting greeting) {
		return greetingService.save(greeting);
	}
	
	@GetMapping
	public List<Greeting> all(){
		return greetingService.all();
	}
	
	@DeleteMapping("/{greetingId}")
	public String delete(@PathVariable Integer greetingId) {
		greetingService.delete(greetingId);
		return "The message has been deleted";
	}
	
	@PutMapping("/{greetingId}")
	public String update(@RequestBody Greeting greeting,@PathVariable Integer greetingId) {
		greetingService.update(greetingId, greeting);
		return "The message has been Updated";
	}
	
	@GetMapping("/{greetingId}")
	public Greeting one(@PathVariable Integer greetingId) {
		return greetingService.one(greetingId);
	}

}
