package DataStructure;

import java.util.*;
import java.util.Map.*;

class Student {
	private int id;
	private String name;
	public int getId() {
		return id;
	}
	
	public Student(int i, String s) {
		this.id = i;
		this.name = s;
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
}

public class tryHashMap {
	
	public static HashMap<Integer, Student> buildMap(Student[] stu) {
		HashMap<Integer, Student> hmap = new HashMap<Integer, Student>();
		
		for (int i=0; i<stu.length; i++) {
			hmap.put(stu[i].getId(), stu[i]	);
		}
		return hmap;
	}
	
	public static void main (String[] args) {
		HashMap<Integer, Student> hm = new HashMap<Integer, Student>();
		Student mary = new Student(1, "Mary");
		Student jim = new Student(2, "Jim");
		Student ben = new Student(3, "Ben");
		
		Student[] students = new Student[3];
		students[0] = mary;
		students[1] = jim;
		students[2] = ben;
		
		hm = buildMap(students);
		
		System.out.println(hm.size());
		
		
		for (Entry<Integer, Student> ent : hm.entrySet()) {
			System.out.println(ent.getKey() + " - " + ent.getValue().getName());
		}
	}
}
