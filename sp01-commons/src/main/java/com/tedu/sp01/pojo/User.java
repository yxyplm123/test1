package com.tedu.sp01.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//get set方法，必要的构造方法
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

	private Integer id;		//用户的id
	private String username;	//用户的名字
	private String password;//用户名的密码
}
