package net.vipmro.user.resource.domain.repository;

import net.vipmro.user.resource.domain.model.po.Goods;

/**
 * @author lh
 */
public interface GoodsRepository extends CrudRepository<Goods,Long> {
	
	Goods findByGoodsNo(String goodsNo);
}
