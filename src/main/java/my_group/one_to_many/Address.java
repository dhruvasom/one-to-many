package my_group.one_to_many;

import javax.persistence.*;

@Entity
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int id;
	private String doorNo,street,city,state;
	@ManyToOne
	private Person person;
	public Address() {
		
	}
	public Address(int id, String doorNo, String street, String city, String state, Person person) {
		super();
		this.id = id;
		this.doorNo = doorNo;
		this.street = street;
		this.city = city;
		this.state = state;
		this.person = person;
	}
	public Address(String doorNo, String street, String city, String state, Person person) {
		super();
		this.doorNo = doorNo;
		this.street = street;
		this.city = city;
		this.state = state;
		this.person = person;
	}
	public Address(String doorNo, String street, String city, String state) {
		super();
		this.doorNo = doorNo;
		this.street = street;
		this.city = city;
		this.state = state;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDoorNo() {
		return doorNo;
	}
	public void setDoorNo(String doorNo) {
		this.doorNo = doorNo;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}

}
