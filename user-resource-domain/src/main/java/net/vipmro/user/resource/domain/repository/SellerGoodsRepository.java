package net.vipmro.user.resource.domain.repository;

import net.vipmro.user.resource.domain.model.po.SellerGoods;

/**
 * @author lh
 */
public interface SellerGoodsRepository extends CrudRepository<SellerGoods,Long> {
	SellerGoods findSellerGoods(String goodsNo, Integer status, Integer isShow, Integer channel);
}
