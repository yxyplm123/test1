package com.tedu.sp01.pojo;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//get set方法，必要的构造方法
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {

	private String id;		//订单的id号
	private User user;	//用户对象
	private List<Item> items;//多个商品
}
