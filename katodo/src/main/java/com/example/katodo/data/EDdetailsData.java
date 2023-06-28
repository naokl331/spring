package com.example.katodo.data;

import java.util.List;
import java.util.Map;

import lombok.Data;

@Data
public class EDdetailsData {

	private int 	kanri_no;
	private String	tokuisaki_name;
	private String	bukken_name;
	private String	tanto="";
	private String	e_date="";
	private String	d_date="";
	private int		e_gokei = 0;
	private int		d_gokei = 0;
	private int		e_tax = 0;
	private int 	d_tax = 0;
	private int 	e_total = 0;
	private int 	d_total = 0;
	private String	e_tekiyo = "";
	private String	d_tekiyo = "";
	private int 	rec_no;
	
	private String 	koji1 = "";
	private String 	koji2 = "";
	private String 	koji3 = "";
	private float 	suryo = 0.0f;
	private String 	tani = "";
	private float 	tanka = 0.0f;
	private int 	kingaku = 0;
	private int 	tax_flg = 0;			//0=計算対象 1=計算対象外
	private String 	biko = "";
	private String 	nendo = "";
	private List<Map<String,Object>> list;
	//一時テーブル初期化フラグ
	private boolean tmpTable_flg = true;	//true = 初期化する	false = 初期化しない
	
}
