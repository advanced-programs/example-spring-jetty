package zx.soft.example.model;

import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.map.annotate.JsonSerialize;

import zx.soft.example.utils.CustomObjectSerializer;

@XmlRootElement
@JsonSerialize(using = CustomObjectSerializer.class)
public class User {

	private long id;

	private String name;

	private int age;

	public User() {
		super();
	}

	public User(long id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

}
