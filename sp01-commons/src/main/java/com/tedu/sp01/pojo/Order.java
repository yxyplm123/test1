package com.tedu.sp01.pojo;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//get set��������Ҫ�Ĺ��췽��
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {

	private String id;		//������id��
	private User user;	//�û�����
	private List<Item> items;//�����Ʒ
}
