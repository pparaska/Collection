package com.capgemini.test;

import static org.junit.Assert.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;
import com.capgemini.MyClass;

public class MyClassTest {
	private MyClass myClass1, myClass2, myClass3, myClass4, myClass5;
	private ArrayList<MyClass> arrayList;

	@Before
	public void setUp() {
		myClass1 = new MyClass(101, "Poonam", 10000);
		myClass2 = new MyClass(102, "Archana", 20000);
		myClass3 = new MyClass(103, "Kanak", 30000);
		myClass4 = new MyClass(104, "Yash", 40000);
		myClass5 = new MyClass(105, "Unnati", 50000);

		arrayList = new ArrayList<MyClass>();
		arrayList.add(myClass1);
		arrayList.add(myClass2);
		arrayList.add(myClass3);
		arrayList.add(myClass4);
		arrayList.add(myClass5);

	}

	@Test
	public void test() throws FileNotFoundException, IOException {
		MyClass myclass = new MyClass();
		myclass.main(arrayList);

	}

	@Test
	public void test2() throws ClassNotFoundException, IOException {
		MyClass myClass = new MyClass();
		ArrayList<MyClass> myArrayList = myClass.read();
		System.out.println(myClass.read());
	}

}
