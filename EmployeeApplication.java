
/**
 * @Trevor Douglas 190103730
 * @version     1.0                 (current version number of program)
 *
 */
import java.util.Scanner;

public class EmployeeApplication
{   
    public static void main(String[] args)
    {
	int dataSize = 3;
    	Employee[] employeeData = new Employee[dataSize];
	EmployeeApplication employeeApp = new EmployeeApplication();
	employeeApp.addEmployees(employeeData);
	employeeApp.printEmployees(employeeData);
	Employee[] sortedEmployees = new Employee[dataSize];
	sortedEmployees = employeeApp.sortEmployeesByName(employeeData, dataSize);
	employeeApp.printEmployees(sortedEmployees);	
    }
    
    
    public Employee[] sortEmployeesByName(Employee[] database, int databaseSize)
    {
        Employee[] sortedEmployees = database;
	
        for (int i = 1; i < databaseSize; i++)
	    {
		for (int j = 0; j < (databaseSize - i); j++)
		    {
			if (sortedEmployees[j].getFullName().compareTo(sortedEmployees[j+1].getFullName())>0)
			    {
				Employee temp = sortedEmployees[j+1];
				sortedEmployees[j+1] = sortedEmployees[j];
				sortedEmployees[j] = temp;
			    }
		    }
	    }
        return sortedEmployees;
    }
    
    public void addEmployees(Employee[] employeeData)
    {
	Scanner input = new Scanner(System.in);
	
	for (int i = 0; i < 3; ++i)
	    {
		employeeData[i] = new Employee();
		System.out.print("Enter an Employee's Full Name: ");
		String fullName = input.nextLine();
		System.out.print("Enter an Employee's Address: ");
		String address = input.nextLine();
		System.out.print("Enter an Employee's Phone Number: ");
		String phoneNumber = input.nextLine();
		System.out.print("Enter an Employee's Hire Date: ");
		String hireDate = input.nextLine();
		System.out.print("Enter an Employee's starting Salary: ");
		String salary = input.nextLine();

		employeeData[i].setFullName(fullName);
		employeeData[i].setAddress(address);
		employeeData[i].setPhoneNumber(phoneNumber);
		employeeData[i].setHireDate(hireDate);
		employeeData[i].setSalary(salary);
	    }
    }
    
    public void printEmployees(Employee[] employees)
    {
	System.out.println("");
	for (int i = 0; i < 3; ++i)
	    {
		employees[i].printEmployeeData();		
	    }
	
    }

}
