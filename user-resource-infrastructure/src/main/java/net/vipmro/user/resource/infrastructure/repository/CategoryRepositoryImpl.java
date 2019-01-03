package net.vipmro.user.resource.infrastructure.repository;

import net.vipmro.user.resource.domain.model.po.Category;
import net.vipmro.user.resource.domain.repository.CategoryRepository;
import net.vipmro.user.resource.infrastructure.mapper.CategoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author: liuHua
 * @create: 2018-10-30 13:46
 **/

@Repository
public class CategoryRepositoryImpl implements CategoryRepository {
	@Autowired
	CategoryMapper categoryMapper;
	
	@Override
	public Category find(Integer id) {
		return categoryMapper.selectByPrimaryKey(id);
	}
	
	@Override
	public void delete(Integer integer) {
	
	}
	
	@Override
	public int save(Category category) {
		return 0;
	}
	
	@Override
	public List<Category> findWithState(int status) {
		return categoryMapper.selectWithState(status);
	}
}
