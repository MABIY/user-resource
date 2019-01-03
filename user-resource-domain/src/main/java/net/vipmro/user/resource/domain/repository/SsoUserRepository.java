package net.vipmro.user.resource.domain.repository;

import net.vipmro.user.resource.domain.model.po.SsoUser;

/**
 * @author: liuHua
 * @create: 2018-11-06 14:50
 **/

public interface SsoUserRepository extends CrudRepository<SsoUser,Long>{
	SsoUser findByUserIdAndClientIdAndEnabled(Integer userId, String clientId, int enabled);
}
