package com.softwareacademy.dao;

import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.softwareacademy.dto.Teacher;
import com.softwareacademy.util.SessionFactoryManagerImpl;


public class TeacherDaoImpl implements TeacherDao{

	private SessionFactory factory;
	
	public TeacherDaoImpl() {
		factory=new SessionFactoryManagerImpl().getSessionFactory();
	}
	
	public Integer addTeacher(Teacher Teacher) {
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		Integer teacher=(Integer) session.save(Teacher);
		transaction.commit();
		session.close();
		return teacher;
	}

	public void updateTeacher(int TeacherId, String address) {
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		
		Teacher teacher=session.get(Teacher.class,TeacherId);
		if(teacher!=null)
		{
			teacher.setTeacherName("Ayush");
			session.update(teacher);
			System.out.println(teacher);
		}
		else
		{
			System.out.println("No Field found");
		}
		transaction.commit();
		session.close();
		
	}

	public void deleteTeacher(int TeacherId) {
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		
		Teacher teacher=session.get(Teacher.class,TeacherId);
		session.delete(teacher);
		System.out.println("Deleted Successfully");
		transaction.commit();
		session.close();
		
	}

	public Teacher searchTeacher(int TeacherId) {
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		
		Teacher teacher=session.get(Teacher.class,TeacherId);

		transaction.commit();
		session.close();
		
		return teacher; 
	}

	public Set<Teacher> getAllTeachers() {
		// TODO Auto-generated method stub
		return null;
	}

}
