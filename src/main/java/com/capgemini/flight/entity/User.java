package com.capgemini.flight.entity;

import java.math.BigInteger;
/**
 * 
 * The {@code User} class represents the details regarding login and it's its user type in Booking system.
 * @author Indla Mahesh
 *
 */

public class User {

	private String userType;
	private BigInteger userId;
	private String userName;
	private String userPassword;

	public User() {
		super();

	}

	/**
	 * 
	 * @param userType
	 * @param userId
	 * @param userName
	 * @param userPassword
	 */
	
	/**
	 * Parameterized Constructor :  It is a code that initializes instance variable.
	 *
	 */
	public User(String userType, BigInteger userId, String userName, String userPassword) {
		super();
		this.userType = userType;
		this.userId = userId;
		this.userName = userName;
		this.userPassword = userPassword;

	}

	  /**
	    * 
	    * getters and Setters are used for binding data.
	    */
	public String getUserType() {
		return userType;
	}

	public BigInteger getUserId() {
		return userId;
	}

	public String getUserName() {
		return userName;
	}

	public String getUserPassword() {
		return userPassword;
	}
	/**
     *Method Name : toString
     *             This is used to override the toString() method.
     *@return String
     *
     */

	@Override
	public String toString() {
		return "\nuserType : " + userType + "\nuserId : " + userId + "\nuserName : " + userName;
	}

}
