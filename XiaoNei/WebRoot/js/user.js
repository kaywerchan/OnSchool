function registerUser(){
	$.ajax({
		url : 'registerUser',
		type : 'post',
		dataType : 'json',
		data : $("#registerUserForm").serialize(),
		success : function(result){
			alert(result.msg);
			window.location = "index.jsp";
		},
		error : function(){
			alert(result.msg);
		}
	});
	
}

function login(){
	$.ajax({
		url : 'login',
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

