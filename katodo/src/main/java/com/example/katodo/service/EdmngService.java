package com.example.katodo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.katodo.data.EdmngData;
import com.example.katodo.repositry.EdmngRepository;

@Service
public class EdmngService {

	@Autowired
	EdmngRepository er;
	
	
	//-------------------------------------
	//	モーダル得意先リストセットto ed
	//-------------------------------------
	public void getList(EdmngData ed) {
		
		er.getCustomerList4Modal(ed);
	}
	
	
	//-------------------------------------
	//	モーダル物件リストセット to ed
	//-------------------------------------
	public void getBukkenList(EdmngData ed) {
		
		er.getBukkenList(ed);
	}
	
	
}