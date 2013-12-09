package com.github.alicewu.dao.impl;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.github.alicewu.HibernateUtil;
import com.github.alicewu.dao.ClientDao;
import com.github.alicewu.domain.Client;

public class ClientDaoImpl extends BaseDaoImpl<Client> implements ClientDao {
	
	public ClientDaoImpl() {
		super(Client.class);
	}

	public Client findByEmail(String email) {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		
		Query query = session.createQuery("from " + Client.class.getName() + " where email = :email");
        query.setParameter("email", email);
        Client client = (Client) query.list().get(0);
        session.flush();
		session.close();
		return client;
	}

	public Client findById(int id) {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		Client client = (Client) session.get(Client.class, id);
		session.flush();
		session.close();
		return client;
	}

}
