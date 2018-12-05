<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>메인화면</title>
</head>
<body>
	<div id="listdisplay"></div>
</body>
<!-- jQuery링크 추가 -->
<script src=https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js></script>
<script>
	//ajax로 memo/memolist요청을 수행해주는 함수 
	function memolist(){
		$.ajax({
			url:'memo/memolist',
			dataType:'json',
			success: function(memolist){
				//listdisplay라는 id를 가진 DOM객체를 찾아오는 것 
				//*value속성 : 입력한 값을 가져오는 속성 
				//*innerHTML : 태그와 태그 사이의 내용을 가져오거나 설정하는 속성 
				var listplay = document.getElementById("listdisplay")
				//제목출력
				listdisplay.innerHTML = "<h3 align='center'>메모목록</h3>"
				//데이터의 개수 출력 
				listdisplay.innerHTML += "<p>메모개수:" + memolist.memocount + "</p>" 
				
				//테이블 생성 태그 
				var display = "<table border='1'>"
				//테이블의 제목 셀 생성 
				display += "<tr><th>메모번호</th><th>메모제목</th><th>작성일</th></tr>"
				
				var ar = memolist.memos
				//배열순회 
				for(i in ar){
					record = ar[i]
					display += "<tr><td>" + record.NUM + "</td>"
					//상세보기를 제대로 구현하기 위해서는 기본키 값을 넘겨주는 방법에 대해 고려해야 합니다. 
					display += "<td><a href='#' onclick='detail(" + record.NUM + ")'>" + record.TITLE + "</td>"
					display += "<td>" + record.REGDATE + "</td></tr>"	
				}
				
				display += "</table>"
				listdisplay.innerHTML += display
			}
		})
	}
	
	//상세보기를 위한 함수 
	function detail(num){
		$.ajax({
			url:"memo/memodetail",
			data:{"num":num},
			dataType:"json",
			success:function(memo){
				alert(memo)
			}
		})
	}
	
	
	//jquery에서 문서가 시작 되자마자 수행 
	$(function(){
		memolist()
	})

</script>
</html>