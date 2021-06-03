package utility.input;

import java.io.Serializable;

public class Employee implements Serializable{
	//Read about it again, why it is usable. sonar rule (squid:S4926)
	private static final long serialVersionUID = 3111360285116881521L;

	private Integer employeeId;
	
	private String empFirstName;
	
	private String empLastName;
	
	//Implement regular expression
	private String empEmailId;
	
	private Address address;

	public Employee(Integer employeeId, String empFirstName, String empLastName, String empEmailId, Address address) {
		this.employeeId = employeeId;
		this.empFirstName = empFirstName;
		this.empLastName = empLastName;
		this.empEmailId = empEmailId;
		this.address = address;
	}

	public Integer getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmpFirstName() {
		return empFirstName;
	}

	public void setEmpFirstName(String empFirstName) {
		this.empFirstName = empFirstName;
	}

	public String getEmpLastName() {
		return empLastName;
	}

	public void setEmpLastName(String empLastName) {
		this.empLastName = empLastName;
	}

	public String getEmpEmailId() {
		return empEmailId;
	}

	public void setEmpEmailId(String empEmailId) {
		this.empEmailId = empEmailId;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
}