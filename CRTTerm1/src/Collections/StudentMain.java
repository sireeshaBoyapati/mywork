package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentMain {

	public static void main(String[] args)
	{	
		//Creating list object for Student
			List<Student> student = new ArrayList<>();	
			//Inserting data into the list
			Student s1 = new Student(1,"Vivek","9492901301","Mbbs");
			Student s2 = new Student(2,"Vivek1","9492901302","Java");
			Student s3 = new Student(3,"Vivek2","9492901303","Ruby");
	        student.add(s1);
	        student.add(s2);
	        student.add(s3);     
	                
	        // for each loop displays data in the list
	        for(Student stu : student)
	        {
	        	stu.display();
	        	System.out.println();
	        }
		}
	}


