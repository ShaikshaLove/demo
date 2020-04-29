package io.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Greeting implements java.io.Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 10876555L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private Integer greetingId;
    private String message;
	public Integer getGreetingId() {
		return greetingId;
	}
	public void setGreetingId(Integer greetingId) {
		this.greetingId = greetingId;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Greeting() {
		super();
	}
}
