package com.capgemini.collection.test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import org.junit.Test;

import com.capgemini.collections.Car;
import com.capgemini.collections.CellPhone;
import com.capgemini.collections.Laptop;
import com.capgemini.collections.School;
import com.capgemini.collections.Television;
import com.capgemini.collections.Student;

public class CollectionsTest {

	@Test
	public void testForListOfLaptop() {

		Laptop laptop1 = new Laptop("Hp", "Pavilion", "Windows10", "Inteli7");
		Laptop laptop2 = new Laptop("Dell", "Inspiron557", "Windows10",
				"Inteli7");
		Laptop laptop3 = new Laptop("Acer", "AspireE17", "Windows8", "Inteli5");

		List<Object> list = new ArrayList<Object>();
		list.add(laptop1);
		list.add(laptop2);
		list.add(laptop3);
		String actual = list.toString();
		String expected = "[Laptop [company=Hp, model=Pavilion, operatingSystem=Windows10, processor=Inteli7], Laptop [company=Dell, model=Inspiron557, operatingSystem=Windows10, processor=Inteli7], Laptop [company=Acer, model=AspireE17, operatingSystem=Windows8, processor=Inteli5]]";
		assertEquals(expected, actual);
	}

	@Test
	public void testForCheckingDuplicatesInLaptop() {
		Laptop laptop1 = new Laptop("Hp", "Pavilion", "Windows10", "Inteli7");
		Laptop laptop2 = new Laptop("Dell", "Inspiron557", "Windows10",
				"Inteli7");
		Laptop laptop3 = new Laptop("Hp", "Pavilion", "Windows10", "Inteli7");

		HashSet<Object> hashSet = new HashSet<Object>();
		hashSet.add(laptop1);
		hashSet.add(laptop2);
		hashSet.add(laptop3);
		String actual = hashSet.toString();
		String expected = "[Laptop [company=Dell, model=Inspiron557, operatingSystem=Windows10, processor=Inteli7], Laptop [company=Hp, model=Pavilion, operatingSystem=Windows10, processor=Inteli7]]";
		assertEquals(expected, actual);

	}

	@Test
	public void testforListOfCar() {

		Car car1 = new Car("Suzuki", "Dezire", 2012, 500000);
		Car car2 = new Car("Honda", "City", 2015, 600000);
		Car car3 = new Car("Hyndai", "Verna", 2017, 800000);

		List<Object> list = new ArrayList<Object>();
		list.add(car1);
		list.add(car2);
		list.add(car3);
		String actual = list.toString();
		String expected = "[Car [make=Suzuki, model=Dezire, year=2012, price=500000], Car [make=Honda, model=City, year=2015, price=600000], Car [make=Hyndai, model=Verna, year=2017, price=800000]]";
		assertEquals(expected, actual);

	}

	@Test
	public void testForCheckingDuplicatesIncar() {

		Car car1 = new Car("Suzuki", "Dezire", 2012, 500000);
		Car car2 = new Car("Suzuki", "Dezire", 2012, 500000);
		Car car3 = new Car("Hyndai", "Verna", 2017, 800000);

		HashSet<Object> hashSet = new HashSet<Object>();
		hashSet.add(car1);
		hashSet.add(car2);
		hashSet.add(car3);
		String actual = hashSet.toString();
		String expected = "[Car [make=Suzuki, model=Dezire, year=2012, price=500000], Car [make=Hyndai, model=Verna, year=2017, price=800000]]";
		assertEquals(expected, actual);

	}

	@Test
	public void testForTreeSetOfCar() {

		Car car1 = new Car("Suzuki", "Dezire", 2012, 500000);
		Car car2 = new Car("Honda", "City", 2015, 600000);
		Car car3 = new Car("Hyndai", "Verna", 2017, 800000);
		TreeSet<Object> treeSet = new TreeSet<Object>();
		treeSet.add(car1);
		treeSet.add(car2);
		treeSet.add(car3);
		String actual = treeSet.toString();
		String expected = "[Car [make=Honda, model=City, year=2015, price=600000], Car [make=Hyndai, model=Verna, year=2017, price=800000], Car [make=Suzuki, model=Dezire, year=2012, price=500000]]";
		assertEquals(expected, actual);

	}

	@Test
	public void testForListOfTelevision() {

		Television television1 = new Television("Hitachi", "LCD", false, 55000);
		Television television2 = new Television("Samsung", "LED", false, 60000);
		Television television3 = new Television("Sony", "Plasma", true, 45000);
		List<Object> list = new ArrayList<Object>();
		list.add(television1);
		list.add(television2);
		list.add(television3);
		String actual = list.toString();
		String expected = "[Television [company=Hitachi, type=LCD, price=55000, is3Denabled=false], Television [company=Samsung, type=LED, price=60000, is3Denabled=false], Television [company=Sony, type=Plasma, price=45000, is3Denabled=true]]";
		assertEquals(expected, actual);
	}

	@Test
	public void testForCheckingDuplicatesInTelevision() {

		Television television1 = new Television("Hitachi", "LCD", false, 55000);
		Television television2 = new Television("Samsung", "LED", false, 60000);
		Television television3 = new Television("Samsung", "LED", false, 60000);

		HashSet<Object> hashSet = new HashSet<Object>();
		hashSet.add(television1);
		hashSet.add(television2);
		hashSet.add(television3);
		String actual = hashSet.toString();
		String expected = "[Television [company=Hitachi, type=LCD, price=55000, is3Denabled=false], Television [company=Samsung, type=LED, price=60000, is3Denabled=false]]";
		assertEquals(expected, actual);

	}

	@Test
	public void testForListOfCellPhone() {

		CellPhone cellPhone1 = new CellPhone("OnePlus", "6T", "60mpx",
				"Android9", 420000);
		CellPhone cellPhone2 = new CellPhone("Samsung", "s9", "anti-radiant",
				"Android10", 35000);
		CellPhone cellPhone3 = new CellPhone("Vivo", "v9", "25Mp Camera",
				"Android8", 25000);

		List<Object> list = new ArrayList<Object>();
		list.add(cellPhone1);
		list.add(cellPhone2);
		list.add(cellPhone3);
		String actual = list.toString();
		String expected = "[CellPhone [company=OnePlus, model=6T, description=60mpx, operatingSystems=Android9, price=420000], CellPhone [company=Samsung, model=s9, description=anti-radiant, operatingSystems=Android10, price=35000], CellPhone [company=Vivo, model=v9, description=25Mp Camera, operatingSystems=Android8, price=25000]]";
		assertEquals(expected, actual);
	}

	@Test
	public void testForCheckingDuplicatesInCellPhone() {

		CellPhone cellPhone1 = new CellPhone("OnePlus", "6T", "60mpx",
				"Android9", 420000);
		CellPhone cellPhone2 = new CellPhone("OnePlus", "6T", "60mpx",
				"Android9", 420000);
		CellPhone cellPhone3 = new CellPhone("OnePlus", "6T", "60mpx",
				"Android9", 420000);

		HashSet<Object> hashSet = new HashSet<Object>();
		hashSet.add(cellPhone1);
		hashSet.add(cellPhone2);
		hashSet.add(cellPhone3);
		String actual = hashSet.toString();
		String expected = "[CellPhone [company=OnePlus, model=6T, description=60mpx, operatingSystems=Android9, price=420000]]";
		assertEquals(expected, actual);

	}

	@Test
	public void testForListOfSchool() {

		School school1 = new School("Terna", "Mumbai", "Thane", 2);
		School school2 = new School("NorthPoint", "Pune", "Pune", 1);
		School school3 = new School("Merrys", "Thane", "Thane", 3);
		List<Object> list = new ArrayList<Object>();
		list.add(school1);
		list.add(school2);
		list.add(school3);
		String actual = list.toString();
		String expected = "[School [name=Terna, city=Mumbai, District=Thane, greatSchoolRanking=2], School [name=NorthPoint, city=Pune, District=Pune, greatSchoolRanking=1], School [name=Merrys, city=Thane, District=Thane, greatSchoolRanking=3]]";
		assertEquals(expected, actual);
	}

	@Test
	public void testForCheckingDuplicatesInSchool() {

		School school1 = new School("Terna", "Mumbai", "Thane", 2);
		School school2 = new School("Terna", "Mumbai", "Thane", 2);
		School school3 = new School("Merrys", "Thane", "Thane", 3);

		HashSet<Object> hashSet = new HashSet<Object>();
		hashSet.add(school1);
		hashSet.add(school2);
		hashSet.add(school3);
		String actual = hashSet.toString();
		String expected = "[School [name=Terna, city=Mumbai, District=Thane, greatSchoolRanking=2], School [name=Merrys, city=Thane, District=Thane, greatSchoolRanking=3]]";
		assertEquals(expected, actual);

	}

	@Test
	public void testForArrayListOfStudents() {
		ArrayList<Object> arrayList = new ArrayList<Object>();
		arrayList.add(new Student("Poonam", "Mango"));
		arrayList.add(new Student("Archana", "Guava"));
		arrayList.add(new Student("Shital", "Banana"));
		String actual = arrayList.toString();
		String expected = "[Student [name=Poonam, favoriteFruits=Mango], Student [name=Archana, favoriteFruits=Guava], Student [name=Shital, favoriteFruits=Banana]]";
		assertEquals(expected, actual);
	}

	@Test
	public void testForTreeSetOfStudents() {
		TreeSet<Object> treeSet = new TreeSet<Object>();
		treeSet.add(new Student("Poonam", "Mango"));
		treeSet.add(new Student("Archana", "Guava"));
		treeSet.add(new Student("Shital", "Banana"));
		String actual = treeSet.toString();
		String expected = "[Student [name=Archana, favoriteFruits=Guava], Student [name=Poonam, favoriteFruits=Mango], Student [name=Shital, favoriteFruits=Banana]]";
		assertEquals(expected, actual);
	}

	@Test
	public void testForMapOfStudent() {

		Map<String, Student> map = new HashMap<>();
		map.put("Poonam", new Student("Poonam", " Mango"));
		map.put("Archana", new Student("Archana", "Guava"));
		map.put("Shital", new Student("Shital", "Banana"));
		map.put("Govind", new Student("Govind", "Mango"));
		String actual = map.toString();
		String expected = "{Shital=Student [name=Shital, favoriteFruits=Banana], Govind=Student [name=Govind, favoriteFruits=Mango], Poonam=Student [name=Poonam, favoriteFruits= Mango], Archana=Student [name=Archana, favoriteFruits=Guava]}";
		assertEquals(expected, actual);

	}

	@Test
	public void testForFavoriteFruitByNameOfStudent() {

		Map<String, Student> map = new HashMap<>();
		map.put("Poonam", new Student("Poonam", " Mango"));
		map.put("Archana", new Student("Archana", "Guava"));
		map.put("Shital", new Student("Shital", "Banana"));
		map.put("Govind", new Student("Govind", "Mango"));
		String actual = map.get("Poonam").toString();
		String expected = "Student [name=Poonam, favoriteFruits= Mango]";
		assertEquals(expected, actual);

	}

}
