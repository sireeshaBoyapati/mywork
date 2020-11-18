package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import model.Student;

@Repository
public class StudentDao {
	
	@Autowired
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;		
	}
	
	public void insertStud(Student student){
		
		Session session = sessionFactory.getCurrentSession();
		System.out.println("Records Inserted");
		session.save(student);      //inserting data to the table
			
	}
	public List<Student> displayStudent(){
		
		Session session = sessionFactory.getCurrentSession();
		List<Student> list = session.createQuery("from Student").list(); //fetching data from the table using HQl language
		 return list;
		
	}

}
