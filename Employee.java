/**
 * Jacob Sauer (updated many variable names)
 * @version     1.1                 (current version number of program)
 *
 */

public class Employee
{
    private String fullName;
    private String address;
    private String phoneNumber;
    private String hireDate;
    private String salary;
    
    public Employee ()
    {
	fullName = "John Smith";
	address = "123 Main Street";
	phoneNumber = "(306) 555-1234";
	hireDate = "01/01/2019";
	salary = "$50000";
    }

    public String getFullName()
    {
        return this.fullName;
    }

    public void setFullName(String name)
    {
        this.fullName = name;
    }

    public String getAddress()
    {
        return this.address;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    public String getPhoneNumber()
    {
        return this.address;
    }

    public void setPhoneNumber(String number)
    {
        this.phoneNumber = number;
    }

    public String getHireDate()
    {
        return this.hireDate;
    }

    public void setHireDate(String date)
    {
        this.hireDate = date;
    }

     public String getSalary()
    {
        return this.salary;
    }

    public void setSalary(String salary)
    {
        this.salary = salary;
    }

    public void printEmployeeData()
    {
        System.out.format(
            "Full Name: %s | Address: %s| Phone Number: %s|" +
            " Hire Date: %s| Salary: %s \n",
            this.fullName,
            this.address,
            this.phoneNumber,
            this.hireDate,
            this.salary);
    }
}
