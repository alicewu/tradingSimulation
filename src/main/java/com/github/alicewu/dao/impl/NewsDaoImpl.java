package com.github.alicewu.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.github.alicewu.HibernateUtil;
import com.github.alicewu.dao.NewsDao;
import com.github.alicewu.domain.News;

public class NewsDaoImpl extends BaseDaoImpl<News> implements NewsDao {
	
	public NewsDaoImpl() {
		super(News.class);
	}

	public News getById(int id) {
		SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        
        News news = (News) session.get(News.class, id);
        session.close();
        return news;
	}

}
 
