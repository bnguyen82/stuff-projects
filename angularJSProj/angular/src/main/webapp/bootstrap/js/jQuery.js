$(function() {
	$("#1tab").click(function(ev) {
//		$('#form1').removeClass("form-search");
		$this = $(this);
		$this.innerHTML = '<a href="#tab1" data-toggle="tab">Section 3</a>"';
		$('#form1').slideUp(100);
//		$('#form1').fadeIn(1000);
		console.log(ev);
		//disable event bubbling
//		ev.stopPropagation();
		return false;
		
//		$("#2tab").off("click");
	})

//	$("body").on('click', '#1tab', function(ev) {
////		$('#form1').removeClass("form-search");
//		$this = $(this);
//		$this.innerHTML = '<a href="#tab1" data-toggle="tab">Section 3</a>"';
//		$('#form1').hide();
//		console.log(ev);
//	
//		//disable event bubbling
////		ev.stopPropagation();
//		return false;
//		
////		$("#2tab").off("click");
//	})
	
	$("#2tab").on('click', function() {
//		$('#form1').removeClass("form-search");
//		$('#form1').show();
//		$('#form1').fadeOut(1000);
		$('#form1').slideDown(100);
		$(this).click(function(){
			console.log('Clicked once');
			}
		)
	})
//	$("#2tab").one('click', function() {
////		$('#form1').removeClass("form-search");
////		$('#form1').show();
//		$('#form1').fadeOut(1000);
//		$(this).click(function(){
//			console.log('Clicked once');
//			}
//		)
//	})
	
	//Event Bubbling: Body always listen to click on everywhere in screen
	$("body").click(function() {
//		$('#form1').removeClass("form-search");
		console.log("Body listening");
	})
	
//	$('#1tab').trigger('click');
//	$('#1tab').simulate('click');
	
	$.getJSON( "data/phones.json", function( resp ) {
		// log each key in the response data
	    $.each( resp, function( key, value ) {
	        console.log( key + " : " + value );
	    });
	});
})

window.onload = function() {
 
//    alert( "welcome" );
 
}