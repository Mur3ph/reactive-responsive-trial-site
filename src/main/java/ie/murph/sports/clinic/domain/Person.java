package ie.murph.sports.clinic.domain;

import java.util.Date;

public class Person {

	private String firstName;
	private String lastName;
	private int age;
	private String place;
	private Date dateOfBirth;
	private String email;
	private String password;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(this.getFirstName()).append(", ").append(this.getLastName()).append(", ").append(this.getPlace())
				.append(", ").append(this.getAge());

		return builder.toString();
	}

	//@Override
	public String toString1() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", place=" + place
				+ ", dateOfBirth=" + dateOfBirth + ", email=" + email + ", password=" + password + "]";
	}

	
}
