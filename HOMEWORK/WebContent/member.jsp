<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
 
<!DOCTYPE html>
<html lang="ko">
<head>
	<meta charset="UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>Insert title here</title>
	<script src="https://code.jquery.com/jquery-3.6.0.js" integrity="sha256-H+K7U5CnXl1h5ywQfKtSj8PCmoN9aaq30gDh27Xc0jk=" crossorigin="anonymous"></script>
	<style type="text/css">
		*{
			padding: 0;
			margin: 0;
			box-sizing: border-box;
		}
		.container{
			width: 1500px;
			margin: 0 auto;
			padding: 10px;
			display: flex;
		}
		.input_area{
			width: 300px;
			padding: 10px;
		}
		.list_area{
			width: 1200px;
			padding: 10px;
		}
		.list_area table{
			width: 100%;
			border-collapse: collapse;
		}
		.list_area table td{
			border-top: 1px solid gray;
			border-bottom: 1px solid gray;
			padding: 3px 5px;
			text-align: center;
		}
	
	</style>
	<script>
		
		$(document).ready(function(){
			
			
			
			fnSelectMemberList();
			fnInsertMember();
			fnDeleteMember();
		});
		
		
		
		function fnSelectMemberList() {
			$.ajax({
				url : 'selectMemberList.do',
				type : 'get',
				
				dataType: 'json',
				success : function(members){
					$('#member_list').empty();
					
					$.each(members, function(i, member) {
						$('<tr>')
						.append( $('<td>').text(member.no) )
						.append( $('<td>').text(member.name) )
						.append( $('<td>').text(member.age) )
						.append( $('<td>').text(member.birthday) )
						.append( $('<td>').text(member.regdate) )
						.append( $('<td>').html('<input type="hidden" name="no" value="'+member.no+'"><input type="button" value="삭제" class="delete_btn" data-no="'+member.no+'"> ')   )
						.appendTo('#member_list');
					})
				},
				error : function () {
					alert('실패');
				}
			});
		}//fnSelectMemberList
		
		function fnInsertMember() {
		 	$('#insert_btn').on('click', function(){
		 		let regbirth = /^[0-9-]{10}$/;
		 		
		 		if( $('#no').val().length != 6 ){
		 			alert('회원번호는 6자리 입니다.');
		 			return;
		 		} 
		 		if($('#age').val() == '' || isNaN($('#age').val())){
		 			alert('나이는 정수만 입력 가능합니다.');
		 			$('#age').focus();
		 			return;
		 		} else if( $('#age').val() < 0 || $('#age').val() > 100){
		 			alert('나이는 0~100 사이만 입력 가능합니다.');
		 			$('#age').focus();
		 			return;
		 		} else if(regbirth.test($('#birthday').val())==false ){
		 			alert('입력 데이터를 확인하세요');
		 			$('#birthday').focus();
		 			return;
		 		} 
		 		$.ajax({
		 			url : 'insertMember.do',
		 			data : $('#form').serialize(),
		 			type : 'post',
		 			dataType : 'json',
		 			success : function(resData){
		 				if(resData.result > 0){
						alert('회원 등록이 성공했습니다.');
							$('#no').val('');
							$('#name').val('');
							$('#age').val('');
							$('#birthday').val('');
							fnSelectMemberList();
		 				} else {
		 					alert('회원 등록이 실패했습니다.');
		 				}
					},
					error : function(xhr){
						if(xhr.status == 2001 || xhr.status == 2002 || xhr.status == 2003){
							alert(xhr.responseText);
						}
					}
		 		});
		 		
		 	});
		}//fnInsertMember
	
		

		function fnDeleteMember() {
			$('body').on('click', '.delete_btn', function(){
				let delete_no =  $(this).data('no');
				if(confirm('회원번호 '+delete_no+'회원의 정보를 삭제할까요?')){
					$.ajax({
						url : 'deleteMember.do',
						data : 'no='+delete_no,
						dataType : 'json',
						success : function (resData) {
							if(resData.result>0){
								alert('회원번호 '+$(this).prev().val()+' 회원정보가 삭제되었습니다.');
								fnSelectMemberList();
							} else{
								alert('삭제 실패');
							}
						},
						error: function(){
							alert('입력 데이터를 확인하세요.');
						}
					});
				}
			});
		} // fnDeletemember
		
		
		
		
	</script>
</head>
<body>
		
	<div class="container">
			<div class="input_area">
				<form id="form">
					<input type="hidden" id="hidden_no" value="${member.no}">
					<input type="text" name="no" id="no" placeholder="회원번호 (6자리)" ><br>
					<input type="text" name="name" id="name" placeholder="회원명"><br>
					<input type="text" name="age" id="age" placeholder="나이"><br>
					<input type="text" name="birthday" id="birthday" placeholder="생일"><br>
					<input type="button" value="등록하기" id="insert_btn" >
				</form>
			</div>
			<div class="list_area">
				<table>
					<thead>
						<tr>
							<td>회원번호</td>
							<td>회원명</td>
							<td>나이</td>
							<td>생일</td>
							<td>가입일</td>
							<td>비고</td>
						</tr>
					</thead>
					<tbody id="member_list"></tbody>
				</table>
			</div>
		</div>
		 
		
</body>
</html>