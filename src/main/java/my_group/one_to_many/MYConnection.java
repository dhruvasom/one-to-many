package my_group.one_to_many;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
public class MYConnection {
	public static Session getSession() {
		return new Configuration().
				configure("hibernate.cfg.xml").
				buildSessionFactory().
				openSession();
	}
}
