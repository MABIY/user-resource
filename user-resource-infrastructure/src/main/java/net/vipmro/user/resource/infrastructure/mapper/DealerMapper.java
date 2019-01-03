package net.vipmro.user.resource.infrastructure.mapper;

import net.vipmro.user.resource.domain.model.po.Dealer;

import java.util.List;

public interface DealerMapper {
	int deleteByPrimaryKey(Integer id);
	
	int insert(Dealer record);
	
	Dealer selectByPrimaryKey(Integer id);
	
	List<Dealer> selectAll();
	
	int updateByPrimaryKey(Dealer record);
}