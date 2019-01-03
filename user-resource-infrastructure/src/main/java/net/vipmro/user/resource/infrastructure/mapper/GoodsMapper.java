package net.vipmro.user.resource.infrastructure.mapper;

import net.vipmro.user.resource.domain.model.po.Goods;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GoodsMapper {
	int deleteByPrimaryKey(Long id);
	
	int insert(Goods record);
	
	Goods selectByPrimaryKey(Long id);
	
	List<Goods> selectAll();
	
	int updateByPrimaryKey(Goods record);
	
	Goods selectByGoodsNo(@Param("goodsNo") String goodsNo);
}