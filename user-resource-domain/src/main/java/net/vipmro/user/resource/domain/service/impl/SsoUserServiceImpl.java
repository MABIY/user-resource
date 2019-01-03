package net.vipmro.user.resource.domain.service.impl;

import net.vipmro.user.resource.domain.model.po.SsoUser;
import net.vipmro.user.resource.domain.repository.SsoUserRepository;
import net.vipmro.user.resource.domain.service.SsoUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @author: liuHua
 * @create: 2018-12-13 16:17
 **/
@Service
public class SsoUserServiceImpl implements SsoUserService {
	@Autowired
	SsoUserRepository ssoUserRepository;
	
	/**
	 * 更新 最后登录时间
	 * @param registerId
	 * @param clientId
	 * @return
	 */
	public SsoUser recordLastLogin(Integer registerId, String clientId) {
		SsoUser ssoUser = ssoUserRepository.findByUserIdAndClientIdAndEnabled(registerId, clientId, 1);
		ssoUser.setLastLoginDate(new Date());
		ssoUserRepository.save(ssoUser);
		return ssoUser;
	}
}
