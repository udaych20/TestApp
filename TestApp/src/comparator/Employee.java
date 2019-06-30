package comparator;

import java.io.Serializable;

public class Employee implements Serializable/* , Comparable<Employee> */{
	
	
	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	private static final long serialVersionUID = -7952173866121159197L;
	private int eno;
	public Employee(int eno, String name, String salary) {
		super();
		this.eno = eno;
		this.name = name;
		this.salary = salary;
	}
	private String name;
	private String salary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Employee [eno=" + eno + ", name=" + name + ", salary=" + salary + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((salary == null) ? 0 : salary.hashCode());
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
		Employee other = (Employee) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (salary == null) {
			if (other.salary != null)
				return false;
		} else if (!salary.equals(other.salary))
			return false;
		return true;
	}
	
	/*
	 * @Override public int compareTo(Employee emp) { if(this.eno == emp.eno) {
	 * return 0; }else if(this.eno > emp.eno) { return 1; } return -1;
	 * 
	 * }
	 */
	
	
	

}
