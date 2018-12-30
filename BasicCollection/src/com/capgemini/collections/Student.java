package com.capgemini.collections;

public class Student implements Comparable<Student> {

	private String name;
	private String favoriteFruit;

	public Student() {

	}

	public Student(String name, String favoriteFruit) {
		super();
		this.name = name;
		this.favoriteFruit = favoriteFruit;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((favoriteFruit == null) ? 0 : favoriteFruit.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (favoriteFruit == null) {
			if (other.favoriteFruit != null)
				return false;
		} else if (!favoriteFruit.equals(other.favoriteFruit))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", favoriteFruits=" + favoriteFruit
				+ "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFavoriteFruits() {
		return favoriteFruit;
	}

	public void setFavoriteFruits(String favoriteFruits) {
		this.favoriteFruit = favoriteFruits;
	}

	@Override
	public int compareTo(Student student) {
		return name.compareTo(student.name);
	}

}
