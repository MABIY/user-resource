package net.vipmro.user.resource.domain.repository;

/**
 * Created by liuhua on 16-7-1.
 */
public interface CrudRepository<T, F> {
	
	T find(F f);
	
	void delete(F f);
	
	int save(T t);
	
	
}
