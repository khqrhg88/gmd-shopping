package com.springcloud.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageInfo;
import com.springcloud.common.PageUtils;
import com.springcloud.entity.OrderDetails;
import com.springcloud.service.OrderDetailsService;
import com.springcloud.vo.ResultValue;

/**
 * ������ϸģ��Ŀ��Ʋ�
 * 
 * @author hong
 *
 */
@RestController
@RequestMapping("orderDetails")
public class OrderDetailsController {

	@Autowired
	private OrderDetailsService orderDetailsService;

	@RequestMapping(value = "/selectByOrderId")
	public ResultValue selectByOrderId(@RequestParam("orderId") Integer orderId,
			@RequestParam("pageNumber") Integer pageNumber) {
		ResultValue rv = new ResultValue();

		try {
			// ��ѯ���������Ķ�����ϸ����Ϣ
			PageInfo<OrderDetails> pageInfo = this.orderDetailsService.selectByOrderId(orderId, pageNumber);
			// �ӷ�ҳ��ť�л�ö�����ϸ����Ϣ
			List<OrderDetails> list = pageInfo.getList();
			// �����ѯ�������������Ķ�����ϸ��Ϣ
			if (list != null && list.size() > 0) {
				rv.setCode(0);

				Map<String, Object> map = new HashMap<>();
				// ��������ϸ��Ϣ��ָ���ļ�����Map������
				map.put("orderDetailsList", list);

				PageUtils pageUtils = new PageUtils(5,pageInfo.getPages() * 5);
				pageUtils.setPageNumber(pageNumber);
				// ����ҳ��Ϣ��ָ�������ִ���Map������
				map.put("pageUtils", pageUtils);

				rv.setDataMap(map);
				return rv;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		rv.setCode(1);
		rv.setMessage("û���ҵ����������Ķ�����ϸ��Ϣ��");
		return rv;
	}

}
