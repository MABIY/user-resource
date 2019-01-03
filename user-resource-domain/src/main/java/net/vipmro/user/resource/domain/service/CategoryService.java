package net.vipmro.user.resource.domain.service;

import net.vipmro.user.resource.domain.model.dto.CategoryDTO;

import java.util.List;

/**
 * @author: liuHua
 * @create: 2018-10-30 13:41
 **/

public interface CategoryService {
	List<CategoryDTO> getCategory();
}
