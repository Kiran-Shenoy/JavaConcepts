package collections;

import java.util.ArrayList;
import java.util.Collections;

class Student extends Object implements Comparable
{
	private String name;
	private int id;
	private int age;
	
	public Student(String name,int id,int age)
	{
		this.name=name;
		this.id=id;
		this.age=age;
	}
	

	public String getName() {
		return name;
	}


	public int getId() {
		return id;
	}


	public int getAge() {
		return age;
	}
	
	public String toString()
	{
		return name+" "+id+" "+age;
	}


	@Override
	public int compareTo(Object o) {
        Student s=(Student) o;
		return this.name.compareTo(s.name);
	}
	
}

public class LaunchComparable {

	public static void main(String[] args) {
		Student s1=new Student("kiran", 1, 24);
		Student s2=new Student("shenoy", 2, 25);
		Student s3=new Student("ramesh", 3, 26);
		Student s4=new Student("veena", 4, 27);
		
		
		ArrayList al=new ArrayList();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		
		System.out.println(al);
		
		Collections.sort(al);
		for(Object x:al)
		{
			System.out.println(x);
		}
		
		System.out.println("-------------sort using name----------");
		Collections.sort(al);
		for(Object x:al)
		{
			System.out.println(x);
		}
		
		
		
		
		

	}

}
