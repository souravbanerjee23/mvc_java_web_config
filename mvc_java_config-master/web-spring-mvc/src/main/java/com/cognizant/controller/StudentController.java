package com.cognizant.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cognizant.model.Student;
import com.cognizant.service.StudentService;

@Controller
public class StudentController {
	@Autowired
	private StudentService studentService;
	
	public void setStuentService(StudentService studentService)
	{
		this.studentService = studentService;
	}

	@RequestMapping(value="insert", method=RequestMethod.GET)
	public ModelAndView insertPage()
	{
		 ModelAndView mv = new ModelAndView();
		 mv.setViewName("insert");
		 return mv;
		
	}
	
	@RequestMapping(value="insert", method=RequestMethod.POST)
	public ModelAndView insert(@ModelAttribute("student") Student s)
	{
		ModelAndView mv = new ModelAndView();
		studentService.insert(s.getId(),s.getName());
		mv.addObject("msg", "Record Inserted");
		mv.setViewName("insert");
		return mv;
	}
	
	
	
	@RequestMapping(value="update", method=RequestMethod.GET)
	public ModelAndView updatePage(@RequestParam("id") String s)
	{
		ModelAndView mv = new ModelAndView();
		mv.addObject("id",s);
		mv.setViewName("update");
		return mv;
	}
	
	@RequestMapping(value="update", method=RequestMethod.POST)
	public ModelAndView update(@ModelAttribute("student") Student s)
	{
		ModelAndView mv = new ModelAndView();
		studentService.update(s.getId(),s.getName());
		mv.addObject("msg", "Record Updated");
		mv.setViewName("display");
		return displayPage();
	}
	
	@RequestMapping(value="delete", method=RequestMethod.GET)
	public ModelAndView deletePage(@RequestParam("id") String id)
	{
		ModelAndView mv = new ModelAndView();
		studentService.delete(id);
		mv.addObject("msg", "Record Deleted");
		
		mv.setViewName("display");
		return displayPage();
	}
	
	/*@RequestMapping(value="delete", method=RequestMethod.POST)
	public ModelAndView delete(@RequestParam("id") String id)
	{
		ModelAndView mv = new ModelAndView();
		studentService.delete(id);
		mv.addObject("msg", "Record Deleted");
		mv.setViewName("delete");
		return mv;
	}*/
	
	@RequestMapping(value="display", method= RequestMethod.GET)
	public ModelAndView displayPage()
	{
		ModelAndView mv = new ModelAndView();
		List<Student> li = studentService.getAll();
		
		mv.addObject("list", li);
		mv.setViewName("display");
		return mv;	}
	
	
}
