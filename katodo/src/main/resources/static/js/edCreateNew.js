
let modaal1;	//得意先用
let modaal2;	//物件用

$(function(){	//このjsが呼ばれた時に呼ばれる

	modaal1 = $(".mdl1").modaal({type:"ajax"});	//.mdl1というクラスがついた部品が押されたとき
	modaal2 = $(".mdl2").modaal({type:"ajax"});
	
});


function choiceCustomer(no,name){
	//alert(no + ":" + name);
	$("#tokuisaki_name").val(name);
	$("#tokuisaki_no").val(no);
	modaal1.modaal("close");
}


function choiceBukken(no,name){
	//alert(no + ":" + name);
	$("#property").val(name);
	$("#bukken_no").val(no);
	modaal2.modaal("close");
}


//キャンセルボタン押下
 function cancel(){
	if(window.confirm("登録を中断して一覧画面に戻ります。よろしいですか？")){
		window.location.href = "back2Edmng";
	} 
 }
 

 function searchCustomerRef(){
	 
	let data = {
  		"tokuisaki_name":$("#search_tokuisaki").val(),
  		"hurigana":$("#search_hurigana").val()
	};
	
	 $.post(
		"getPages4CustomerRef",
		data,
		function(rtn){
			//alert(rtn);
			if(rtn == 0){
				$("#pagination").twbsPagination('destroy');
				$("#customerRef").html("<h5>該当するデータはありません</h5>");
				return;
			}
			//ページネーション表示
			$("#pagination").twbsPagination('destroy');	//前のページネーション情報を消去する
			$("#pagination").twbsPagination({
				totalPages: rtn,
				visiblePages: 5,
				onPageClick: function(event,page){
					data["page"] = page;
					getList(data);	//リスト取得用functionの呼び出し				
				}
			});
		}
	);
	 
 }
 
 
 //リスト取得用function
 function getList(data){

	 $.post(
		 "getList4Ref",
		 data,
		 function(rtn){
			 $("#customerRef").html(rtn);
		 }
	 );
 }
 
 
 function searchBukkenRef2(){
	 
	let data = {
  		"property":$("#search_bukken").val(),
  		"hurigana":$("#search_hurigana").val()
	};
	
	//alert(data["tokuisaki_name"]);
	//alert(data["hurigana"]);
	 
	 $.post(
		"getPages4BukkenRef",
		data,
		function(rtn){
			//alert(rtn);
			if(rtn == 0){
				$("#pagination").twbsPagination('destroy');
				$("#bukkenRef").html("<h5>該当するデータはありません</h5>");
				return;
			}
			//ページネーション表示
			$("#pagination").twbsPagination('destroy');	//前のページネーション情報を消去する
			$("#pagination").twbsPagination({
				totalPages: rtn,
				visiblePages: 5,
				onPageClick: function(event,page){
					data["page"] = page;
					getList4BukkenRef(data);	//リスト取得用functionの呼び出し				
				}
			});
		}
	);
	 
 }
 
 //リスト取得用function
 function getList4BukkenRef(data){

	 $.post(
		 "getList4BukkenRef",
		 data,
		 function(rtn){
			 $("#bukkenRef").html(rtn);
		 }
	 );
 }
 
 
 function cancelRef(){
	modaal1.modaal("close");
	modaal2.modaal("close");
 }
 
 
 
 //登録ボタン押下
 function putButton(){
	 //必須チェック
	//得意先No
	if($("#tokuisaki_no").val().length == 0) {
		alert("得意先名を入力してください");
		return false;
	}
	
	//物件No
	if($("#bukken_no").val().length == 0) {
		alert("物件名を入力してください");
		return false;
	}
	
	//物件name
	if($("#bukken_name").val().length == 0) {
		alert("物件名を選択してから名称を変更してください。");
		return false;
	}
	
	 //登録前確認
	 if(window.confirm("この内容で登録します。よろしいですか？")){
		 return true;
	}
	return false;
 }
 