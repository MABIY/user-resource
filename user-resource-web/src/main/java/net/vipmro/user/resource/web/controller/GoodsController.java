package net.vipmro.user.resource.web.controller;

import net.vipmro.user.resource.commons.annoations.ResponseResult;
import net.vipmro.user.resource.commons.annoations.special.QfsmResponseData;
import net.vipmro.user.resource.domain.model.dto.CategoryDTO;
import net.vipmro.user.resource.domain.model.dto.GoodsDTO;
import net.vipmro.user.resource.domain.service.CategoryService;
import net.vipmro.user.resource.domain.service.SellerGoodsSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author: liuHua
 * @create: 2018-10-30 10:16
 **/

@RestController
@ResponseResult
public class GoodsController {
	
	@Autowired
	SellerGoodsSerivce sellerGoodsSerivce;
	
	@Autowired
	CategoryService categoryService;
	
	@QfsmResponseData
	@GetMapping("/goods/info")
	public GoodsDTO getSellerGoodsInfo(@RequestParam("goodsId") String goodsNo) {
		return sellerGoodsSerivce.getGoodTDO(goodsNo);
	}
	
	@GetMapping("/category")
	public List<CategoryDTO> getCategory() {
		return categoryService.getCategory();
	}
}
