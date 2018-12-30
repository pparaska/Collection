package com.capgemini;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class MyClass implements Serializable {
	private int id;
	private String name;
	private double salary;

	public MyClass(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public MyClass() {
	}

	public void main(ArrayList<MyClass> arrayList)
			throws FileNotFoundException, IOException {
		ObjectOutputStream objectOutput = new ObjectOutputStream(
				new FileOutputStream("C:/Work/MyClass.txt"));
		objectOutput.writeObject(arrayList);
		objectOutput.close();
	}

	public ArrayList<MyClass> read() throws IOException, ClassNotFoundException {
		ObjectInputStream objectoutpitStream = new ObjectInputStream(
				new FileInputStream("C:/Work/MyClass.txt"));
		ArrayList<MyClass> myClass = (ArrayList<MyClass>) objectoutpitStream
				.readObject();
		objectoutpitStream.close();
		return myClass;

	}

	@Override
	public String toString() {
		return "MyClass [id=" + id + ", name=" + name + ", salary=" + salary
				+ "]";
	}

}
