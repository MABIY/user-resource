package net.vipmro.user.resource.domain.service.impl;

import net.vipmro.user.resource.commons.exceptions.BusinessException;
import net.vipmro.user.resource.domain.model.dto.UserInfoDTO;
import net.vipmro.user.resource.domain.model.po.Dealer;
import net.vipmro.user.resource.domain.model.po.Register;
import net.vipmro.user.resource.domain.model.po.SsoUser;
import net.vipmro.user.resource.domain.repository.DealerRepository;
import net.vipmro.user.resource.domain.repository.RegisterRepository;
import net.vipmro.user.resource.domain.repository.SsoUserRepository;
import net.vipmro.user.resource.domain.service.RegisterService;
import net.vipmro.user.resource.domain.util.DESCoder;
import net.vipmro.user.resource.domain.util.Encrypt;
import net.vipmro.user.resource.domain.util.MobileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static net.vipmro.user.resource.commons.enums.ResultCode.USER_NOT_EXIST;

@Service
public class RegisterServiceImpl implements RegisterService {
	
	@Autowired
	RegisterRepository registerRepository;
	
	@Autowired
	DealerRepository dealerRepository;
	
	@Autowired
	SsoUserRepository ssoUserRepository;
	
	@Override
	public Register getRegisterById(Integer id) {
		return registerRepository.findById(id);
	}
	
	@Override
	public Boolean checkPermissionOfUser(String loginName, String clientId) throws Exception {
		boolean flag = MobileUtils.isMobileNO(loginName);
		String mobileSecret = null;
		if (flag) {
			DESCoder.instanceMobile();
			mobileSecret = DESCoder.encoder(loginName).trim();
		}
		
		List<Register> registers = registerRepository.getRegisterByLoginnameAndMobileSecret(loginName, mobileSecret);
		for (Register register : registers) {
			SsoUser ssoUser = ssoUserRepository.findByUserIdAndClientIdAndEnabled(register.getId(), clientId, 1);
			if (ssoUser != null) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public UserInfoDTO getUserInfo(int registerId) {
		Map<String, Object> userInfoMap = new HashMap<>();
		Register register = registerRepository.findById(registerId);
		if (register == null) {
			throw new BusinessException(USER_NOT_EXIST);
		}
		Dealer dealer = dealerRepository.find(register.getDealerId());
		return UserInfoDTO.builder()
				.userName(dealer.getDealerName())
				.id(registerId)
				.mobile(register.getMobile())
				.companyId(dealer.getId())
				.companyName(dealer.getDealerName())
				.companyAddress(dealer.getAddress())
				.build();
	}
	
	
	@Override
	public Register checkMallLoginInfo(String loginName, String password) throws Exception {
		
		boolean flag = MobileUtils.isMobileNO(loginName);
		String mobileSecret = null;
		if (flag) {
			DESCoder.instanceMobile();
			mobileSecret = DESCoder.encoder(loginName).trim();
		}
		String encodePassword = password.length() != 40 ? Encrypt.md5AndSha(password) : password;
		return registerRepository.findByLoginNameAndPasswordAndMobileSecret(loginName, encodePassword, mobileSecret);
	}
}
