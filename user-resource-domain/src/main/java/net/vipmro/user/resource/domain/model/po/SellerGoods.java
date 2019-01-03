package net.vipmro.user.resource.domain.model.po;

import java.math.BigDecimal;
import java.util.Date;

public class SellerGoods {
    private Long id;

    private Long goodsId;

    private String goodsNo;

    private Integer sellerId;

    private String buyNo;

    private Integer stock;

    private BigDecimal price;

    private BigDecimal costPrice;

    private String goodsName;

    private Integer shippingCityId;

    private String shippingCityName;

    private String isFreepost;

    private Integer fareTempId;

    private Date fixedUpTime;

    private Date fixedDownTime;

    private String status;

    private Date createTime;

    private Integer createUserId;

    private Date modifyTime;

    private Integer modifyUserId;

    private Integer salesVolume;

    private BigDecimal salesPriceVolume;

    private Integer couponAmount;

    private BigDecimal showAmount;

    private String isRecomm;

    private Integer orderSn;

    private String isShow;

    private Integer orderQuantity;

    private String remark;

    private Short isFullcut;

    private Short isRate;

    private Short isRebates;

    private Short isSale;

    private String skuUnit;

    private String synCode;

    private Integer batchQuantity;

    private BigDecimal salePrice;

    private BigDecimal rate;

    private Byte channel;

    private Long sellerCateId;

    private Short isFullgive;

    private Short isGroupon;

    private Short isBean;

    private BigDecimal beanRate;

    private Byte isPromote;

    private Integer logisticsTempId;

    private BigDecimal dockingDiscount;

    private BigDecimal minPrice;

    private Integer updateBy;

    private Date updateAt;

    private Byte isSupportReturn;

    private Byte tempFlg;

    private Byte isConvertShow;

    private BigDecimal convertNum;

    private String convertUnit;

    private Integer deliveryTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsNo() {
        return goodsNo;
    }

    public void setGoodsNo(String goodsNo) {
        this.goodsNo = goodsNo == null ? null : goodsNo.trim();
    }

    public Integer getSellerId() {
        return sellerId;
    }

    public void setSellerId(Integer sellerId) {
        this.sellerId = sellerId;
    }

    public String getBuyNo() {
        return buyNo;
    }

    public void setBuyNo(String buyNo) {
        this.buyNo = buyNo == null ? null : buyNo.trim();
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(BigDecimal costPrice) {
        this.costPrice = costPrice;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
    }

    public Integer getShippingCityId() {
        return shippingCityId;
    }

    public void setShippingCityId(Integer shippingCityId) {
        this.shippingCityId = shippingCityId;
    }

    public String getShippingCityName() {
        return shippingCityName;
    }

    public void setShippingCityName(String shippingCityName) {
        this.shippingCityName = shippingCityName == null ? null : shippingCityName.trim();
    }

    public String getIsFreepost() {
        return isFreepost;
    }

    public void setIsFreepost(String isFreepost) {
        this.isFreepost = isFreepost == null ? null : isFreepost.trim();
    }

    public Integer getFareTempId() {
        return fareTempId;
    }

    public void setFareTempId(Integer fareTempId) {
        this.fareTempId = fareTempId;
    }

    public Date getFixedUpTime() {
        return fixedUpTime;
    }

    public void setFixedUpTime(Date fixedUpTime) {
        this.fixedUpTime = fixedUpTime;
    }

    public Date getFixedDownTime() {
        return fixedDownTime;
    }

    public void setFixedDownTime(Date fixedDownTime) {
        this.fixedDownTime = fixedDownTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(Integer createUserId) {
        this.createUserId = createUserId;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public Integer getModifyUserId() {
        return modifyUserId;
    }

    public void setModifyUserId(Integer modifyUserId) {
        this.modifyUserId = modifyUserId;
    }

    public Integer getSalesVolume() {
        return salesVolume;
    }

    public void setSalesVolume(Integer salesVolume) {
        this.salesVolume = salesVolume;
    }

    public BigDecimal getSalesPriceVolume() {
        return salesPriceVolume;
    }

    public void setSalesPriceVolume(BigDecimal salesPriceVolume) {
        this.salesPriceVolume = salesPriceVolume;
    }

    public Integer getCouponAmount() {
        return couponAmount;
    }

    public void setCouponAmount(Integer couponAmount) {
        this.couponAmount = couponAmount;
    }

    public BigDecimal getShowAmount() {
        return showAmount;
    }

    public void setShowAmount(BigDecimal showAmount) {
        this.showAmount = showAmount;
    }

    public String getIsRecomm() {
        return isRecomm;
    }

    public void setIsRecomm(String isRecomm) {
        this.isRecomm = isRecomm == null ? null : isRecomm.trim();
    }

    public Integer getOrderSn() {
        return orderSn;
    }

    public void setOrderSn(Integer orderSn) {
        this.orderSn = orderSn;
    }

    public String getIsShow() {
        return isShow;
    }

    public void setIsShow(String isShow) {
        this.isShow = isShow == null ? null : isShow.trim();
    }

    public Integer getOrderQuantity() {
        return orderQuantity;
    }

    public void setOrderQuantity(Integer orderQuantity) {
        this.orderQuantity = orderQuantity;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Short getIsFullcut() {
        return isFullcut;
    }

    public void setIsFullcut(Short isFullcut) {
        this.isFullcut = isFullcut;
    }

    public Short getIsRate() {
        return isRate;
    }

    public void setIsRate(Short isRate) {
        this.isRate = isRate;
    }

    public Short getIsRebates() {
        return isRebates;
    }

    public void setIsRebates(Short isRebates) {
        this.isRebates = isRebates;
    }

    public Short getIsSale() {
        return isSale;
    }

    public void setIsSale(Short isSale) {
        this.isSale = isSale;
    }

    public String getSkuUnit() {
        return skuUnit;
    }

    public void setSkuUnit(String skuUnit) {
        this.skuUnit = skuUnit == null ? null : skuUnit.trim();
    }

    public String getSynCode() {
        return synCode;
    }

    public void setSynCode(String synCode) {
        this.synCode = synCode == null ? null : synCode.trim();
    }

    public Integer getBatchQuantity() {
        return batchQuantity;
    }

    public void setBatchQuantity(Integer batchQuantity) {
        this.batchQuantity = batchQuantity;
    }

    public BigDecimal getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(BigDecimal salePrice) {
        this.salePrice = salePrice;
    }

    public BigDecimal getRate() {
        return rate;
    }

    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    public Byte getChannel() {
        return channel;
    }

    public void setChannel(Byte channel) {
        this.channel = channel;
    }

    public Long getSellerCateId() {
        return sellerCateId;
    }

    public void setSellerCateId(Long sellerCateId) {
        this.sellerCateId = sellerCateId;
    }

    public Short getIsFullgive() {
        return isFullgive;
    }

    public void setIsFullgive(Short isFullgive) {
        this.isFullgive = isFullgive;
    }

    public Short getIsGroupon() {
        return isGroupon;
    }

    public void setIsGroupon(Short isGroupon) {
        this.isGroupon = isGroupon;
    }

    public Short getIsBean() {
        return isBean;
    }

    public void setIsBean(Short isBean) {
        this.isBean = isBean;
    }

    public BigDecimal getBeanRate() {
        return beanRate;
    }

    public void setBeanRate(BigDecimal beanRate) {
        this.beanRate = beanRate;
    }

    public Byte getIsPromote() {
        return isPromote;
    }

    public void setIsPromote(Byte isPromote) {
        this.isPromote = isPromote;
    }

    public Integer getLogisticsTempId() {
        return logisticsTempId;
    }

    public void setLogisticsTempId(Integer logisticsTempId) {
        this.logisticsTempId = logisticsTempId;
    }

    public BigDecimal getDockingDiscount() {
        return dockingDiscount;
    }

    public void setDockingDiscount(BigDecimal dockingDiscount) {
        this.dockingDiscount = dockingDiscount;
    }

    public BigDecimal getMinPrice() {
        return minPrice;
    }

    public void setMinPrice(BigDecimal minPrice) {
        this.minPrice = minPrice;
    }

    public Integer getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(Integer updateBy) {
        this.updateBy = updateBy;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    public Byte getIsSupportReturn() {
        return isSupportReturn;
    }

    public void setIsSupportReturn(Byte isSupportReturn) {
        this.isSupportReturn = isSupportReturn;
    }

    public Byte getTempFlg() {
        return tempFlg;
    }

    public void setTempFlg(Byte tempFlg) {
        this.tempFlg = tempFlg;
    }

    public Byte getIsConvertShow() {
        return isConvertShow;
    }

    public void setIsConvertShow(Byte isConvertShow) {
        this.isConvertShow = isConvertShow;
    }

    public BigDecimal getConvertNum() {
        return convertNum;
    }

    public void setConvertNum(BigDecimal convertNum) {
        this.convertNum = convertNum;
    }

    public String getConvertUnit() {
        return convertUnit;
    }

    public void setConvertUnit(String convertUnit) {
        this.convertUnit = convertUnit == null ? null : convertUnit.trim();
    }

    public Integer getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(Integer deliveryTime) {
        this.deliveryTime = deliveryTime;
    }
}