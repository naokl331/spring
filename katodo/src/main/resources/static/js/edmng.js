
//読み込み時に自動起動
$(function(){
	let searchFlg = $("#searchFlg").val();
	if(searchFlg == 1)searchEdmng($("#startPage").val());
});


function searchEdmng(flg){
	
	$("#searchFlg").val("1");
	$("#startPage").val(flg);
	
	let data = $("#searchForm").serialize();
	
	$.post(
		"getPages4Edmng",
		data,
		function(rtn){

			if(rtn == 0){
				$("#pagination").twbsPagination('destroy');
				$("#edmngTable").text("該当するデータはありません");
				return;
			}
			//ページネーション表示
			$("#pagination").twbsPagination('destroy');
			$("#pagination").twbsPagination({
				startPage:parseInt($("#startPage").val()),
				totalPages: rtn,
				visiblePages: 10,
				onPageClick: function(event,page){
					$("#page").val(page);
					$("#startPage").val(page);
					getList();
				}
			});
		}
	);
	
}

//リスト取得用function
 function getList(){
	let data = $("#searchForm").serialize();

	 $.post(
		 "getList4Edmng",
		 data,
		 function(rtn){
			 $("#edmngTable").html(rtn);
		 }
	 );
 }
 