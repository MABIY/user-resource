package net.vipmro.user.resource.domain.model.po;

import java.math.BigDecimal;
import java.util.Date;

public class Goods {
    private Long id;

    private Integer cateId;

    private Integer brandId;

    private String goodsNo;

    private String buyNo;

    private String title;

    private String model;

    private String measure;

    private BigDecimal weight;

    private BigDecimal marketPrice;

    private String keywords;

    private String image;

    private Boolean isNew;

    private Byte isHot;

    private Integer orderSn;

    private String status;

    private Integer createUserId;

    private Date createTime;

    private Integer modifyUserId;

    private Date modifyTime;

    private String series;

    private Integer thirdKey;

    private String isManual;

    private String synCode;

    private Long spuId;

    private String remark;

    private String packageNum;

    private String size;

    private BigDecimal cubage;

    private String barCode;

    private String secondCateId;

    private String seriesGroup;

    private String productArea;

    private Integer manufacturerId;

    private Byte isEffectived;

    private String synCodeEz;

    private String shortName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getCateId() {
        return cateId;
    }

    public void setCateId(Integer cateId) {
        this.cateId = cateId;
    }

    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    public String getGoodsNo() {
        return goodsNo;
    }

    public void setGoodsNo(String goodsNo) {
        this.goodsNo = goodsNo == null ? null : goodsNo.trim();
    }

    public String getBuyNo() {
        return buyNo;
    }

    public void setBuyNo(String buyNo) {
        this.buyNo = buyNo == null ? null : buyNo.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model == null ? null : model.trim();
    }

    public String getMeasure() {
        return measure;
    }

    public void setMeasure(String measure) {
        this.measure = measure == null ? null : measure.trim();
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public BigDecimal getMarketPrice() { return marketPrice;
    }

    public void setMarketPrice(BigDecimal marketPrice) {
        this.marketPrice = marketPrice;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords == null ? null : keywords.trim();
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image == null ? null : image.trim();
    }

    public Boolean getIsNew() {
        return isNew;
    }

    public void setIsNew(Boolean isNew) {
        this.isNew = isNew;
    }

    public Byte getIsHot() {
        return isHot;
    }

    public void setIsHot(Byte isHot) {
        this.isHot = isHot;
    }

    public Integer getOrderSn() {
        return orderSn;
    }

    public void setOrderSn(Integer orderSn) {
        this.orderSn = orderSn;
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

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series == null ? null : series.trim();
    }

    public Integer getThirdKey() {
        return thirdKey;
    }

    public void setThirdKey(Integer thirdKey) {
        this.thirdKey = thirdKey;
    }

    public String getIsManual() {
        return isManual;
    }

    public void setIsManual(String isManual) {
        this.isManual = isManual == null ? null : isManual.trim();
    }

    public String getSynCode() {
        return synCode;
    }

    public void setSynCode(String synCode) {
        this.synCode = synCode == null ? null : synCode.trim();
    }

    public Long getSpuId() {
        return spuId;
    }

    public void setSpuId(Long spuId) {
        this.spuId = spuId;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getPackageNum() {
        return packageNum;
    }

    public void setPackageNum(String packageNum) {
        this.packageNum = packageNum == null ? null : packageNum.trim();
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size == null ? null : size.trim();
    }

    public BigDecimal getCubage() {
        return cubage;
    }

    public void setCubage(BigDecimal cubage) {
        this.cubage = cubage;
    }

    public String getBarCode() {
        return barCode;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode == null ? null : barCode.trim();
    }

    public String getSecondCateId() {
        return secondCateId;
    }

    public void setSecondCateId(String secondCateId) {
        this.secondCateId = secondCateId == null ? null : secondCateId.trim();
    }

    public String getSeriesGroup() {
        return seriesGroup;
    }

    public void setSeriesGroup(String seriesGroup) {
        this.seriesGroup = seriesGroup == null ? null : seriesGroup.trim();
    }

    public String getProductArea() {
        return productArea;
    }

    public void setProductArea(String productArea) {
        this.productArea = productArea == null ? null : productArea.trim();
    }

    public Integer getManufacturerId() {
        return manufacturerId;
    }

    public void setManufacturerId(Integer manufacturerId) {
        this.manufacturerId = manufacturerId;
    }

    public Byte getIsEffectived() {
        return isEffectived;
    }

    public void setIsEffectived(Byte isEffectived) {
        this.isEffectived = isEffectived;
    }

    public String getSynCodeEz() {
        return synCodeEz;
    }

    public void setSynCodeEz(String synCodeEz) {
        this.synCodeEz = synCodeEz == null ? null : synCodeEz.trim();
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName == null ? null : shortName.trim();
    }
}