package com.springcloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * class1���Ӧ��ʵ����
 * 
 * @author ����
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Class1 implements java.io.Serializable {

	private static final long serialVersionUID = -5300706713029666878L;

	/**
	 * �Լ������
	 */
	private Integer class1Id;

	/**
	 * һ���������
	 */
	private String class1Name;

	/**
	 * ���
	 */
	private Integer class1Num;

	/**
	 * ��ע
	 */
	private String remark;

}