package com.example.katodo.repositry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.katodo.data.MenuData;

@Repository
public class MenuRepository {

	@Autowired
	JdbcTemplate jt;
	
	//メニューリスト取得用
	public void getMenuList(MenuData md) {
		/*md.setLs_mastamente(jt.queryForList("select name,url from m_menu where category = '1' order by hyouji_jun"));
		md.setLs_business(jt.queryForList("select name,url from m_menu where category = '1' order by hyouji_jun"));
		md.setLs_system(jt.queryForList("select name,url from m_menu where category = '1' order by hyouji_jun"));*/
		
		String sql = "select menu_name,url from m_menu where category = ? order by hyouji_jun";
		md.setLs_mastamente(jt.queryForList(sql,"1"));
		md.setLs_business(jt.queryForList(sql,"2"));
		md.setLs_system(jt.queryForList(sql,"3"));
	}
	
}
