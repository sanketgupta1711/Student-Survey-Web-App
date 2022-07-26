package com.example.demo.controller;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import java.util.List;


import com.example.demo.model.Students;
import com.example.demo.repository.StudentRepository;

@RestController
@RequestMapping(value="/webapi/studentSurvey/", method = { RequestMethod.GET, RequestMethod.POST })
public class StudentController {
	
	@Autowired
	private StudentRepository studentRepository;
	
	//get all students
	@GetMapping(value="/records",  produces = { "application/json" })
	public List<Students> getAllStudents()
	{	
		/*Session session = null;
		@SuppressWarnings("unchecked")
		List<Students> listOfRecords = null;
		try {
			session = getSession();
			Transaction tx = session.beginTransaction();

			Query q = session.createQuery("from Students order by recent_date desc");
			listOfRecords = q.list();

			//tx.commit();
		} catch (HibernateException e) {
			System.out.println("Failed");
			session.disconnect();
			session.close();
		}

		if (session != null) {
			session.disconnect();
			session.close();
		}
		System.out.println(listOfRecords);*/
		//return listOfRecords;
		return studentRepository.findAll();
	}
	
	@PostMapping("/surveyEntry")
	public Students createStudent(@RequestBody Students s1) {
		return studentRepository.save(s1);
	}
/*	@PostMapping("/surveyEntry")
	public Students createStudentSurveyEntry(Students s1) {
		Session session = null;
		try {
			if (s1!=null) {
				System.out.print(s1.getStudentID());
			}
			session = getSession();
			Transaction tx = session.beginTransaction();
			session.save(s1);
			tx.commit();
		} catch (Exception e) {
			System.out.println(e + "error");
			session.disconnect();
			session.close();
			return null;
		}

		if (session != null) {
			session.disconnect();
			session.close();
		}

		return s1;
	}*/
	private Session getSession() {
		Configuration cfg = new Configuration().configure().addAnnotatedClass(Students.class);

		ServiceRegistry reg = new StandardServiceRegistryBuilder().applySettings(cfg.getProperties()).build();

		SessionFactory sf = cfg.buildSessionFactory(reg);

		Session session = sf.openSession();

		return session;
	}


}
