package net.vipmro.user.resource.domain.model.po;

import java.math.BigDecimal;
import java.util.Date;

public class Dealer {
	private Integer id;

	private String dealerName;

	private String logo;

	private String telephone;

	private String telephoneSecret;

	private String fax;

	private Integer countryId;

	private Integer provinceId;

	private Integer cityId;

	private Integer areaId;

	private String address;

	private String linkman;

	private String linkTel;

	private String linkTelSecret;

	private Long qq;

	private String lng;

	private String lat;

	private String checkStatus;

	private Date checkTime;

	private Integer checkUserId;

	private String rejectReason;

	private Integer rank;

	private Integer rankScore;

	private Integer score;

	private Integer cash;

	private Date cashValidDate;

	private String dealerType;

	private Date authorizeDate;

	private String status;

	private Date modifyTime;

	private Long modifyUserId;

	private Integer orderSn;

	private String logisticsTempModel;

	private Date createTime;

	private String email;

	private String shortName;

	private Byte dealRate;

	private String isShow;

	private String cooperationMode;

	private String orderHandle;

	private String profitModel;

	private Integer weixinId;

	private Integer crmCostomerId;

	private String isManual;

	private String gender;

	private Date birthday;

	private Integer shopType;

	private String shopName;

	private String alias;

	private String operateScope;

	private Integer regChannel;

	private String checkFailReason;

	private Short saleCustomerGroup;

	private BigDecimal balance;

	private String openId;

	private BigDecimal cashback;

	private Integer bean;

	private String sourceType;

	private String saasOpenId;

	private String invitation;

	private Integer regSource;

	private Date lastRechargeTime;

	private Integer lastRechargeBean;

	private Byte allotType;

	private String allotReason;

	private Date allotTime;

	private Byte registerPlatform;

	private Integer exchangeLimit;

	private Byte usedRefundNum;

	private Byte exchangeCouponNum;

	private String miniOpenId;

	private String registerNo;

	private BigDecimal goodsReturn;

	private Long dealerIdOfSeller;

	private Date synTime;

	private Long synId;

	private String isTestAccount;

	private Integer parentId;

	private Date searchHistoryTime;

	private Integer invitedDealerId;

	private BigDecimal draftBalance;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDealerName() {
		return dealerName;
	}

	public void setDealerName(String dealerName) {
		this.dealerName = dealerName == null ? null : dealerName.trim();
	}

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo == null ? null : logo.trim();
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone == null ? null : telephone.trim();
	}

	public String getTelephoneSecret() {
		return telephoneSecret;
	}

	public void setTelephoneSecret(String telephoneSecret) {
		this.telephoneSecret = telephoneSecret == null ? null : telephoneSecret.trim();
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax == null ? null : fax.trim();
	}

	public Integer getCountryId() {
		return countryId;
	}

	public void setCountryId(Integer countryId) {
		this.countryId = countryId;
	}

	public Integer getProvinceId() {
		return provinceId;
	}

	public void setProvinceId(Integer provinceId) {
		this.provinceId = provinceId;
	}

	public Integer getCityId() {
		return cityId;
	}

	public void setCityId(Integer cityId) {
		this.cityId = cityId;
	}

	public Integer getAreaId() {
		return areaId;
	}

	public void setAreaId(Integer areaId) {
		this.areaId = areaId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address == null ? null : address.trim();
	}

	public String getLinkman() {
		return linkman;
	}

	public void setLinkman(String linkman) {
		this.linkman = linkman == null ? null : linkman.trim();
	}

	public String getLinkTel() {
		return linkTel;
	}

	public void setLinkTel(String linkTel) {
		this.linkTel = linkTel == null ? null : linkTel.trim();
	}

	public String getLinkTelSecret() {
		return linkTelSecret;
	}

	public void setLinkTelSecret(String linkTelSecret) {
		this.linkTelSecret = linkTelSecret == null ? null : linkTelSecret.trim();
	}

	public Long getQq() {
		return qq;
	}

	public void setQq(Long qq) {
		this.qq = qq;
	}

	public String getLng() {
		return lng;
	}

	public void setLng(String lng) {
		this.lng = lng == null ? null : lng.trim();
	}

	public String getLat() {
		return lat;
	}

	public void setLat(String lat) {
		this.lat = lat == null ? null : lat.trim();
	}

	public String getCheckStatus() {
		return checkStatus;
	}

	public void setCheckStatus(String checkStatus) {
		this.checkStatus = checkStatus == null ? null : checkStatus.trim();
	}

	public Date getCheckTime() {
		return checkTime;
	}

	public void setCheckTime(Date checkTime) {
		this.checkTime = checkTime;
	}

	public Integer getCheckUserId() {
		return checkUserId;
	}

	public void setCheckUserId(Integer checkUserId) {
		this.checkUserId = checkUserId;
	}

	public String getRejectReason() {
		return rejectReason;
	}

	public void setRejectReason(String rejectReason) {
		this.rejectReason = rejectReason == null ? null : rejectReason.trim();
	}

	public Integer getRank() {
		return rank;
	}

	public void setRank(Integer rank) {
		this.rank = rank;
	}

	public Integer getRankScore() {
		return rankScore;
	}

	public void setRankScore(Integer rankScore) {
		this.rankScore = rankScore;
	}

	public Integer getScore() {
		return score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}

	public Integer getCash() {
		return cash;
	}

	public void setCash(Integer cash) {
		this.cash = cash;
	}

	public Date getCashValidDate() {
		return cashValidDate;
	}

	public void setCashValidDate(Date cashValidDate) {
		this.cashValidDate = cashValidDate;
	}

	public String getDealerType() {
		return dealerType;
	}

	public void setDealerType(String dealerType) {
		this.dealerType = dealerType == null ? null : dealerType.trim();
	}

	public Date getAuthorizeDate() {
		return authorizeDate;
	}

	public void setAuthorizeDate(Date authorizeDate) {
		this.authorizeDate = authorizeDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status == null ? null : status.trim();
	}

	public Date getModifyTime() {
		return modifyTime;
	}

	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}

	public Long getModifyUserId() {
		return modifyUserId;
	}

	public void setModifyUserId(Long modifyUserId) {
		this.modifyUserId = modifyUserId;
	}

	public Integer getOrderSn() {
		return orderSn;
	}

	public void setOrderSn(Integer orderSn) {
		this.orderSn = orderSn;
	}

	public String getLogisticsTempModel() {
		return logisticsTempModel;
	}

	public void setLogisticsTempModel(String logisticsTempModel) {
		this.logisticsTempModel = logisticsTempModel == null ? null : logisticsTempModel.trim();
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email == null ? null : email.trim();
	}

	public String getShortName() {
		return shortName;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName == null ? null : shortName.trim();
	}

	public Byte getDealRate() {
		return dealRate;
	}

	public void setDealRate(Byte dealRate) {
		this.dealRate = dealRate;
	}

	public String getIsShow() {
		return isShow;
	}

	public void setIsShow(String isShow) {
		this.isShow = isShow == null ? null : isShow.trim();
	}

	public String getCooperationMode() {
		return cooperationMode;
	}

	public void setCooperationMode(String cooperationMode) {
		this.cooperationMode = cooperationMode == null ? null : cooperationMode.trim();
	}

	public String getOrderHandle() {
		return orderHandle;
	}

	public void setOrderHandle(String orderHandle) {
		this.orderHandle = orderHandle == null ? null : orderHandle.trim();
	}

	public String getProfitModel() {
		return profitModel;
	}

	public void setProfitModel(String profitModel) {
		this.profitModel = profitModel == null ? null : profitModel.trim();
	}

	public Integer getWeixinId() {
		return weixinId;
	}

	public void setWeixinId(Integer weixinId) {
		this.weixinId = weixinId;
	}

	public Integer getCrmCostomerId() {
		return crmCostomerId;
	}

	public void setCrmCostomerId(Integer crmCostomerId) {
		this.crmCostomerId = crmCostomerId;
	}

	public String getIsManual() {
		return isManual;
	}

	public void setIsManual(String isManual) {
		this.isManual = isManual == null ? null : isManual.trim();
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender == null ? null : gender.trim();
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public Integer getShopType() {
		return shopType;
	}

	public void setShopType(Integer shopType) {
		this.shopType = shopType;
	}

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName == null ? null : shopName.trim();
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias == null ? null : alias.trim();
	}

	public String getOperateScope() {
		return operateScope;
	}

	public void setOperateScope(String operateScope) {
		this.operateScope = operateScope == null ? null : operateScope.trim();
	}

	public Integer getRegChannel() {
		return regChannel;
	}

	public void setRegChannel(Integer regChannel) {
		this.regChannel = regChannel;
	}

	public String getCheckFailReason() {
		return checkFailReason;
	}

	public void setCheckFailReason(String checkFailReason) {
		this.checkFailReason = checkFailReason == null ? null : checkFailReason.trim();
	}

	public Short getSaleCustomerGroup() {
		return saleCustomerGroup;
	}

	public void setSaleCustomerGroup(Short saleCustomerGroup) {
		this.saleCustomerGroup = saleCustomerGroup;
	}

	public BigDecimal getBalance() {
		return balance;
	}

	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}

	public String getOpenId() {
		return openId;
	}

	public void setOpenId(String openId) {
		this.openId = openId == null ? null : openId.trim();
	}

	public BigDecimal getCashback() {
		return cashback;
	}

	public void setCashback(BigDecimal cashback) {
		this.cashback = cashback;
	}

	public Integer getBean() {
		return bean;
	}

	public void setBean(Integer bean) {
		this.bean = bean;
	}

	public String getSourceType() {
		return sourceType;
	}

	public void setSourceType(String sourceType) {
		this.sourceType = sourceType == null ? null : sourceType.trim();
	}

	public String getSaasOpenId() {
		return saasOpenId;
	}

	public void setSaasOpenId(String saasOpenId) {
		this.saasOpenId = saasOpenId == null ? null : saasOpenId.trim();
	}

	public String getInvitation() {
		return invitation;
	}

	public void setInvitation(String invitation) {
		this.invitation = invitation == null ? null : invitation.trim();
	}

	public Integer getRegSource() {
		return regSource;
	}

	public void setRegSource(Integer regSource) {
		this.regSource = regSource;
	}

	public Date getLastRechargeTime() {
		return lastRechargeTime;
	}

	public void setLastRechargeTime(Date lastRechargeTime) {
		this.lastRechargeTime = lastRechargeTime;
	}

	public Integer getLastRechargeBean() {
		return lastRechargeBean;
	}

	public void setLastRechargeBean(Integer lastRechargeBean) {
		this.lastRechargeBean = lastRechargeBean;
	}

	public Byte getAllotType() {
		return allotType;
	}

	public void setAllotType(Byte allotType) {
		this.allotType = allotType;
	}

	public String getAllotReason() {
		return allotReason;
	}

	public void setAllotReason(String allotReason) {
		this.allotReason = allotReason == null ? null : allotReason.trim();
	}

	public Date getAllotTime() {
		return allotTime;
	}

	public void setAllotTime(Date allotTime) {
		this.allotTime = allotTime;
	}

	public Byte getRegisterPlatform() {
		return registerPlatform;
	}

	public void setRegisterPlatform(Byte registerPlatform) {
		this.registerPlatform = registerPlatform;
	}

	public Integer getExchangeLimit() {
		return exchangeLimit;
	}

	public void setExchangeLimit(Integer exchangeLimit) {
		this.exchangeLimit = exchangeLimit;
	}

	public Byte getUsedRefundNum() {
		return usedRefundNum;
	}

	public void setUsedRefundNum(Byte usedRefundNum) {
		this.usedRefundNum = usedRefundNum;
	}

	public Byte getExchangeCouponNum() {
		return exchangeCouponNum;
	}

	public void setExchangeCouponNum(Byte exchangeCouponNum) {
		this.exchangeCouponNum = exchangeCouponNum;
	}

	public String getMiniOpenId() {
		return miniOpenId;
	}

	public void setMiniOpenId(String miniOpenId) {
		this.miniOpenId = miniOpenId == null ? null : miniOpenId.trim();
	}

	public String getRegisterNo() {
		return registerNo;
	}

	public void setRegisterNo(String registerNo) {
		this.registerNo = registerNo == null ? null : registerNo.trim();
	}

	public BigDecimal getGoodsReturn() {
		return goodsReturn;
	}

	public void setGoodsReturn(BigDecimal goodsReturn) {
		this.goodsReturn = goodsReturn;
	}

	public Long getDealerIdOfSeller() {
		return dealerIdOfSeller;
	}

	public void setDealerIdOfSeller(Long dealerIdOfSeller) {
		this.dealerIdOfSeller = dealerIdOfSeller;
	}

	public Date getSynTime() {
		return synTime;
	}

	public void setSynTime(Date synTime) {
		this.synTime = synTime;
	}

	public Long getSynId() {
		return synId;
	}

	public void setSynId(Long synId) {
		this.synId = synId;
	}

	public String getIsTestAccount() {
		return isTestAccount;
	}

	public void setIsTestAccount(String isTestAccount) {
		this.isTestAccount = isTestAccount == null ? null : isTestAccount.trim();
	}

	public Integer getParentId() {
		return parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

	public Date getSearchHistoryTime() {
		return searchHistoryTime;
	}

	public void setSearchHistoryTime(Date searchHistoryTime) {
		this.searchHistoryTime = searchHistoryTime;
	}

	public Integer getInvitedDealerId() {
		return invitedDealerId;
	}

	public void setInvitedDealerId(Integer invitedDealerId) {
		this.invitedDealerId = invitedDealerId;
	}

	public BigDecimal getDraftBalance() {
		return draftBalance;
	}

	public void setDraftBalance(BigDecimal draftBalance) {
		this.draftBalance = draftBalance;
	}

}