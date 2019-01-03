package net.vipmro.user.resource.domain.model.po;

import java.util.Date;

public class Register {
	private Integer id;
	
	private String userName;
	
	private String password;
	
	private Integer dealerId;
	
	private String position;
	
	private String mobile;
	
	private String mobileSecret;
	
	private String email;
	
	private Date registerTime;
	
	private String registerIp;
	
	private Date lastLoginTime;
	
	private String lastLoginIp;
	
	private String status;
	
	private String isLogin;
	
	private Integer loginCount;
	
	private String platform;
	
	private String userUnique;
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName == null ? null : userName.trim();
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password == null ? null : password.trim();
	}
	
	public Integer getDealerId() {
		return dealerId;
	}
	
	public void setDealerId(Integer dealerId) {
		this.dealerId = dealerId;
	}
	
	public String getPosition() {
		return position;
	}
	
	public void setPosition(String position) {
		this.position = position == null ? null : position.trim();
	}
	
	public String getMobile() {
		return mobile;
	}
	
	public void setMobile(String mobile) {
		this.mobile = mobile == null ? null : mobile.trim();
	}
	
	public String getMobileSecret() {
		return mobileSecret;
	}
	
	public void setMobileSecret(String mobileSecret) {
		this.mobileSecret = mobileSecret == null ? null : mobileSecret.trim();
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email == null ? null : email.trim();
	}
	
	public Date getRegisterTime() {
		return registerTime;
	}
	
	public void setRegisterTime(Date registerTime) {
		this.registerTime = registerTime;
	}
	
	public String getRegisterIp() {
		return registerIp;
	}
	
	public void setRegisterIp(String registerIp) {
		this.registerIp = registerIp == null ? null : registerIp.trim();
	}
	
	public Date getLastLoginTime() {
		return lastLoginTime;
	}
	
	public void setLastLoginTime(Date lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}
	
	public String getLastLoginIp() {
		return lastLoginIp;
	}
	
	public void setLastLoginIp(String lastLoginIp) {
		this.lastLoginIp = lastLoginIp == null ? null : lastLoginIp.trim();
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status == null ? null : status.trim();
	}
	
	public String getIsLogin() {
		return isLogin;
	}
	
	public void setIsLogin(String isLogin) {
		this.isLogin = isLogin == null ? null : isLogin.trim();
	}
	
	public Integer getLoginCount() {
		return loginCount;
	}
	
	public void setLoginCount(Integer loginCount) {
		this.loginCount = loginCount;
	}
	
	public String getPlatform() {
		return platform;
	}
	
	public void setPlatform(String platform) {
		this.platform = platform == null ? null : platform.trim();
	}
	
	public String getUserUnique() {
		return userUnique;
	}
	
	public void setUserUnique(String userUnique) {
		this.userUnique = userUnique == null ? null : userUnique.trim();
	}
}