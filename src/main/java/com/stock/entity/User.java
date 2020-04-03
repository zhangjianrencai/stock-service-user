package com.stock.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class User implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GenericGenerator(name = "system-uuid", strategy = "uuid2")
	@GeneratedValue(generator = "system-uuid")
	private String id;
	@Column(nullable = false)
	private String userName;
	@Column(nullable = false)
	private String password;
	@Column(nullable = false)
	private char userType;
	@Column(nullable = false)
	private String email;
	@Column(nullable = false)
	private String mobileNumber;
	@Column(nullable = false)
	private char isConfirmed;
	@Temporal(TemporalType.TIMESTAMP)
	@Column(nullable = false)
	private Date lastLoginTs;
	@Temporal(TemporalType.TIMESTAMP)
	@Column(nullable = false)
	private Date createTs;
	@Temporal(TemporalType.TIMESTAMP)
	@Column(nullable = false)
	private Date lastUpdateTs;

	public User() {
		super();
	}
	
	public User(String id, String userName, String password, char userType, String email, String mobileNumber,
			char isConfirmed, Date lastLoginTs, Date createTs, Date lastUpdateTs) {
		super();
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.userType = userType;
		this.email = email;
		this.mobileNumber = mobileNumber;
		this.isConfirmed = isConfirmed;
		this.lastLoginTs = lastLoginTs;
		this.createTs = createTs;
		this.lastUpdateTs = lastUpdateTs;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public char getUserType() {
		return userType;
	}

	public void setUserType(char userType) {
		this.userType = userType;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public char getIsConfirmed() {
		return isConfirmed;
	}

	public void setIsConfirmed(char isConfirmed) {
		this.isConfirmed = isConfirmed;
	}

	public Date getLastLoginTs() {
		return lastLoginTs;
	}

	public void setLastLoginTs(Date lastLoginTs) {
		this.lastLoginTs = lastLoginTs;
	}

	public Date getCreateTs() {
		return createTs;
	}

	public void setCreateTs(Date createTs) {
		this.createTs = createTs;
	}

	public Date getLastUpdateTs() {
		return lastUpdateTs;
	}

	public void setLastUpdateTs(Date lastUpdateTs) {
		this.lastUpdateTs = lastUpdateTs;
	}
}
	


