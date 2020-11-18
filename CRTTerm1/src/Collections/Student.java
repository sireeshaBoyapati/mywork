package Collections;

class Student 
{
	int RegNo;
	String Name,Phone,Course;
	
   //parameterised constructor
   public Student(int regNo, String name, String phone, String course) {
		super();
		RegNo = regNo;
		Name = name;
		Phone = phone;
		Course = course;
	}
   // to display the elements
   public void display(){
   	System.out.println("RegNo=" + RegNo + " \nName=" + Name + " \nPhone=" + Phone + " \nCourse=" + Course + "\n");
   }
}
