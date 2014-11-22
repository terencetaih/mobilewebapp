package com.mobileweb.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Subscriber generated by hbm2java
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
@Table(name = "SessionUser", catalog = "billisticUI")
public class SessionUser implements java.io.Serializable {

	@JsonProperty("SESSION_ID")
	private String sessionId;
	@JsonProperty("userId")
	private Integer userId;
	@JsonProperty("username")
	private String userName;
	@JsonProperty("CREATED_AT")
	private Date createdAt;

	public SessionUser() {

	}

	public SessionUser(String sessionId, Integer userId, String userName, Date createdAt) {
		this.sessionId = sessionId;
		this.userId = userId;
		this.userName = userName;
		this.createdAt = createdAt;
	}

	@Id
	@Column(name = "sessionId", unique = true, nullable = false)
	public String getSessionId() {
		return sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	@Column(name = "userId", length = 45)
	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	@Column(name = "userName", length = 45)
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "createdAt", length = 19)
	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

}