package com.treselle.main;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.*;
import com.treselle.bean.*;

/**
*Author Balaji.D
*/

public class EmployeeDetail {
	
	public static void main(String[] args) {
		
		List<Employee> employees=new ArrayList<Employee>();
		
		employees.add(new Employee(7845,"Balaji","Java Developer",22,8000));
		employees.add(new Employee(7654,"Gowtham","Devops",27,48000));
		employees.add(new Employee(7214,"Roop","Selenium",28,45000));
		employees.add(new Employee(7658,"Raj","QA",29,40000));
		employees.add(new Employee(7511,"Abhi","Business Analyst",29,31000));
		employees.add(new Employee(7821,"Kowshal","NodeJS",21,8000));
		employees.add(new Employee(7231,"Mani","Admin",34,28000));
		
		//Using lambda expression sorting employees in descendind order based on their Employee id
		employees.sort((Employee o1,Employee o2)->-o1.getEmpId()-o2.getEmpId());
		
		//Iterating each element in the employees object
		employees.stream().forEach(str->System.out.println(str));
		
	}
}