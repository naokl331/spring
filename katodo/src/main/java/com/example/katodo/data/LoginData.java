package com.example.katodo.data;

import lombok.Data;

@Data
public class LoginData {
	//フィールド	//HTMLのid属性の値と等しい名前にする
	private String id 	= "";
	private String pass = "";
	private String msg 	= "";
	private String name = "";
	private String year = "";
}

