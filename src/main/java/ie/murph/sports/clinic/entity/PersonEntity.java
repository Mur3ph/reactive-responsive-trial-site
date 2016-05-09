package ie.murph.sports.clinic.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "person")
public class PersonEntity implements Serializable{

  private static final long serialVersionUID = -1801714432822866390L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long person_id;
  
  @Column(name="first_name", nullable = false)
  private String firstName;
  
  @Column(name="last_name", nullable = false)
  private String lastName;
  
  private int age;
  
  private String username;
  
  private String email;
  
  private String password;
  
  public PersonEntity(){}
  
  //protected PersonEntity(){}
  
  public PersonEntity(String firstName, String lastName, int age, String email, String password, String username){
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
    this.username = username;
    this.email = email;
    this.password = password;
  }

  public long getId() {
    return person_id;
  }

  public void setId(long id) {
    this.person_id = id;
  }

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

public String toString(){
	    StringBuilder builder = new StringBuilder();
	    builder.append(this.getId()).append(", ")
	      .append(this.getFirstName()).append(", ")
	      .append(this.getLastName()).append(", ")
	      .append(this.getEmail()).append(", ")
	      .append(this.getAge());
	    
	    return builder.toString();
	  }
}
