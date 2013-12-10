package com.github.alicewu.dao;
 
import com.github.alicewu.domain.MarketState;

public interface MarketStateDao extends BaseDao<MarketState> {
	
	MarketState getCurrentMarketState();
	

}
