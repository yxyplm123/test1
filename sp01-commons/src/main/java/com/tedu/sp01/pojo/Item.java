package com.tedu.sp01.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//get set方法，必要的构造方法
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Item {

	private Integer id;		//商品的订单号
	private String name;	//商品的名称
	private Integer number;//商品库存
}
