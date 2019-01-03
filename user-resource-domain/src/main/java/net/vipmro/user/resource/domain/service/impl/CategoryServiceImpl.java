package net.vipmro.user.resource.domain.service.impl;

import net.vipmro.user.resource.domain.model.dto.CategoryDTO;
import net.vipmro.user.resource.domain.model.po.Category;
import net.vipmro.user.resource.domain.repository.CategoryRepository;
import net.vipmro.user.resource.domain.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: liuHua
 * @create: 2018-10-30 13:41
 **/

@Service
public class CategoryServiceImpl implements CategoryService {
	
	@Autowired
	CategoryRepository categoryRepository;
	
	@Override
	public List<CategoryDTO> getCategory() {
		List<CategoryDTO> categoryDTOS = new ArrayList<>();
		List<Category> categories = categoryRepository.findWithState(1);
		for (Category category : categories) {
			categoryDTOS.add(
					CategoryDTO.builder()
							.id(category.getId())
							.name(category.getName())
							.code(category.getCateNo())
							.parentId(category.getParentId())
							.build()
			);
		}
		return categoryDTOS;
	}
}
