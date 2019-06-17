package com.springcloud.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * users���ж�Ӧ��ʵ�壺���ڷ�װusers����һ���û���Ϣ
 * 
 * @author ����
 *
 */
@Entity
@Table(name = "users")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Users implements java.io.Serializable {

	private static final long serialVersionUID = 2504015899170623862L;

	/**
	 * �û����
	 */
	@Id
	@Column(name = "user_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer userId;

	/**
	 * �û�����
	 */
	@Column(name = "user_name")
	private String userName;

	/**
	 * ���֤��
	 */
	@Column(name = "user_number")
	private String userNumber;

	/**
	 * �û�����
	 */
	@Column(name = "user_password")
	private String userPassword;

	/**
	 * �û��Ա�0Ϊ�У�1ΪŮ��
	 */
	@Column(name = "user_sex")
	private Integer userSex;

	/**
	 * ��ϵ�绰
	 */
	@Column(name = "user_phone")
	private String userPhone;

	/**
	 * �ջ���ַ
	 */
	@Column(name = "user_site")
	private String userSite;

	/**
	 * �������ڣ�yyyy-MM-dd
	 */
	@Column(name = "user_birthday")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private String userBirthday;

	/**
	 * ��������
	 */
	@Column(name = "user_email")
	private String userEmail;

	/**
	 * �û�ͷ��
	 */
	@Column(name = "user_photo")
	private String userPhoto;

	/**
	 * Ȩ�ޱ�ţ�1Ϊ��������Ա��2Ϊ��ͨ����Ա��3Ϊ��ͨ�û���4ΪVIP�û���
	 */
	@Column(name = "jdiction_id")
	private Integer jdictionId;

	/**
	 * �û�״̬��0Ϊ���ã�1Ϊ���ã�
	 */
	@Column(name = "user_status")
	private Integer userStatus;
}
