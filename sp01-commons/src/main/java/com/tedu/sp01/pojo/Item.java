package com.tedu.sp01.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//get set��������Ҫ�Ĺ��췽��
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Item {

	private Integer id;		//��Ʒ�Ķ�����
	private String name;	//��Ʒ������
	private Integer number;//��Ʒ���
}
