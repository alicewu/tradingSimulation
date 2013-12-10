package com.github.alicewu.dao;

import com.github.alicewu.domain.Quote;
 
public interface QuoteDao extends BaseDao<Quote> {
	
	Quote getLastQuote();

}
