package com.softwareacademy.service;

import java.util.Set;

import com.softwareacademy.dao.SubjectDao;
import com.softwareacademy.dao.SubjectDaoImpl;
import com.softwareacademy.dto.Subject;


public class SubjectServiceImpl implements SubjectService{
	
	private SubjectDao dao=null;
	
	public SubjectServiceImpl() {
		dao=new SubjectDaoImpl();
	}
	
	@Override
	public Integer addSubject(Subject Subject) {
		return dao.addSubject(Subject);
	}

	public void updateSubject(int SubjectId, String address) {
		dao.updateSubject(SubjectId, address);
		
	}

	public void deleteSubject(int SubjectId) {
		dao.deleteSubject(SubjectId);
		
	}

	public Subject searchSubject(int SubjectId) {
		// TODO Auto-generated method stub
		return dao.searchSubject(SubjectId);
	}

	public Set<Subject> getAllSubjects() {
		// TODO Auto-generated method stub
		return dao.getAllSubjects();
	}

}
