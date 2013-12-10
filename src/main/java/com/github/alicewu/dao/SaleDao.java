package com.github.alicewu.dao;
 
import java.util.List;

import com.github.alicewu.domain.Sale;

public interface SaleDao extends BaseDao<Sale> {

	List<Sale> findByClient(int id);
}
