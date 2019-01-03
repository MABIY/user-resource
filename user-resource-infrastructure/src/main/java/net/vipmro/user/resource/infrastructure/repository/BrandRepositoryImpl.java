package net.vipmro.user.resource.infrastructure.repository;

import net.vipmro.user.resource.domain.model.po.Brand;
import net.vipmro.user.resource.domain.repository.BrandRepository;
import net.vipmro.user.resource.infrastructure.mapper.BrandMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * @author: liuHua
 * @create: 2018-10-30 14:30
 **/
@Repository
public class BrandRepositoryImpl implements BrandRepository {
	
	@Autowired
	BrandMapper brandMapper;
	
	@Override
	public Brand find(Integer id) {
		return brandMapper.selectByPrimaryKey(id);
	}
	
	@Override
	public void delete(Integer integer) {
	
	}
	
	@Override
	public int save(Brand brand) {
		return 0;
	}
}
