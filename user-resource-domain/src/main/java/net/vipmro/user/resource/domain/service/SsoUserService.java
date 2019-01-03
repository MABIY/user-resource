package net.vipmro.user.resource.domain.service;

import net.vipmro.user.resource.domain.model.po.SsoUser;

/**
 * @author: liuHua
 * @create: 2018-12-13 16:17
 **/

public interface SsoUserService {
	public SsoUser recordLastLogin(Integer registerId, String clientId);
}
