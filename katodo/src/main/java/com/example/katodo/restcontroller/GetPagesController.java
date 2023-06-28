package com.example.katodo.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.katodo.data.CustomerData;
import com.example.katodo.data.EdmngData;
import com.example.katodo.repositry.CustomerRepository;
import com.example.katodo.repositry.EdmngRepository;

@RestController
public class GetPagesController {
	
	@Autowired
	CustomerRepository cr;
	
	@Autowired
	EdmngRepository er;

	//-------------------------------------
	//		得意先一覧用ページ数返却
	//-------------------------------------
	@PostMapping("/getPages4Customer")
	public int forCustomerList(@ModelAttribute("cd") CustomerData cd, Model model) {
		
		return cr.getPageCount(cd);
	}
	
	
	//-------------------------------------
	//		案件管理一覧用ページ数返却
	//-------------------------------------
	@PostMapping("/getPages4Edmng")
	public int forEdmngList(@ModelAttribute("ed") EdmngData ed, Model model) {
		
		return er.getPageCount(ed);
	}
	
	
	//-------------------------------------
	//	モーダル得意先リストページ数返却
	//-------------------------------------
	@PostMapping("/getPages4CustomerRef")
	public int forCustomerRefList(@ModelAttribute("ed") EdmngData ed, Model model) {
		
		return er.getRefPageCount(ed);
	}
	
	
	//-------------------------------------
	//	モーダル物件リストページ数返却
	//-------------------------------------
	@PostMapping("/getPages4BukkenRef")
	public int forBukkenRefList(@ModelAttribute("ed") EdmngData ed, Model model) {
		
		return er.getBukkenPageCount(ed);
	}
	
	
}
