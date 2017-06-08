package hibernate;

import java.util.Date;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class UserTest1 {
	public static void main(String[] args) throws Exception {
		Configuration cfg = new Configuration().configure();
		SessionFactory factory = cfg.buildSessionFactory();

		Session session = factory.openSession();
		session.beginTransaction();

		User user = new User();
		user.setName("π‹¿Ì‘±3");
		user.setPassword("admin");
		user.setCreateTime(new Date());
		user.setExpireTime(new Date());

		session.save(user);
		session.getTransaction().commit();
		if (session.isOpen()) {
			session.close();
		}
	}

}
