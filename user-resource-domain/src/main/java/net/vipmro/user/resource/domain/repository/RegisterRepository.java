package net.vipmro.user.resource.domain.repository;

import net.vipmro.user.resource.domain.model.po.Register;

import java.util.List;

/**
 * @author lh
 */
public interface RegisterRepository extends CrudRepository<Register, Integer> {
	Register findByLoginNameAndPasswordAndMobileSecret(String loginName, String password, String mobileSecret);
	
	Register findById(int registerId);
	
	List<Register> getRegisterByLoginnameAndMobileSecret(String loginName, String mobileSecret);
}
