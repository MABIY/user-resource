package net.vipmro.user.resource.infrastructure.repository;

import net.vipmro.user.resource.domain.model.po.Goods;
import net.vipmro.user.resource.domain.repository.GoodsRepository;
import net.vipmro.user.resource.infrastructure.mapper.GoodsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * @author: liuHua
 * @create: 2018-10-30 13:23
 **/
@Repository
public class GoodsRepositoryImpl implements GoodsRepository {
	
	@Autowired
	GoodsMapper goodsMapper;
	
	@Override
	public Goods find(Long id) {
		return goodsMapper.selectByPrimaryKey(id);
	}
	
	@Override
	public void delete(Long aLong) {
	
	}
	
	@Override
	public int save(Goods goods) {
		return 0;
	}
	
	@Override
	public Goods findByGoodsNo(String goodsNo) {
		return goodsMapper.selectByGoodsNo(goodsNo);
	}
	
}
