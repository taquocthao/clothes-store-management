	$(document).ready(function(){
		var navbarWidth;
		$(window).resize(function(){
			navbarWidth = $(document).width();
			if(navbarWidth <= 767){
				$("ul.justify-content-end").addClass("navbar-collapse collapse");
			}
		});
		navbarWidth = $(document).width();
		if(navbarWidth < 767){
			$("ul.justify-content-end").addClass("navbar-collapse collapse");
		}
		$("button.navbar-toggler").click(function(){
			$("ul.justify-content-end").toggleClass("navbar-collapse collapse");
		});
	});