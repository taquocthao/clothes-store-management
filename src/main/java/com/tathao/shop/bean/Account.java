
/**
 * @author taquocthao
 */
package com.tathao.shop.bean;

/**
 * @author taquocthao
 */
public class Account {

    /** account id.*/
    private int id;
    /** person id.*/
    private int personId;
    /** user name.*/
    private String username;
    /** password.*/
    private String password;
    
    /**
     * Constructor account class.
     * @param id
     * @param personId
     * @param username
     * @param password
     */
    public Account(int id, int personId, String username, String password) {
        this.id = id;
        this.personId = personId;
        this.username = username;
        this.password = password;
    }
    /**
     * @return the id.
     */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the personId
	 */
	public int getPersonId() {
		return personId;
	}

	/**
	 * @param personId the personId to set
	 */
	public void setPersonId(int personId) {
		this.personId = personId;
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
