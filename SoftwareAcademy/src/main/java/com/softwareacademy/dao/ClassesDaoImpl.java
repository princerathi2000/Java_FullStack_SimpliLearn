package com.softwareacademy.dao;

import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.softwareacademy.dto.Classes;
import com.softwareacademy.util.SessionFactoryManagerImpl;


public class ClassesDaoImpl implements ClassesDao{

	private SessionFactory factory;
	
	public ClassesDaoImpl() {
		factory= new SessionFactoryManagerImpl().getSessionFactory();
	}
	
	public Integer addClasses(Classes classes) {
		// TODO Auto-generated method stub
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		Integer classId=(Integer) session.save(classes);
//		Integer customerId=(Integer) session.save(customer);
		transaction.commit();
		session.close();
		return classId;
	}

	public void updateClasses(int ClassesId, String address) {
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		
		Classes classes=session.get(Classes.class,ClassesId);
		if(classes!=null)
		{
			classes.setClassName("Higher School");
			session.update(classes);
			System.out.println(classes);
		}
		else
		{
			System.out.println("No Field found");
		}
		transaction.commit();
		session.close();
	}

	public void deleteClasses(int ClassesId) {
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		
		Classes classes=session.get(Classes.class,ClassesId);
		session.delete(classes);
		System.out.println("Deleted Successfully");
		transaction.commit();
		session.close();
		
	}

	public Classes searchClasses(int ClassesId) {
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		
		Classes classes=session.get(Classes.class,ClassesId);

		transaction.commit();
		session.close();
		
		return classes;
	}

	public Set<Classes> getAllClassess() {
		// TODO Auto-generated method stub
		return null;
	}

}
