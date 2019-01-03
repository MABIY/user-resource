package net.vipmro.user.resource.infrastructure.repository;

import net.vipmro.user.resource.domain.model.po.SsoUser;
import net.vipmro.user.resource.domain.repository.SsoUserRepository;
import net.vipmro.user.resource.infrastructure.mapper.SsoUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * @author: liuHua
 * @create: 2018-11-06 14:50
 **/

@Repository
public class SsoUserRepositoryImpl implements SsoUserRepository {
	@Autowired
	SsoUserMapper ssoUserMapper;
	
	@Override
	public SsoUser find(Long id) {
		return ssoUserMapper.selectByPrimaryKey(id);
	}
	
	@Override
	public void delete(Long aLong) {
	
	}
	
	@Override
	public int save(SsoUser ssoUser) {
		if (ssoUser.getId() != null) {
			return ssoUserMapper.updateByPrimaryKey(ssoUser);
		} else {
			return ssoUserMapper.insert(ssoUser);
		}
	}
	
	@Override
	public SsoUser findByUserIdAndClientIdAndEnabled(Integer userId, String clientId, int enabled) {
		return ssoUserMapper.selectByUserIdAndEnabled(userId, clientId, 1);
	}
}
