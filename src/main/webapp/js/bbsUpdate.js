$(function() {
	
	/* 추가 Submit */
	$("#saveForm").submit(function(e){
		e.preventDefault();
		var formData = new FormData($(this)[0]);
		for (let value of formData.values()) {
			if (value.trim() === ''){
				alert('모든 값을 입력해주세요.');
				return;
			}
		}
		
		var bbsNo = formData.get('bbsNo');
		var data = {
			bbsNo: bbsNo,
            bbsTitle: formData.get('bbsTitle'),
            userName: formData.get('userName'),
            bbsContents: formData.get('bbsContents')
        };
		
		$.ajax({
			url: '/bbs/update',
			type: 'PUT',
			contentType: 'application/json',
            data: JSON.stringify(data),
			success: function (data, txtStatus, xhr) {
				var code = xhr.status;
				if(200 <= code && code < 300) 
				{
					if(data) {
						$(location).attr('href', '/bbs');
					} else {
						alert("등록실패");
					} 
				}	
				else {
					alert("등록실패");
				}
			}
		});
		return false;
	});
	
});