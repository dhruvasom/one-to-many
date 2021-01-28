package my_group.one_to_many;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;
@Entity
public class Person {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int id;
	private String name;
	@OneToMany(mappedBy = "person")
	private List<Address> address;
	public Person() {
		this.address=new ArrayList<Address>();
	}
	public Person(int id, String name, List<Address> address) {
		this();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	public Person(int id, String name) {
		this();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Address> getAddress() {
		return address;
	}
	public void setAddress(List<Address> address) {
		this.address = address;
	}

}
