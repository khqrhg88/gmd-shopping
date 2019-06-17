package com.springcloud.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageInfo;
import com.springcloud.common.PageUtils;
import com.springcloud.entity.Orders;
import com.springcloud.service.OrdersService;
import com.springcloud.vo.ResultValue;

/**
 * 订单模块的控制层
 * 
 * @author 滕红
 *
 */
@RestController
@RequestMapping("orders")
public class OrdersController {

	@Autowired
	private OrdersService ordersServcie;

	/**
	 * 查询满足条件的订单信息
	 * 
	 * @param orders     查询条件
	 * @param pageNumber 页数
	 * @return 成功返回com.github.pagehelper.PageInfo<Orders>类型的实例
	 */
	@RequestMapping(value = "/selectOrders")
	public ResultValue selectOrders(Orders orders, @RequestParam("pageNumber") Integer pageNumber) {
		ResultValue rv = new ResultValue();

		try {
			// 查询满足条件的订单信息
			PageInfo<Orders> pageInfo = this.ordersServcie.selectOrders(orders, pageNumber);
			// 从分页信息中获得订单信息
			List<Orders> list = pageInfo.getList();
			// 如果查询到了满足条件的订单信息
			if (list != null && list.size() > 0) {
				rv.setCode(0);

				Map<String, Object> map = new HashMap<>();
				// 将订单信息以指定的键存入Map集合中
				map.put("ordersList", list);

				PageUtils pageUtils = new PageUtils(pageInfo.getPages() * PageUtils.PAGE_ROW_COUNT);
				pageUtils.setPageNumber(pageNumber);
				// 将分页信息以指定的名字存入Map集合中
				map.put("pageUtils", pageUtils);

				rv.setDataMap(map);
				return rv;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		rv.setCode(1);
		rv.setMessage("没有找到订单信息！");
		return rv;
	}

	/**
	 * 修改指定编号订单的订单状态
	 * 
	 * @param orders 修改的订单信息
	 * @return 成功返回大于零0的整数，否则返回小于等于0的整数
	 */
	@RequestMapping("/updateOrdersStatus")
	public ResultValue updateOrdersStatus(Orders orders) {
		ResultValue rv = new ResultValue();

		try {
			Integer ordersStatus = this.ordersServcie.updateOrdersStatus(orders);
			if (ordersStatus > 0) {
				rv.setCode(0);
				rv.setMessage("订单状态修改成功!");
				return rv;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		rv.setCode(1);
		rv.setMessage("订单状态修改失败！");
		return rv;
	}

	/**
	 * 查询指定日期范围内的销售额
	 * 
	 * @param orders 查询条件
	 * @return
	 */
	@RequestMapping("/selectGroup")
	public ResultValue selectGroup(Orders orders) {
		ResultValue rv = new ResultValue();

		try {
			List<Orders> list = this.ordersServcie.selectGroup(orders);
			if (list != null && list.size() > 0) {
				rv.setCode(0);
				// 创建两个集合，用于保存柱状图x轴与y轴的数据
				List<String> x = new ArrayList<>();
				List<Double> y = new ArrayList<>();
				// 将查询结果中插入x集合，y集合
				for (Orders o : list) {
					x.add(o.getOrderMonth());
					y.add(o.getOrderPrice());
				}
				Map<String, Object> map = new HashMap<>();
				map.put("x", x);
				map.put("y", y);
				rv.setDataMap(map);

				return rv;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		rv.setCode(1);
		return rv;
	}
}
