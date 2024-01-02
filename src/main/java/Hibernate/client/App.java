package Hibernate.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import Hibernate.entity.Employee;
import Hibernate.util.HibernateConfig;

public class App {

	public static void main(String[] args) {
		Employee vikas = new Employee();
//		vikas.setId(4);
		vikas.setName("kunal");
		vikas.setGender("Male");
		vikas.setSalary(12222);
		
		SessionFactory sf = HibernateConfig.getSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		
		Employee e = session.get(Employee.class, 2);
		System.out.println(e);
		session.save(vikas);
		tx.commit();
		
	}

}
