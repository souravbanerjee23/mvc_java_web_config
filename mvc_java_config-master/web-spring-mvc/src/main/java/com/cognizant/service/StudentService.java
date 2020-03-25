package com.cognizant.service;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.dao.StudentDao;
import com.cognizant.dao.StudentDaoImpl;
import com.cognizant.model.*;

@Service
public class StudentService {
	
	private List<Student> list = new ArrayList<Student>();
	
	@Autowired
	StudentDaoImpl studentDaoImpl;
	
	public void setStudentDaoImpl(StudentDaoImpl studentDaoImpl)
	{
		this.studentDaoImpl = studentDaoImpl;
	}
	public void insert(String id, String name)
	{
		//String id = request.getParameter("id");
		//String name = request .getParameter("name");
		
		Student st = new Student(id,name);
		
		System.out.println(st);
		//list.add(st);
		studentDaoImpl.insert(st);
	}
	
	public void update(String id, String name)
	{
		//String find = request.getParameter("id");
		
		//String id = find;
		//String name = request.getParameter("name");
		
		Student e = new Student(id,name);
		
		/*Student s=null;
		if(( s = getByID(find))!=null)
		{
			list.remove(s);
		}
		
		list.add(e);*/
		studentDaoImpl.update(e);
	}
	
	
	public void delete(String id)
	{
		//String find = request.getParameter("id");
		
		studentDaoImpl.delete(id);
		
		/*if(( s = getByID(find))!=null)
		{
			list.remove(s);
		}*/
		
	}
	
	public List<Student> getAll()
	{
		
		
		for(Student s :list)
		{
			System.out.println(s);
		}
		
		
		List<Student> list = studentDaoImpl.getAll();
		return list;
	}
	
	public Student getByID(String id)
	{
		for(Student s : list)
		{
			if(id.equals(s.getId()))
			{
				return s;
			}
		}
		
		return null;
	}

}
