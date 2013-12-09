package com.github.alicewu.dao;

import com.github.alicewu.domain.News;

public interface NewsDao extends BaseDao<News> {
	
	News getById(int id);

}
