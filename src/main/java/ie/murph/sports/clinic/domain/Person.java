package ie.murph.sports.clinic.domain;

public class Person {

	private String firstName;
	private String lastName;
	private int age;
	private String username;
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

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
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
		builder.append(this.getFirstName()).append(", ").append(this.getLastName()).append(", ")
				.append(", ").append(this.getAge());

		return builder.toString();
	}

	//@Override
	public String toString1() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age 
				 + ", email=" + email + ", password=" + password + "]";
	}

	
}
