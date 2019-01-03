package net.vipmro.user.resource.infrastructure.mapper;

import net.vipmro.user.resource.domain.model.po.Category;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CategoryMapper {
	int deleteByPrimaryKey(Integer id);
	
	int insert(Category record);
	
	Category selectByPrimaryKey(Integer id);
	
	List<Category> selectAll();
	
	int updateByPrimaryKey(Category record);
	
	List<Category> selectWithState(@Param("status") int status);
}