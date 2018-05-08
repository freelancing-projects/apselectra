function validate() {
	var name = document.getElementById("name").value;
	if (name == '') {
		alert('Please enter a valid name.');
		return false;
	} else {
		return true;
	}
}

function switchTab(type){
	if($(type).html() == 'Specifications'){
		$("#pdf-li").removeAttr("class");
		$("#spec-li").attr("class","active");
		$("#shop-tab2").css("display", "none");
		$("#shop-tab1").css("display", "block");
	}else{
		$("#spec-li").removeAttr("class");
		$("#pdf-li").attr("class","active");
		$("#shop-tab1").css("display", "none");
		$("#shop-tab2").css("display", "block");
	}
}