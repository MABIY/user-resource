package net.vipmro.user.resource.infrastructure.mapper;

import net.vipmro.user.resource.domain.model.po.SellerGoods;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SellerGoodsMapper {
	int deleteByPrimaryKey(Long id);
	
	int insert(SellerGoods record);
	
	SellerGoods selectByPrimaryKey(Long id);
	
	List<SellerGoods> selectAll();
	
	int updateByPrimaryKey(SellerGoods record);
	
	
	SellerGoods selectByGoodsNoAndStatusAndIsShowAndChannel(@Param("goodsNo") String goodsNo, @Param("status") int status, @Param("isShow") int isShow, @Param("channel") int channel);
}