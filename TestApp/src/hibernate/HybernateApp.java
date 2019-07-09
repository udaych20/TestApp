package hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class HybernateApp {
	public static void main(String[] args) {
		Student s = new Student(1, "Uday", "Hyd");
		Student s1 = new Student(2, "Kumar", "Chn");

		Transaction t = null;

		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			t = session.beginTransaction();
			session.save(s);
			session.save(s1);

			t.commit();

		} catch (Exception e) {
			if (t != null) {
				t.rollback();
			}
			e.printStackTrace();
		}
		
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			List resultList = session.createQuery("ROM Student").list();
			 System.out.println(resultList);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
