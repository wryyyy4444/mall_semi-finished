package com.mole.common.entity.marketing;

import io.swagger.v3.oas.annotations.media.Schema;

import java.io.Serializable;
import java.util.Date;

public class SmsCouponHistory implements Serializable {

	@Schema(description = "历史记录ID")
	private Long id;

	@Schema(description = "优惠券ID")
	private Long couponId;

	@Schema(description = "会员ID")
	private Long memberId;

	@Schema(description = "优惠券代码")
	private String couponCode;

	@Schema(description = "领取人昵称")
	private String memberNickname;

	@Schema(description = "获取类型：0->后台赠送；1->主动获取")
	private Integer getType;

	private Date createTime;

	@Schema(description = "使用状态：0->未使用；1->已使用；2->已过期")
	private Integer useStatus;

	@Schema(description = "使用时间")
	private Date useTime;

	@Schema(description = "订单编号")
	private Long orderId;

	@Schema(description = "订单号码")
	private String orderSn;

	private static final long serialVersionUID = 1L;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getCouponId() {
		return couponId;
	}

	public void setCouponId(Long couponId) {
		this.couponId = couponId;
	}

	public Long getMemberId() {
		return memberId;
	}

	public void setMemberId(Long memberId) {
		this.memberId = memberId;
	}

	public String getCouponCode() {
		return couponCode;
	}

	public void setCouponCode(String couponCode) {
		this.couponCode = couponCode;
	}

	public String getMemberNickname() {
		return memberNickname;
	}

	public void setMemberNickname(String memberNickname) {
		this.memberNickname = memberNickname;
	}

	public Integer getGetType() {
		return getType;
	}

	public void setGetType(Integer getType) {
		this.getType = getType;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Integer getUseStatus() {
		return useStatus;
	}

	public void setUseStatus(Integer useStatus) {
		this.useStatus = useStatus;
	}

	public Date getUseTime() {
		return useTime;
	}

	public void setUseTime(Date useTime) {
		this.useTime = useTime;
	}

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public String getOrderSn() {
		return orderSn;
	}

	public void setOrderSn(String orderSn) {
		this.orderSn = orderSn;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getClass().getSimpleName());
		sb.append(" [");
		sb.append("Hash = ").append(hashCode());
		sb.append(", id=").append(id);
		sb.append(", couponId=").append(couponId);
		sb.append(", memberId=").append(memberId);
		sb.append(", couponCode=").append(couponCode);
		sb.append(", memberNickname=").append(memberNickname);
		sb.append(", getType=").append(getType);
		sb.append(", createTime=").append(createTime);
		sb.append(", useStatus=").append(useStatus);
		sb.append(", useTime=").append(useTime);
		sb.append(", orderId=").append(orderId);
		sb.append(", orderSn=").append(orderSn);
		sb.append(", serialVersionUID=").append(serialVersionUID);
		sb.append("]");
		return sb.toString();
	}
}