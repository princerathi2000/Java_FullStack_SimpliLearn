package com.softwareacademy.dao;

import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.softwareacademy.dto.Subject;
import com.softwareacademy.util.SessionFactoryManagerImpl;


public class SubjectDaoImpl implements SubjectDao{
	
private SessionFactory factory;
	
	public SubjectDaoImpl() {
		factory= new SessionFactoryManagerImpl().getSessionFactory();
	}
	
	@Override
	public Integer addSubject(Subject Subject) {
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		Integer customerId=(Integer) session.save(Subject);
		transaction.commit();
		session.close();
		return customerId;
	}

	public void updateSubject(int SubjectId, String address) {
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		
		Subject subject=session.get(Subject.class,SubjectId);
		if(subject!=null)
		{
			subject.setSubjectName("Geography");
			session.update(subject);
			System.out.println(subject);
		}
		else
		{
			System.out.println("No Field found");
		}
		transaction.commit();
		session.close();
		
	}

	public void deleteSubject(int SubjectId) {
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		
		Subject subject=session.get(Subject.class,SubjectId);
		session.delete(subject);
		System.out.println("Deleted Successfully");
		transaction.commit();
		session.close();
		
	}

	public Subject searchSubject(int SubjectId) {
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		
		Subject subject=session.get(Subject.class,SubjectId);

		transaction.commit();
		session.close();
		
		return subject;
	}

	public Set<Subject> getAllSubjects() {
		// TODO Auto-generated method stub
		return null;
	}

}
