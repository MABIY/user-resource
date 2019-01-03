package net.vipmro.user.resource.web.controller;


import net.vipmro.user.resource.commons.annoations.ResponseResult;
import net.vipmro.user.resource.commons.annoations.special.QfsmResponseData;
import net.vipmro.user.resource.domain.model.dto.UserInfoDTO;
import net.vipmro.user.resource.domain.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@ResponseResult
public class UserController {
	
	@Autowired
	RegisterService registerService;
	
	@QfsmResponseData
	@RequestMapping("/user/info")
	public UserInfoDTO user(Principal principal){
		return registerService.getUserInfo(Integer.valueOf(principal.getName()));
	}
	
	@RequestMapping("/lh")
	public String lh() {
		return "lh";
	}
	
}
