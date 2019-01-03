package net.vipmro.user.resource.domain.model.dto;

import lombok.Builder;
import lombok.Data;

/**
 * @author: liuHua
 * @create: 2018-10-30 13:36
 **/

@Data
@Builder
public class CategoryDTO {
	private Integer id;
	private String code;
	private String name;
	private Integer parentId;
}
