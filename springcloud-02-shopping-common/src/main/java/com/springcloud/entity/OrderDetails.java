package com.springcloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * ORDER_DETAILS���ж�Ӧ��ʵ���࣬���ڷ�װһ�ж�����ϸ��Ϣ
 * 
 * @author ����
 *
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderDetails implements java.io.Serializable {

	private static final long serialVersionUID = 5081558009467170423L;

	/**
	 * ������ϸ���
	 */
	private Integer orderDetailId;

	/**
	 * �������
	 */
	private Integer orderId;

	/**
	 * ��Ʒ���
	 */
	private Integer goodsId;

	/**
	 * ��Ʒ����
	 */
	private String goodsName;

	/**
	 * �ɽ���
	 */
	private Double transactionPrice;

	/**
	 * �ɽ�����
	 */
	private Integer transactionCount;

}