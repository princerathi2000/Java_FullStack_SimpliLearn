package com.softwareacademy.service;

import java.util.Set;

import com.softwareacademy.dao.TeacherDao;
import com.softwareacademy.dao.TeacherDaoImpl;
import com.softwareacademy.dto.Teacher;


public class TeacherServiceImpl implements TeacherService{

	private TeacherDao dao=null;
	
	public TeacherServiceImpl() {
		dao=new TeacherDaoImpl();
	}
	
	public Integer addTeacher(Teacher Teacher) {
		return dao.addTeacher(Teacher);
	}

	public void updateTeacher(int TeacherId, String address) {
		dao.updateTeacher(TeacherId, address);
		
	}

	public void deleteTeacher(int TeacherId) {
		dao.deleteTeacher(TeacherId);
		
	}

	public Teacher searchTeacher(int TeacherId) {
		// TODO Auto-generated method stub
		return dao.searchTeacher(TeacherId);
	}

	public Set<Teacher> getAllTeachers() {
		// TODO Auto-generated method stub
		return dao.getAllTeachers();
	}

}
