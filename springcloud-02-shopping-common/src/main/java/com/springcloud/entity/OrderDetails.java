package com.springcloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * ORDER_DETAILS表中对应的实体类，用于封装一行订单明细信息
 * 
 * @author 滕红
 *
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderDetails implements java.io.Serializable {

	private static final long serialVersionUID = 5081558009467170423L;

	/**
	 * 订单明细编号
	 */
	private Integer orderDetailId;

	/**
	 * 订单编号
	 */
	private Integer orderId;

	/**
	 * 商品编号
	 */
	private Integer goodsId;

	/**
	 * 商品名称
	 */
	private String goodsName;

	/**
	 * 成交价
	 */
	private Double transactionPrice;

	/**
	 * 成交数量
	 */
	private Integer transactionCount;

}