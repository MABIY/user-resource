package net.vipmro.user.resource.infrastructure.mapper;

import net.vipmro.user.resource.domain.model.po.Register;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RegisterMapper {
	int deleteByPrimaryKey(Integer id);
	
	int insert(Register record);
	
	Register selectByPrimaryKey(Integer id);
	
	List<Register> selectAll();
	
	int updateByPrimaryKey(Register record);
	
	Register selectByLoginNameandPasswordAndMobileSecret(@Param("loginName") String loginName,
														 @Param("password") String password,
														 @Param("mobileSecret") String mobileSecret);
	
	List<Register> selectByUserName(@Param("loginName") String loginName, @Param("mobileSecret") String mobileSecret);
	
}