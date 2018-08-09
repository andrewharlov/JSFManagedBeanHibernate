package com.harlov.hibernate;

import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

@ManagedBean (name = "dBRequestHandler", eager = true)
@SessionScoped
public class DBRequestHandler {
	private ArrayList<User> users;
	
	public DBRequestHandler() {
		this.users = new ArrayList<User>();
	}
	
	public String searchUsers() {
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(User.class)
								.addAnnotatedClass(Role.class)
								.addAnnotatedClass(TimeZone.class)
								.addAnnotatedClass(UserConfig.class)
								.buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		try {
			session.beginTransaction();
			this.users = (ArrayList<User>) session.createQuery("from User").getResultList();
			for(User user : users) {
				System.out.println(user);
			}
			session.getTransaction().commit();
		}finally {
			factory.close();
		}
		
		return "success";
	}
	
	public ArrayList<User> getUsers() {
		return users;
	}
}
