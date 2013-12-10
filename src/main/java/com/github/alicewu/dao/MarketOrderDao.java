package com.github.alicewu.dao;
 
import java.util.List;

import com.github.alicewu.domain.MarketOrder;

public interface MarketOrderDao extends BaseDao<MarketOrder> {

	List<MarketOrder> getByClient(int client);

	List<MarketOrder> getLimitBuys();

	List<MarketOrder> getLimitSells();

	List<MarketOrder> getMarketBuys();

	List<MarketOrder> getMarketSells();
	

}
