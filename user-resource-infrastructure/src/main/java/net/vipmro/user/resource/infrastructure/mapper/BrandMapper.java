package net.vipmro.user.resource.infrastructure.mapper;

import net.vipmro.user.resource.domain.model.po.Brand;

import java.util.List;

public interface BrandMapper {
	int deleteByPrimaryKey(Integer id);
	
	int insert(Brand record);
	
	Brand selectByPrimaryKey(Integer id);
	
	List<Brand> selectAll();
	
	int updateByPrimaryKey(Brand record);
}