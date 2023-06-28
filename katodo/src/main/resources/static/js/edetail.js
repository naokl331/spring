

let modal1;
let modal2;
let modal3;
let modal4;


$(function(){
	modal1 = $(".mdl1").modaal({type:'ajax'});
	modal2 = $(".mdl2").modaal({type:'ajax'});
	modal3 = $(".mdl3").modaal({type:'ajax'});
	modal4 = $(".mdl4").modaal({type:'ajax'});
});


//工事１選択
function choiceKoji1(name){
	$("#koji1").val(name);
	modal1.modaal("close");
}

//工事２選択
function choiceKoji2(name){
	$("#koji2").val(name);
	modal2.modaal("close");
}

//工事３選択
function choiceKoji3(name){
	$("#koji3").val(name);
	modal3.modaal("close");
}

//単位選択
function choiceTani(name){
	$("#tani").val(name);
	modal4.modaal("close");
}

function keisan(){
	let suryo = $("#suryo").val();
	let tanka = $("#tanka").val();
	if(suryo.length == 0) suryo = 0;
	if(tanka.length == 0) tanka = 0;
	
	let kingaku = Math.floor(suryo * tanka);	//小数点切り捨て
	$("#kingaku").val(kingaku);
	
}

function check(){
	
	//工事１～３どれかに値がほしい
	if($("#koji1").val().length == 0 && $("#koji2").val().length == 0 && $("#koji3").val().length == 0){
		$("#msg").text("工事１、工事２、工事３のいずれかに値が必要です。");
		return false;
	}
	return true;
}


function closepage(){
	if(window.confirm("登録を中止して、見積・納品データ編集登録画面に戻ります。よろしいですか？")){
		return true;
	}
	return false;
	
}

function recEditCancel(){
	if(window.confirm("見積書画面に戻ります。よろしいですか？")){
		location.href="back2Edetail?kanri_no=" + $("#kanri_no").val();
	}
	return false;
	
}



