package service;

import java.util.List;

//import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.StudentDao;
import model.Student;

@Service
public class StudentService {
	
	@Autowired						//autowire using annotations
	private StudentDao studDao;
	@org.springframework.transaction.annotation.Transactional
	public void insertStudent(Student student){		
		studDao.insertStud(student);		//calling dao class
	}
	@org.springframework.transaction.annotation.Transactional
	public List<Student> displayStudent(){
		
		List<Student> list = studDao.displayStudent();   //dao called
		 return list;
		
	}

}
