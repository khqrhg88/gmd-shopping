package com.springcloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * goods���Ӧ��ʵ����
 * 
 * @author ����
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Goods implements java.io.Serializable {

	private static final long serialVersionUID = -4402382128795361272L;

	/**
	 * ��Ʒ���
	 */
	private Integer goodsId;

	/**
	 * ��Ʒ����
	 */
	private String goodsName;

	/**
	 * ��Ʒ�۸�
	 */
	private Double goodsPrices;

	/**
	 * ��Ʒ�ۿۼ�
	 */
	private Double goodsDiscount;

	/**
	 * ��Ʒ״̬��0Ԥ�ۣ�1�����У�2���¼�
	 */
	private Integer goodsStatus;

	/**
	 * ��Ʒ����
	 */
	private Integer goodsCount;

	/**
	 * �Ƿ���Ʒ��0����Ʒ��1������Ʒ
	 */
	private Integer goodsIsNew;

	/**
	 * �Ƿ�������0��������1��������
	 */
	private Integer goodsIsHot;

	/**
	 * ��Ʒ����0-4,5������
	 */
	private Integer goodsLevel;

	/**
	 * ��Ʒ���
	 */
	private String goodsBrief;

	/**
	 * ��Ʒ����
	 */
	private String goodsDetails;

	/**
	 * ��ƷͼƬ
	 */
	private String goodsPhoto;

	/**
	 * ��Ʒ���������
	 */
	private Integer class2Id;

	/**
	 * ��ѯ��������Ʒ�۸�����
	 */
	private Double goodsPricesMin;

	/**
	 * ��ѯ��������Ʒ�۸�����
	 */
	private Double goodsPricesMax;

	/**
	 * ��ѯ������һ�������
	 */
	private Integer class1Id;

	/**
	 * ��Ʒ������ ���ڱ���ͳ�Ʒ���Ľ��
	 */
	private Integer goodsSum;

}