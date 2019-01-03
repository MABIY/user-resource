package net.vipmro.user.resource.domain.repository;

import net.vipmro.user.resource.domain.model.po.Category;

import java.util.List;

/**
 * @author lh
 */
public interface CategoryRepository extends CrudRepository<Category,Integer>{
	List<Category> findWithState(int i);
}
