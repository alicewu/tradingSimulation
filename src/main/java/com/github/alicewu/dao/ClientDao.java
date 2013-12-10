package com.github.alicewu.dao;
 
import com.github.alicewu.domain.Client;

public interface ClientDao extends BaseDao<Client> {
	
	Client findByEmail(String email);
	
	Client findById(int id);

}
