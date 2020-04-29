package io.service;

import java.util.List;

import io.model.Greeting;

public interface IGreetingService {
   Greeting save(Greeting greeting);
   Greeting one(Integer greetingId);
   void update(Integer greetingId,Greeting greeting);
   void delete(Integer greetingId);
   List<Greeting> all();
}
