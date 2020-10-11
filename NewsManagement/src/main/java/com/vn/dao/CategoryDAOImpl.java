package com.vn.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import com.vn.entities.Category;
import com.vn.utils.HibernateUtils;

public class CategoryDAOImpl implements CategoryDAO {
	static SessionFactory factory = HibernateUtils.buildSessionFactory();

	@SuppressWarnings("unchecked")
	@Override
	public List<Category> getAll() {
		List<Category> list = null;
		try {
			// 1 Load factory
			factory = HibernateUtils.buildSessionFactory();

			// 2. Create session
			Session session = factory.openSession();

			// 3. Create Query from session
			javax.persistence.Query query = session.createQuery("From Category");

			// 4. Execute Query (3);
			list = (List<Category>) query.getResultList();
			session.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public Category create(Category category) {
		Session session = null;
		Transaction transaction = null;
		try {
			session = factory.openSession();
			transaction = session.beginTransaction();
			session.save(category);

			transaction.commit();
			session.close();
			return category;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Category update(Category category) {
		Session session = null;
		Transaction transaction = null;
		try {
			session = factory.openSession();
			transaction = session.beginTransaction();
			session.saveOrUpdate(category);

			transaction.commit();
			session.close();
			return category;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Category delete(Category category) {
		Session session = null;
		Transaction transaction = null;
		try {
			session = factory.openSession();
			transaction = session.beginTransaction();
			session.delete(category);

			transaction.commit();
			session.close();
			return category;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
