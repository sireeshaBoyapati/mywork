package LinkedList;

public class Employee 
{
   int empId;
   String eName;
   String phone;
   int salary;
   
	public Employee() {
		super();
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		salary = salary;
	}

	public Employee(int empId, String eName, String phone, int salary) {
		super();
		this.empId = empId;
		this.eName = eName;
		this.phone = phone;
		this.salary = salary;
	}
	
   public void display()
   {
	   System.out.println("EmpId="+empId + ", eName=" + eName + ", phone=" + phone + ", salary=" + salary );
   }
   
}
