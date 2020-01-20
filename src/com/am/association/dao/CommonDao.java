package com.am.association.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.am.association.entity.Company;
import com.am.association.entity.State;
import com.am.association.entity.Team;

public class CommonDao {

	
	
	public void save(Team team) {
			Configuration configuration = new Configuration();
			configuration.configure("prop.xml");
			SessionFactory sessionFactory = configuration.buildSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();
			session.save(team);
			transaction.commit();
	}
	
	
	public void saveStateDetails(State state) {
			Configuration configuration = new Configuration();
			configuration.configure("prop.xml");
			SessionFactory sessionFactory = configuration.buildSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();
			session.save(state);
			transaction.commit();
	}
	
	public void saveCompanyDetails( Company comapany)  {
		Configuration configuration = new Configuration();
		configuration.configure("prop.xml");
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(comapany);
		transaction.commit();
}
	
}
