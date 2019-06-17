package com.springcloud.service;

import org.springframework.data.domain.Page;

import com.springcloud.entity.Users;

/**
 * ģ�Ͳ�Ľӿڣ����ڶ����û�ģ��ķ���
 * 
 * @author ����
 *
 */
public interface UsersService {
	/**
	 * ��֤�û���¼�Ƿ�ɹ�
	 * 
	 * @param userId       �û����
	 * @param userPassword �û�����
	 * @param jdictonId    Ȩ�ޱ��
	 * @return �ɹ����ص�¼�û���������Ϣ��ʧ�ܷ���null
	 */
	public abstract Users login(Integer userId, String userPassword, Integer jdictionId);

	/**
	 * ����µ��û���Ϣ
	 * 
	 * @param users �µ��û���Ϣ
	 * @return ��ӳɹ�������com.springcloud.entity.Users���͵�ʵ�������򷵻�null
	 */
	public abstract Users insert(Users users);

	/**
	 * ��ѯ�����������û���Ϣ
	 * 
	 * @param users      ��ѯ����
	 * @param pageNumber ��ѯҳ��
	 * @return �ɹ�����org.springframework.data.domain.Page���͵�ʵ�������򷵻�null
	 */
	public abstract Page<Users> select(Users users, Integer pageNumber);

	/**
	 * �޸�ָ����ŵ��û�״̬
	 * 
	 * @param userId     �û����
	 * @param userStatus �û�״̬
	 * @return �޸ĳɹ����ش���������������򷵻�0
	 */
	public abstract Integer updateStatus(Integer userId, Integer userStatus);

	/**
	 * ��ѯָ����ŵ��û���Ϣ
	 * 
	 * @param userId �û����
	 * @return �ɹ�����com.springcloud.entity.Users���͵�ʵ��,���򷵻ؿ�
	 */
	public abstract Users selectById(Integer userId);

	/**
	 * �޸�ָ����ŵ��û�����Ϣ
	 * 
	 * @param users �û���Ϣ
	 * @return �޸ĳɹ����ش���0�����������򷵻�0
	 */
	public abstract Integer update(Users users);
	
	/**
	 * �޸Ĳ����޸�ָ����ŵ��û�ͷ����ǳƻ�����
	 * 
	 * @param users �޸ĵ��û���Ϣ
	 * @return �޸ĳɹ����ش���0�����������򷵻�0
	 */
	public abstract Integer updateMessage(Users users);

}
