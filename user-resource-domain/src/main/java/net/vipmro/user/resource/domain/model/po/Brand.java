package net.vipmro.user.resource.domain.model.po;

import java.math.BigDecimal;
import java.util.Date;

public class Brand {
    private Integer id;

    private String nameCn;

    private String nameEn;

    private String logo;

    private String mark;

    private String maker;

    private Date makeDate;

    private String web;

    private String type;

    private Integer orderSn;

    private String tips;

    private Integer countryId;

    private String status;

    private Integer createUserId;

    private Date createTime;

    private Integer modifyUserId;

    private Date modifyTime;

    private String qq;

    private String telphone;

    private Byte hasGoods;

    private Integer staffId;

    private Byte isZc;

    private BigDecimal zcPriceBase;

    private Byte isInjected;

    private Date injectedTime;

    private Byte nature;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNameCn() {
        return nameCn;
    }

    public void setNameCn(String nameCn) {
        this.nameCn = nameCn == null ? null : nameCn.trim();
    }

    public String getNameEn() {
        return nameEn;
    }

    public void setNameEn(String nameEn) {
        this.nameEn = nameEn == null ? null : nameEn.trim();
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo == null ? null : logo.trim();
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark == null ? null : mark.trim();
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker == null ? null : maker.trim();
    }

    public Date getMakeDate() {
        return makeDate;
    }

    public void setMakeDate(Date makeDate) {
        this.makeDate = makeDate;
    }

    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web == null ? null : web.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Integer getOrderSn() {
        return orderSn;
    }

    public void setOrderSn(Integer orderSn) {
        this.orderSn = orderSn;
    }

    public String getTips() {
        return tips;
    }

    public void setTips(String tips) {
        this.tips = tips == null ? null : tips.trim();
    }

    public Integer getCountryId() {
        return countryId;
    }

    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Integer getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(Integer createUserId) {
        this.createUserId = createUserId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getModifyUserId() {
        return modifyUserId;
    }

    public void setModifyUserId(Integer modifyUserId) {
        this.modifyUserId = modifyUserId;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq == null ? null : qq.trim();
    }

    public String getTelphone() {
        return telphone;
    }

    public void setTelphone(String telphone) {
        this.telphone = telphone == null ? null : telphone.trim();
    }

    public Byte getHasGoods() {
        return hasGoods;
    }

    public void setHasGoods(Byte hasGoods) {
        this.hasGoods = hasGoods;
    }

    public Integer getStaffId() {
        return staffId;
    }

    public void setStaffId(Integer staffId) {
        this.staffId = staffId;
    }

    public Byte getIsZc() {
        return isZc;
    }

    public void setIsZc(Byte isZc) {
        this.isZc = isZc;
    }

    public BigDecimal getZcPriceBase() {
        return zcPriceBase;
    }

    public void setZcPriceBase(BigDecimal zcPriceBase) {
        this.zcPriceBase = zcPriceBase;
    }

    public Byte getIsInjected() {
        return isInjected;
    }

    public void setIsInjected(Byte isInjected) {
        this.isInjected = isInjected;
    }

    public Date getInjectedTime() {
        return injectedTime;
    }

    public void setInjectedTime(Date injectedTime) {
        this.injectedTime = injectedTime;
    }

    public Byte getNature() {
        return nature;
    }

    public void setNature(Byte nature) {
        this.nature = nature;
    }
}