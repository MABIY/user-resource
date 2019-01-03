package net.vipmro.user.resource.infrastructure.repository;

import net.vipmro.user.resource.domain.model.po.Register;
import net.vipmro.user.resource.domain.repository.RegisterRepository;
import net.vipmro.user.resource.infrastructure.mapper.DealerMapper;
import net.vipmro.user.resource.infrastructure.mapper.RegisterMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RegisterRepositoryImpl implements RegisterRepository {
	
	@Autowired
	RegisterMapper registerMapper;
	
	@Autowired
	DealerMapper dealerMapper;
	
	@Override
	public Register find(Integer integer) {
		return registerMapper.selectByPrimaryKey(integer);
	}
	
	@Override
	public void delete(Integer integer) {
	
	}
	
	@Override
	public int save(Register register) {
		return 0;
	}
	
	
	@Override
	public Register findByLoginNameAndPasswordAndMobileSecret(String loginName, String password, String mobileSecret) {
		return registerMapper.selectByLoginNameandPasswordAndMobileSecret(loginName, password, mobileSecret);
	}
	
	@Override
	public Register findById(int registerId) {
		return registerMapper.selectByPrimaryKey(registerId);
	}
	
	@Override
	public List<Register> getRegisterByLoginnameAndMobileSecret(String loginName, String mobileSecret) {
		return registerMapper.selectByUserName(loginName, mobileSecret);
	}
	
}
