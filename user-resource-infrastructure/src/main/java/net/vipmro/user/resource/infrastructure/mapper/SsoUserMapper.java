package net.vipmro.user.resource.infrastructure.mapper;

import net.vipmro.user.resource.domain.model.po.SsoUser;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SsoUserMapper {
	int deleteByPrimaryKey(Long id);
	
	int insert(SsoUser record);
	
	SsoUser selectByPrimaryKey(Long id);
	
	List<SsoUser> selectAll();
	
	int updateByPrimaryKey(SsoUser record);
	
	SsoUser selectByUserIdAndEnabled(@Param("userId") Integer userId, @Param("clientId") String clientId, @Param("enabled") int enabled);
}