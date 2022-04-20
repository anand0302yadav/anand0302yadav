package com.java.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class DemoExample {

	public static String name;
	public final int age= 30;
	
}

class Employee implements Comparable<Employee>{
	
	private String name,dept;
	private Double salary;
	
	public Employee(String name,String dept,Double salary) {
		
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return - this.salary.compareTo(o.getSalary());
		
	}
}

public class Demo{
	
	public static void main(String arg[]) {
		
		//reverse the words in a string.
		String Input = "My name , is vipin upman .";
		String Output = "upman vipin , is name My .";
		String[] arr = Input.split(" ");
		int i = 0;
		String temp;
		while(i < (arr.length) /2) {
			temp = arr[i];
			arr[i] = arr[arr.length -1 - i];
			arr[arr.length -1 - i] = temp;
			i++;
		}
		StringBuilder sb = new StringBuilder();
		for(int j =0;j< arr.length; j++) {
			
			sb.append(arr[j]);
			if(j != arr.length-1) {
				sb.append(" ");
			}
		}
		System.out.println(sb.toString());
		
		//swap two number without using third variable.
		int a = 10;
		int b = 20;
		a = a+b;
		b = a-b ;
		a = a-b;
		System.out.println(a+" "+b);
		
		List<Employee> emplist = new ArrayList<>();
		Employee emp1 = new Employee("A","Dept1",200.10);
		Employee emp2 = new Employee("A","Dept1",100.10);
		Employee emp3 = new Employee("A","Dept2",300.10);
		Employee emp4 = new Employee("A","Dept2",400.10);
		emplist.add(emp1);
		emplist.add(emp3);
		emplist.add(emp2);
		emplist.add(emp4);
		
		emplist.stream().collect(Collectors.groupingBy(Employee :: getDept,Collectors.toList())).entrySet().stream().map(x -> x.getValue()).sorted().forEach(x -> System.out.println(x.get(0).getSalary()));
		
		/*System.out.println(empmap);
		Iterator<Map.Entry<String, List<Employee>>> itr = empmap.entrySet().iterator();
		List<Employee> finallist = new ArrayList<Employee>();
		Map.Entry<String,List<Employee>> entry;
		List<Employee> sortedlist;
		while(itr.hasNext()) {
			entry = itr.next();
			sortedlist = entry.getValue();
			Collections.sort(sortedlist);
		
			finallist.add(entry.getValue().get(0));
			
			
		}
		
		finallist.forEach(x -> System.out.println("dept:"+x.getDept()+"  name:"+x.getName()+  " salary:"+x.getSalary()));
		*/
	}
	
	
}
