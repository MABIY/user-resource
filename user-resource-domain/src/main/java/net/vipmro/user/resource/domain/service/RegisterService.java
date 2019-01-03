package net.vipmro.user.resource.domain.service;

import net.vipmro.user.resource.domain.model.dto.UserInfoDTO;
import net.vipmro.user.resource.domain.model.po.Register;

/**
 * The interface Register service.
 */
public interface RegisterService {
	/**
	 * 检查等否匹配的商城或saas的登录信息
	 *
	 * @param loginName the login name
	 * @param password  the password
	 * @return map
	 * @throws Exception the exception
	 */
	Register checkMallLoginInfo(String loginName,
								String password)
			throws Exception;
	
	/**
	 * Gets user info.
	 *
	 * @param registerId the username
	 * @return the user info
	 */
	UserInfoDTO getUserInfo(int registerId);
	
	Register getRegisterById(Integer valueOf);
	
	Boolean checkPermissionOfUser(String userName, String clientId) throws Exception;
}
