package com.vn.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import com.vn.entities.User;
import com.vn.utils.HibernateUtils;

public class UserDAOImpl implements UserDAO {

	static SessionFactory factory = HibernateUtils.buildSessionFactory();

	@SuppressWarnings("unchecked")
	@Override
	public List<User> getAll() {
		List<User> list = null;
		try {
			// 1 Load factory
			factory = HibernateUtils.buildSessionFactory();

			// 2. Create session
			Session session = factory.openSession();

			// 3. Create Query from session
			javax.persistence.Query query = session.createQuery("From User");

			// 4. Execute Query (3);
			list = (List<User>) query.getResultList();
			session.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public User create(User user) {
		Session session = null;
		Transaction transaction = null;
		try {
			session = factory.openSession();
			transaction = session.beginTransaction();
			session.save(user);

			transaction.commit();
			session.close();
			return user;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public User update(User user) {
		Session session = null;
		Transaction transaction = null;
		try {
			session = factory.openSession();
			transaction = session.beginTransaction();
			session.saveOrUpdate(user);

			transaction.commit();
			session.close();
			return user;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public User delete(User user) {
		Session session = null;
		Transaction transaction = null;
		try {
			session = factory.openSession();
			transaction = session.beginTransaction();
			session.delete(user);

			transaction.commit();
			session.close();
			return user;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
