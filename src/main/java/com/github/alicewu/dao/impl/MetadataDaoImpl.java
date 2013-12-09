package com.github.alicewu.dao.impl;

import com.github.alicewu.dao.MetadataDao;
import com.github.alicewu.domain.Metadata;

public class MetadataDaoImpl extends BaseDaoImpl<Metadata> implements MetadataDao {
	
	public MetadataDaoImpl() {
		super(Metadata.class);
	}

}
