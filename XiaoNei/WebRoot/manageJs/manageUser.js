function managerLogin(){
	$.ajax({
		url : 'managerLogin',
		type : 'post',
		dataType : 'json',
		data : $("#loginForm").serialize(),
		success : function(result){
			window.location = "index.jsp";
		},
		error : function(){
			alert(result.msg);
		}
	});
}