package com.github.alicewu.dao.impl;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.github.alicewu.HibernateUtil;
import com.github.alicewu.dao.QuoteDao;
import com.github.alicewu.domain.Quote;

public class QuoteDaoImpl extends BaseDaoImpl<Quote> implements QuoteDao {

	public QuoteDaoImpl() {
		super(Quote.class);
	}

	public Quote getLastQuote() {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();

		Query query = session.createQuery("from " + Quote.class.getName()
				+ " order by time");
		query.setMaxResults(1);
		Quote quote = (Quote) query.list().get(0);
		session.flush();
		session.close();
		return quote;
	}

}
 
