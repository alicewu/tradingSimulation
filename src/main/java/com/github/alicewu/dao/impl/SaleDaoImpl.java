package com.github.alicewu.dao.impl;
 
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.github.alicewu.HibernateUtil;
import com.github.alicewu.dao.SaleDao;
import com.github.alicewu.domain.MarketOrder;
import com.github.alicewu.domain.Quote;
import com.github.alicewu.domain.Sale;

public class SaleDaoImpl extends BaseDaoImpl<Sale> implements SaleDao {

	public SaleDaoImpl() {
		super(Sale.class);
	}

	public List<Sale> findByClient(int id) {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();

		Query query = session.createQuery("FROM " + Sale.class.getName()
				+ " WHERE buyerId = :id OR sellerId = :id");
		query.setParameter("id", id);
		List<Sale> sales = query.list();
		session.flush();
		session.close();
		return sales;
	}

}
