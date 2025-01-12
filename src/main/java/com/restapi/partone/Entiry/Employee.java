package com.restapi.partone.Entiry;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employee {

	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	Long ID;
	
	String name;
	
	String designation;
	
	double salary;
	
	int experiance;
	
	Employee() {}
	
	public Employee(String name, String designation, double salary, int experiance) {
		this.name = name;
		this.designation = designation;
		this.salary = salary;
		this.experiance = experiance;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDesignation() {
		return designation;
	}
	
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public int getExperiance() {
		return experiance;
	}
	
	public void setExperiance(int experiance) {
		this.experiance = experiance;
	}
	
	@Override
	public String toString() {
		return "Employee [ID=" + ID + ", name=" + name + ", designation=" + designation + ", salary=" + salary
				+ ", experiance=" + experiance + "]";
	}
	
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Employee))
			return false;

		Employee e = (Employee) obj;
		return Objects.equals(ID, e.ID) && Objects.equals(name, e.name) && Objects.equals(designation, e.designation)
				&& Objects.equals(salary, e.salary) && Objects.equals(experiance, e.experiance);

	}
	
	public int hashCode() {
		return Objects.hash(ID, name, designation, salary, experiance);
	}
	
	
	
}
