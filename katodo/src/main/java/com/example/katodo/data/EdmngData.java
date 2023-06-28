package com.example.katodo.data;

import java.util.List;
import java.util.Map;

import lombok.Data;

@Data
public class EdmngData {
	//画面入力値を記憶
	private String tokuisaki_name = "";
	private String const_bgn = "";
	private String const_end = "";
	
	private String property = "";
	private String est_bgn = "";
	private String est_end = "";
	
	private String tanto = "";
	private String del_bgn = "";
	private String del_end = "";
	
	private String dept = "";
	private String po_num1 = "";
	private String po_num2 = "";
	
	private String hurigana ="";
	
	private List<Map<String,Object>> list;	//一覧表示用
	private String searchFlg = "0";			//既に検索機能を動かしたかどうか 0=まだ押してない 1=既に検索済み
	private int page = 0;					//ページネーション作成用
	private int startPage = 0;				//他画面(Edit画面へ飛ぶときに、何ページ目が表示されていたかを記憶)
	private boolean data_flg = true;		//true : 新規登録	false : 編集登録
	
	private int disabled = 0;
	
	//DB用
	private String kanri_no ="";
	private String bukken_no = "";
	private String tokuisaki_no = "";
	private String koji_kanryo_date = "";
	private String memo = "";
	private int	   e_flg = 0;
	private int 	d_flg = 0;
	private int 	seikyu_flg = 1;
	private String e_date = "";
	private String d_date = "";
	private int 	e_gokei = 0;
	private int 	d_gokei = 0;
	private int 	e_tax = 0;
	private int 	d_tax = 0;
	private int 	e_total = 0;
	private int 	d_total = 0;
	private String e_tekiyo= "";
	private String d_tekiyo = "";
	private String hachu_no = "";
	private String nendo = "";
	
	
	//案件管理登録画面用
	private String title="";
	private String ENtitle="";
	private String jsFunc="";
	private String action="";
}
