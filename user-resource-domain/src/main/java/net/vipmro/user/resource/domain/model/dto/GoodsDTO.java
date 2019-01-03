package net.vipmro.user.resource.domain.model.dto;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

/**
 * @author: liuHua
 * @create: 2018-10-30 10:36
 **/

@Data
@Builder
public class GoodsDTO {
	
	private Long id;
	
	private String number;
	
	/**
	 * 商品名称
	 */
	private String name;
	
	/**
	 * 外部编码
	 */
	private String outerCode;
	
	/**
	 * 分类id
	 */
	private CategoryDTO category;
	
	/**
	 * 单位
	 */
	private String unit;
	
	/**
	 * 品牌名称
	 */
	private String brandName;
	
	/**
	 * 产地
	 */
	private String productArea;
	
	/**
	 * 零售价 对应goods.market_price(市场价)
	 */
	private BigDecimal retailPrice;
	
}
