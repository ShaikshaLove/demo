package io.dto;

public class Response implements java.io.Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Response() {
		super();
	}

	public Response(String message) {
		super();
		this.message = message;
	}
	

}
