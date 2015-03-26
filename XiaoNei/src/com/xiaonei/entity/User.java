package com.xiaonei.entity;

import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity(name = "User")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "userid")
	private long userId;
	
	@Column(name = "username", nullable=false)
	private String userName;
	
	@Column(name = "password", nullable = false)
	private String password;
	
	@Column(name = "email", nullable = false)
	private String email;
	
	@Column(name = "phone", nullable = false)
	private long phone;
	
	@Column(name = "school", nullable = false)
	private String school;
	
	@Column(name = "major", nullable = false)
	private String major;
	
	@Column(name = "authority", nullable = false)
	private int authority = 0;
	
	@Column(name = "cent", nullable = false)
	private long cent = 0;
	
	@Column(name = "population", nullable = false)
	private long population = 0;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "registerdate", nullable=false)
	private Date registerDate;
	
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name="user_rings",
		joinColumns=@JoinColumn(name="userid"),
		inverseJoinColumns=@JoinColumn(name="ringid"))
	private Set<Ring> rings;
	
	@ManyToMany
	@JoinTable(name="user_friends",
		joinColumns=@JoinColumn(name="userid"),
		inverseJoinColumns=@JoinColumn(name="friendid")
	)
	private Set<User> friends;

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public int getAuthority() {
		return authority;
	}

	public void setAuthority(int authority) {
		this.authority = authority;
	}

	public long getCent() {
		return cent;
	}

	public void setCent(long cent) {
		this.cent = cent;
	}

	public long getPopulation() {
		return population;
	}

	public void setPopulation(long population) {
		this.population = population;
	}

	public Date getRegisterDate() {
		return registerDate;
	}

	public void setRegisterDate(Date registerDate) {
		this.registerDate = registerDate;
	}


	public Set<Ring> getRings() {
		return rings;
	}

	public void setRings(Set<Ring> rings) {
		this.rings = rings;
	}

	public Set<User> getFriends() {
		return friends;
	}

	public void setFriends(Set<User> friends) {
		this.friends = friends;
	}
	
	

}
