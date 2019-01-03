package net.vipmro.user.resource.infrastructure.repository;

import net.vipmro.user.resource.domain.model.po.Dealer;
import net.vipmro.user.resource.domain.repository.DealerRepository;
import net.vipmro.user.resource.infrastructure.mapper.DealerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * @author lh
 */
@Repository
public class DealerRepositoryImpl implements DealerRepository {
	@Autowired
	DealerMapper dealerMapper;
	
	@Override
	public Dealer find(Integer integer) {
		return dealerMapper.selectByPrimaryKey(integer);
	}
	
	@Override
	public void delete(Integer integer) {
	
	}
	
	@Override
	public int save(Dealer dealer) {
		return 0;
	}
}
