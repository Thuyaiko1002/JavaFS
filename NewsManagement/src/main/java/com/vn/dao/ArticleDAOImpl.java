package com.vn.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import com.vn.entities.Article;
import com.vn.utils.HibernateUtils;

public class ArticleDAOImpl implements ArticleDAO {

	static SessionFactory factory = HibernateUtils.buildSessionFactory();

	@SuppressWarnings("unchecked")
	@Override
	public List<Article> getAll(){
		List<Article> list = null;
		try {
			// 1 Load factory
			factory = HibernateUtils.buildSessionFactory();

			// 2. Create session
			Session session = factory.openSession();

			// 3. Create Query from session
			javax.persistence.Query query = session.createQuery("From Article");

			// 4. Execute Query (3);
			list = (List<Article>) query.getResultList();
			session.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	@Override
	public Article create(Article article) {
		Session session = null;
		Transaction transaction = null;
		try {
			session = factory.openSession();
			transaction = session.beginTransaction();
			session.save(article);

			transaction.commit();
			session.close();
			return article;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Article update(Article article) {
		Session session = null;
		Transaction transaction = null;
		try {
			session = factory.openSession();
			transaction = session.beginTransaction();
			session.saveOrUpdate(article);

			transaction.commit();
			session.close();
			return article;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Article delete(Article article) {
		Session session = null;
		Transaction transaction = null;
		try {
			session = factory.openSession();
			transaction = session.beginTransaction();
			session.delete(article);

			transaction.commit();
			session.close();
			return article;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
