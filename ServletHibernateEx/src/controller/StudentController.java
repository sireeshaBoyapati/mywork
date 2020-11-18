package controller;

import java.lang.reflect.Method;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import model.Student;
import service.StudentService;

@Controller
public class StudentController {
	
	@Autowired
	private StudentService studService;//auto wiring the bean using annotations
	
	@RequestMapping(value="/insert")   //the request from the browser is mapped to the method
	public void insertStud(@ModelAttribute("student")Student student){	
		
		ModelAndView mv = new ModelAndView();
		studService.insertStudent(student);      //calling service class
		mv.setViewName("Success.jsp");           //creating view
		//pushing all the objects to the view
		mv.addObject("RegNo",student.getRegNo());
		mv.addObject("Sname",student.getSname());
		mv.addObject("CourseName",student.getCourseName());
		mv.addObject("Location",student.getLocation());
		mv.addObject("Score",student.getScore());
			
	}
	
	@RequestMapping(value="/display")
	public List<Student> displayStudent(){
		
		List<Student> list = studService.displayStudent();
		ModelAndView mv = new ModelAndView();
		mv.setViewName("StudentData.jsp");
		mv.addObject("list",list);
		return list;
		
	}
	
	

}

