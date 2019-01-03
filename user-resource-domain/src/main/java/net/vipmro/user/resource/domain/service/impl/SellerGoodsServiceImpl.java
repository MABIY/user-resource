package net.vipmro.user.resource.domain.service.impl;

import net.vipmro.user.resource.commons.enums.ResultCode;
import net.vipmro.user.resource.commons.exceptions.BusinessException;
import net.vipmro.user.resource.domain.model.dto.CategoryDTO;
import net.vipmro.user.resource.domain.model.dto.GoodsDTO;
import net.vipmro.user.resource.domain.model.po.Brand;
import net.vipmro.user.resource.domain.model.po.Category;
import net.vipmro.user.resource.domain.model.po.Goods;
import net.vipmro.user.resource.domain.repository.BrandRepository;
import net.vipmro.user.resource.domain.repository.CategoryRepository;
import net.vipmro.user.resource.domain.repository.GoodsRepository;
import net.vipmro.user.resource.domain.repository.SellerGoodsRepository;
import net.vipmro.user.resource.domain.service.SellerGoodsSerivce;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: liuHua
 * @create: 2018-10-30 11:15
 **/

@Service
public class SellerGoodsServiceImpl implements SellerGoodsSerivce {
	
	@Autowired
	SellerGoodsRepository sellerGoodsRepository;
	
	@Autowired
	GoodsRepository goodsRepository;
	
	@Autowired
	CategoryRepository categoryRepository;
	
	@Autowired
	BrandRepository brandRepository;
	
	@Override
	public GoodsDTO getGoodTDO(String goodsNo) {
		Goods goods = goodsRepository.findByGoodsNo(goodsNo);
		if (goods == null) {
			throw new BusinessException(ResultCode.GOODS_NOT_EXIST);
		}
		Category category = categoryRepository.find(goods.getCateId());
		Brand brand = brandRepository.find(goods.getBrandId());
		
		String unit = StringUtils.isNotBlank(goods.getMeasure()) ? goods.getMeasure() : "个";
		
		CategoryDTO categoryDTO = CategoryDTO.builder()
				.id(category.getId())
				.code(category.getCateNo())
				.name(category.getName())
				.parentId(category.getParentId())
				.build();
		
		return GoodsDTO.builder()
				.id(goods.getId())
				.number(goods.getGoodsNo())
				.name(goods.getTitle())
				.outerCode(goods.getBuyNo())
				.category(categoryDTO)
				.unit(unit)
				.brandName(brand == null ? null : brand.getNameCn())
				.productArea(null)
				.retailPrice(goods.getMarketPrice())
				.build();
		
	}
	
}
