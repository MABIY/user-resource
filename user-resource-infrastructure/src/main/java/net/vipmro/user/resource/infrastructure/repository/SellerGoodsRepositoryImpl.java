package net.vipmro.user.resource.infrastructure.repository;

import net.vipmro.user.resource.domain.model.po.SellerGoods;
import net.vipmro.user.resource.domain.repository.SellerGoodsRepository;
import net.vipmro.user.resource.infrastructure.mapper.SellerGoodsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * @author: liuHua
 * @create: 2018-10-30 13:19
 **/
@Repository
public class SellerGoodsRepositoryImpl implements SellerGoodsRepository {
	
	@Autowired
	SellerGoodsMapper sellerGoodsMapper;
	
	@Override
	public SellerGoods find(Long id) {
		return sellerGoodsMapper.selectByPrimaryKey(id);
	}
	
	@Override
	public void delete(Long aLong) {
	
	}
	
	@Override
	public int save(SellerGoods sellerGoods) {
		return 0;
	}
	
	@Override
	public SellerGoods findSellerGoods(String goodsNo, Integer status, Integer isShow, Integer channel) {
		return sellerGoodsMapper.selectByGoodsNoAndStatusAndIsShowAndChannel(goodsNo, status, isShow, channel);
	}
	
}
