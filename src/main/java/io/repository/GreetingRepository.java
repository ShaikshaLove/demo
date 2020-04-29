package io.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.model.Greeting;

@Repository
public interface GreetingRepository  extends JpaRepository<Greeting, Integer>{

}
