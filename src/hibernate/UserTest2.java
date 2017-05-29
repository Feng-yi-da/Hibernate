package hibernate;

import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class UserTest2 {
	public static void main(String[] args) throws Exception {
		Configuration cfg = new Configuration().configure();
		SessionFactory factory = cfg.buildSessionFactory();
		
		Session session = factory.openSession();
		session.beginTransaction();
		
		Query query = session.createQuery("from User");
		List users = query.list();
		for (Iterator iter = users.iterator(); iter.hasNext();) {
			User user = (User) iter.next();
			System.out.println("user name = "+user.getName());
			System.out.println(user.getAll());
		}
		
		session.getTransaction().commit();
		if(session.isOpen()){
			session.close();
		}
	}


}
