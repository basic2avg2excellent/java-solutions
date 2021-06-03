package utility.input;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public final class EmployeeDetails {
	
	private EmployeeDetails() {
		throw new IllegalStateException("EmployeeDetails class");
	}
	
	public static List<Employee> getEmployeeDetailsArrayList(){
		List<Employee> listOfEmployees = new ArrayList<>();
		listOfEmployees.add(new Employee(ArrayInput.EMPLOYEE_IDS[0], "Gautam", "Raj", "Gautam.Raj@quintiles.com", null));
		listOfEmployees.add(new Employee(ArrayInput.EMPLOYEE_IDS[10], "Hritik", "Roshan", "HritikRoshan@hero.com", null));
		listOfEmployees.add(new Employee(ArrayInput.EMPLOYEE_IDS[9], "Sonu", "Singh", "SonuSingh@developer.com", null));
		listOfEmployees.add(new Employee(ArrayInput.EMPLOYEE_IDS[1], "John", "Abraham", "JohnAbraham@bollywood.com", null));
		listOfEmployees.add(new Employee(ArrayInput.EMPLOYEE_IDS[8], "Sachin", "Tendulkar", "SachinTendulkar@cricket.com", null));
		listOfEmployees.add(new Employee(ArrayInput.EMPLOYEE_IDS[2], "Donald", "Trump", "DonaldTrump@usa.com", null));
		listOfEmployees.add(new Employee(ArrayInput.EMPLOYEE_IDS[7], "Narendra", "Modi", "NarendraModi@india.com", null));
		listOfEmployees.add(new Employee(ArrayInput.EMPLOYEE_IDS[3], "Amit", "Shah", "AmitShah@bjp.com", null));
		listOfEmployees.add(new Employee(ArrayInput.EMPLOYEE_IDS[6], "Yogi", "Ji", "YogiJi@minister.com", null));
		listOfEmployees.add(new Employee(ArrayInput.EMPLOYEE_IDS[4], "Rahul", "Gandhi", "RahulGandhi@pappu.com", null));
		listOfEmployees.add(new Employee(ArrayInput.EMPLOYEE_IDS[5], "Priyanka", "GandhiVadra", "PriyankaGandhiVadra@bewkoof.com", null));
		return listOfEmployees;
	}
	
	public static List<Employee> getEmployeeDetailsLinkedList(){
		List<Employee> listOfEmployees = new LinkedList<>();
		listOfEmployees.add(new Employee(ArrayInput.EMPLOYEE_IDS[0], "Gautam", "Raj", "Gautam.Raj@quintiles.com", null));
		listOfEmployees.add(new Employee(ArrayInput.EMPLOYEE_IDS[10], "Hritik", "Roshan", "HritikRoshan@hero.com", null));
		listOfEmployees.add(new Employee(ArrayInput.EMPLOYEE_IDS[9], "Sonu", "Singh", "SonuSingh@developer.com", null));
		listOfEmployees.add(new Employee(ArrayInput.EMPLOYEE_IDS[1], "John", "Abraham", "JohnAbraham@bollywood.com", null));
		listOfEmployees.add(new Employee(ArrayInput.EMPLOYEE_IDS[8], "Sachin", "Tendulkar", "SachinTendulkar@cricket.com", null));
		listOfEmployees.add(new Employee(ArrayInput.EMPLOYEE_IDS[2], "Donald", "Trump", "DonaldTrump@usa.com", null));
		listOfEmployees.add(new Employee(ArrayInput.EMPLOYEE_IDS[7], "Narendra", "Modi", "NarendraModi@india.com", null));
		listOfEmployees.add(new Employee(ArrayInput.EMPLOYEE_IDS[3], "Amit", "Shah", "AmitShah@bjp.com", null));
		listOfEmployees.add(new Employee(ArrayInput.EMPLOYEE_IDS[6], "Yogi", "Ji", "YogiJi@minister.com", null));
		listOfEmployees.add(new Employee(ArrayInput.EMPLOYEE_IDS[4], "Rahul", "Gandhi", "RahulGandhi@pappu.com", null));
		listOfEmployees.add(new Employee(ArrayInput.EMPLOYEE_IDS[5], "Priyanka", "GandhiVadra", "PriyankaGandhiVadra@bewkoof.com", null));
		return listOfEmployees;
	}
	
	public static List<Employee> getEmployeeDuplicateRecords(){
		List<Employee> listOfEmployees = new ArrayList<>();
		listOfEmployees.add(new Employee(ArrayInput.EMPLOYEE_IDS[0], "Gautam", "Raj", "Gautam.Raj@quintiles.com", null));
		listOfEmployees.add(new Employee(ArrayInput.EMPLOYEE_IDS[10], "Hritik", "Roshan", "HritikRoshan@hero.com", null));
		listOfEmployees.add(new Employee(ArrayInput.EMPLOYEE_IDS[9], "Sonu", "Singh", "SonuSingh@developer.com", null));
		listOfEmployees.add(new Employee(ArrayInput.EMPLOYEE_IDS[1], "John", "Abraham", "JohnAbraham@bollywood.com", null));
		listOfEmployees.add(new Employee(ArrayInput.EMPLOYEE_IDS[8], "Sachin", "Tendulkar", "SachinTendulkar@cricket.com", null));
		listOfEmployees.add(new Employee(ArrayInput.EMPLOYEE_IDS[2], "Donald", "Trump", "DonaldTrump@usa.com", null));
		listOfEmployees.add(new Employee(ArrayInput.EMPLOYEE_IDS[7], "Narendra", "Modi", "NarendraModi@india.com", null));
		listOfEmployees.add(new Employee(ArrayInput.EMPLOYEE_IDS[8], "Sachin", "Tendulkar", "SachinTendulkar@cricket.com", null));
		listOfEmployees.add(new Employee(ArrayInput.EMPLOYEE_IDS[6], "Yogi", "Ji", "YogiJi@minister.com", null));
		listOfEmployees.add(new Employee(ArrayInput.EMPLOYEE_IDS[9], "Sonu", "Singh", "SonuSingh@developer.com", null));
		listOfEmployees.add(new Employee(ArrayInput.EMPLOYEE_IDS[7], "Narendra", "Modi", "NarendraModi@india.com", null));
		return listOfEmployees;		
	}
	
}