package com.qianfeng.fxmall.goods.bean;


import java.io.Serializable;
import java.util.List;

public class WxbGood implements Serializable {

  private String goodId;
  private String goodName;
  private String customerId;
  private String goodPic;
  private String goodPic1;
  private String goodPic2;
  private String promoteDesc;
  private String skuTitle;
  private String skuCost;
  private String skuPrice;
  private String skuPmoney;
  private String copyIds;
  private String copyDesc;
  private String forwardLink;
  private Integer orderNo;
  private String typeId;
  private String tags;
  private Integer state;
  private java.sql.Timestamp createTime;
  private Integer toped;
  private Integer recomed;
  private java.sql.Timestamp topedTime;
  private java.sql.Timestamp recomedTime;
  private String spcId;
  private String zonId;
  private Integer sellNum;
  private String website;
  private Integer iswxpay;
  private Integer isfdfk;
  private Integer leixingId;
  private String kfqq;

  private List<WxbGoodSku> skuList;

  public List<WxbGoodSku> getSkuList() {
    return skuList;
  }

  public void setSkuList(List<WxbGoodSku> skuList) {
    this.skuList = skuList;
  }


  public String getGoodId() {
    return goodId;
  }

  public void setGoodId(String goodId) {
    this.goodId = goodId;
  }

  public String getGoodName() {
    return goodName;
  }

  public void setGoodName(String goodName) {
    this.goodName = goodName;
  }

  public String getCustomerId() {
    return customerId;
  }

  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }

  public String getGoodPic() {
    return goodPic;
  }

  public void setGoodPic(String goodPic) {
    this.goodPic = goodPic;
  }

  public String getGoodPic1() {
    return goodPic1;
  }

  public void setGoodPic1(String goodPic1) {
    this.goodPic1 = goodPic1;
  }

  public String getGoodPic2() {
    return goodPic2;
  }

  public void setGoodPic2(String goodPic2) {
    this.goodPic2 = goodPic2;
  }

  public String getPromoteDesc() {
    return promoteDesc;
  }

  public void setPromoteDesc(String promoteDesc) {
    this.promoteDesc = promoteDesc;
  }

  public String getSkuTitle() {
    return skuTitle;
  }

  public void setSkuTitle(String skuTitle) {
    this.skuTitle = skuTitle;
  }

  public String getSkuCost() {
    return skuCost;
  }

  public void setSkuCost(String skuCost) {
    this.skuCost = skuCost;
  }

  public String getSkuPrice() {
    return skuPrice;
  }

  public void setSkuPrice(String skuPrice) {
    this.skuPrice = skuPrice;
  }

  public String getSkuPmoney() {
    return skuPmoney;
  }

  public void setSkuPmoney(String skuPmoney) {
    this.skuPmoney = skuPmoney;
  }

  public String getCopyIds() {
    return copyIds;
  }

  public void setCopyIds(String copyIds) {
    this.copyIds = copyIds;
  }

  public String getCopyDesc() {
    return copyDesc;
  }

  public void setCopyDesc(String copyDesc) {
    this.copyDesc = copyDesc;
  }

  public String getForwardLink() {
    return forwardLink;
  }

  public void setForwardLink(String forwardLink) {
    this.forwardLink = forwardLink;
  }

  public Integer getOrderNo() {
    return orderNo;
  }

  public void setOrderNo(Integer orderNo) {
    this.orderNo = orderNo;
  }

  public String getTypeId() {
    return typeId;
  }

  public void setTypeId(String typeId) {
    this.typeId = typeId;
  }

  public String getTags() {
    return tags;
  }

  public void setTags(String tags) {
    this.tags = tags;
  }

  public Integer getState() {
    return state;
  }

  public void setState(Integer state) {
    this.state = state;
  }

  public java.sql.Timestamp getCreateTime() {
    return createTime;
  }

  public void setCreateTime(java.sql.Timestamp createTime) {
    this.createTime = createTime;
  }

  public Integer getToped() {
    return toped;
  }

  public void setToped(Integer toped) {
    this.toped = toped;
  }

  public Integer getRecomed() {
    return recomed;
  }

  public void setRecomed(Integer recomed) {
    this.recomed = recomed;
  }

  public java.sql.Timestamp getTopedTime() {
    return topedTime;
  }

  public void setTopedTime(java.sql.Timestamp topedTime) {
    this.topedTime = topedTime;
  }

  public java.sql.Timestamp getRecomedTime() {
    return recomedTime;
  }

  public void setRecomedTime(java.sql.Timestamp recomedTime) {
    this.recomedTime = recomedTime;
  }

  public String getSpcId() {
    return spcId;
  }

  public void setSpcId(String spcId) {
    this.spcId = spcId;
  }

  public String getZonId() {
    return zonId;
  }

  public void setZonId(String zonId) {
    this.zonId = zonId;
  }

  public Integer getSellNum() {
    return sellNum;
  }

  public void setSellNum(Integer sellNum) {
    this.sellNum = sellNum;
  }

  public String getWebsite() {
    return website;
  }

  public void setWebsite(String website) {
    this.website = website;
  }

  public Integer getIswxpay() {
    return iswxpay;
  }

  public void setIswxpay(Integer iswxpay) {
    this.iswxpay = iswxpay;
  }

  public Integer getIsfdfk() {
    return isfdfk;
  }

  public void setIsfdfk(Integer isfdfk) {
    this.isfdfk = isfdfk;
  }

  public Integer getLeixingId() {
    return leixingId;
  }

  public void setLeixingId(Integer leixingId) {
    this.leixingId = leixingId;
  }

  public String getKfqq() {
    return kfqq;
  }

  public void setKfqq(String kfqq) {
    this.kfqq = kfqq;
  }

  public WxbGood(String goodId, String goodName, String customerId,
                 String goodPic, String goodPic1, String goodPic2,
                 String promoteDesc, String skuTitle, String skuCost,
                 String skuPrice, String skuPmoney, String copyIds,
                 String copyDesc, String forwardLink, Integer orderNo,
                 String typeId, String tags, Integer state, java.sql.Timestamp createTime,
                 Integer toped, Integer recomed, java.sql.Timestamp topedTime, java.sql.Timestamp recomedTime,
                 String spcId, String zonId, Integer sellNum, String website,
                 Integer iswxpay, Integer isfdfk, Integer leixingId, String kfqq) {
    this.goodId = goodId;
    this.goodName = goodName;
    this.customerId = customerId;
    this.goodPic = goodPic;
    this.goodPic1 = goodPic1;
    this.goodPic2 = goodPic2;
    this.promoteDesc = promoteDesc;
    this.skuTitle = skuTitle;
    this.skuCost = skuCost;
    this.skuPrice = skuPrice;
    this.skuPmoney = skuPmoney;
    this.copyIds = copyIds;
    this.copyDesc = copyDesc;
    this.forwardLink = forwardLink;
    this.orderNo = orderNo;
    this.typeId = typeId;
    this.tags = tags;
    this.state = state;
    this.createTime = createTime;
    this.toped = toped;
    this.recomed = recomed;
    this.topedTime = topedTime;
    this.recomedTime = recomedTime;
    this.spcId = spcId;
    this.zonId = zonId;
    this.sellNum = sellNum;
    this.website = website;
    this.iswxpay = iswxpay;
    this.isfdfk = isfdfk;
    this.leixingId = leixingId;
    this.kfqq = kfqq;
  }

  public WxbGood() {
  }

  @Override
  public String toString() {
    return "WxbGood{" +
            "goodId='" + goodId + '\'' +
            ", goodName='" + goodName + '\'' +
            ", customerId='" + customerId + '\'' +
            ", goodPic='" + goodPic + '\'' +
            ", goodPic1='" + goodPic1 + '\'' +
            ", goodPic2='" + goodPic2 + '\'' +
            ", promoteDesc='" + promoteDesc + '\'' +
            ", skuTitle='" + skuTitle + '\'' +
            ", skuCost='" + skuCost + '\'' +
            ", skuPrice='" + skuPrice + '\'' +
            ", skuPmoney='" + skuPmoney + '\'' +
            ", copyIds='" + copyIds + '\'' +
            ", copyDesc='" + copyDesc + '\'' +
            ", forwardLink='" + forwardLink + '\'' +
            ", orderNo=" + orderNo +
            ", typeId='" + typeId + '\'' +
            ", tags='" + tags + '\'' +
            ", state=" + state +
            ", createTime=" + createTime +
            ", toped=" + toped +
            ", recomed=" + recomed +
            ", topedTime=" + topedTime +
            ", recomedTime=" + recomedTime +
            ", spcId='" + spcId + '\'' +
            ", zonId='" + zonId + '\'' +
            ", sellNum=" + sellNum +
            ", website='" + website + '\'' +
            ", iswxpay=" + iswxpay +
            ", isfdfk=" + isfdfk +
            ", leixingId=" + leixingId +
            ", kfqq='" + kfqq + '\'' +
            ", skuList=" + skuList +
            '}';
  }
}
