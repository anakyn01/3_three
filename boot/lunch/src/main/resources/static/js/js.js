function includeHTML(){
	var z, i, elmnt, file, xhttp;//변수 선언
	
	z = document.getElementsByTagName("*");
	//z는 도큐먼트에서 모든 태그를 찾고
	for(i =0; i < z.length; i++){
	elmnt = z[i];
	//변수 elmnt에 태그에 개별을 대입
	file = elmnt.getAttribute("w3-include-html");
	
	if(file){
		xhttp = new XMLHttpRequest();
		//객체로 정의
		xhttp.onreadystatechange = function(){
		  if(this.readyState == 4){//데이터를 전부 받은 상태
			//성공적으로 상태가 처리될때
			if(this.status == 200) {elmnt.innerHTML = this.responseText;}
		    //url이 틀리거나 존재하지 않을때
	        if(this.status == 404) {elmnt.innerHTML = "Page not found.";}
			elmnt.removeAttribute("w3-include-html");
			includeHTML();
		}
	}
	xhttp.open("GET", file, true);
	xhttp.send();
	return;
	}
   }
}