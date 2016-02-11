$(function() {
    $("form").submit(somar);
});
 
function somar(event) {
	event.preventDefault();
	
	var data = {
            a : $("#a").val(),
            b : $("#b").val()
    }
    
   Calculator.sum(data).done(sumOK);
};

function sumOK(data){
	$("#result").val(data);
}




