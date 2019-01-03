package net.vipmro.user.resource.domain.model.po;

import java.util.Date;

public class Category {
    private Integer id;

    private String cateNo;

    private String name;

    private Integer parentId;

    private int isLeaf;

    private String icon;

    private String brief;

    private String status;

    private Integer createUserId;

    private Date createTime;

    private Integer modifyUserId;

    private Date modifyTime;

    private String hasGoods;

    private String hasInitialGoods;

    private String shortName;

    private Integer orderSn;

    private String hasMallGoods;

    private Boolean isDisplay;

    private String appImage;

    private String appUrl;

    private String pcUrl;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCateNo() {
        return cateNo;
    }

    public void setCateNo(String cateNo) {
        this.cateNo = cateNo == null ? null : cateNo.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public int getIsLeaf() {
        return isLeaf;
    }

    public void setIsLeaf(int isLeaf) {
        this.isLeaf = isLeaf;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }

    public String getBrief() {
        return brief;
    }

    public void setBrief(String brief) {
        this.brief = brief == null ? null : brief.trim();
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

    public String getHasGoods() {
        return hasGoods;
    }

    public void setHasGoods(String hasGoods) {
        this.hasGoods = hasGoods == null ? null : hasGoods.trim();
    }

    public String getHasInitialGoods() {
        return hasInitialGoods;
    }

    public void setHasInitialGoods(String hasInitialGoods) {
        this.hasInitialGoods = hasInitialGoods == null ? null : hasInitialGoods.trim();
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName == null ? null : shortName.trim();
    }

    public Integer getOrderSn() {
        return orderSn;
    }

    public void setOrderSn(Integer orderSn) {
        this.orderSn = orderSn;
    }

    public String getHasMallGoods() {
        return hasMallGoods;
    }

    public void setHasMallGoods(String hasMallGoods) {
        this.hasMallGoods = hasMallGoods == null ? null : hasMallGoods.trim();
    }

    public Boolean getIsDisplay() {
        return isDisplay;
    }

    public void setIsDisplay(Boolean isDisplay) {
        this.isDisplay = isDisplay;
    }

    public String getAppImage() {
        return appImage;
    }

    public void setAppImage(String appImage) {
        this.appImage = appImage == null ? null : appImage.trim();
    }

    public String getAppUrl() {
        return appUrl;
    }

    public void setAppUrl(String appUrl) {
        this.appUrl = appUrl == null ? null : appUrl.trim();
    }

    public String getPcUrl() {
        return pcUrl;
    }

    public void setPcUrl(String pcUrl) {
        this.pcUrl = pcUrl == null ? null : pcUrl.trim();
    }
}