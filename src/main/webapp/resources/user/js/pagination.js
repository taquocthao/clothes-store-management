
var Url = document.getElementById("urlPattern").value;
var pathInfo = "?page=";
var totalPage = document.getElementById("totalPage").value;
var currentPage = parseInt(document.getElementById("currentPage").value, 0);

var pagination = document.getElementById("pagination");
var btnNext =  document.getElementById("btnNext");
var btnPrev = document.getElementById("btnPrev");
var btnFirst = document.getElementById("btnFirst");
var btnLast = document.getElementById("btnLast");
var itemNext = document.getElementById("itemNext");

createPaginationButton();

btnNext.onclick = function() {goNextPage(currentPage)};
btnPrev.onclick = function() {goPreviousPage(currentPage)};
btnFirst.onclick = function() {goFirstPage()};
btnLast.onclick = function() {goLastPage()};
// add event onclick for btn
var btnPageNumber = document.getElementsByClassName("page-number");
for(let index = 0; index < btnPageNumber.length; index++) {
	btnPageNumber[index].onclick = function () {
		gotoPage(btnPageNumber[index].innerHTML);		
	}
}

function createPaginationButton() {
	
	if(totalPage <= 1) {
		// hide pagination
		pagination.style.display = "none";
	} else if(totalPage < 7) {
		// hide button
		btnNext.style.display = "none";
		btnPrev.style.display = "none";
		btnFirst.style.display = "none";
		btnLast.style.display = "none";
		
		renderPaginationNormalButton();
		
	} else {
		
		if(currentPage <= 4) {			
			renderPaginationWithoutEllipsisButtonAtFirst();
		} else if (currentPage <= (totalPage - 4)) {
			renderPaginationHaveEllipsisButton();			
		} else {
			renderPaginationWithoutEllipsisButtonAtTheEnd();
		}

	}
}

function renderPaginationNormalButton() {
	
	for (let index = 1; index <= totalPage; index++) {	

		var li = document.createElement("li");
		li.className += "page-item";
		li.id = "item" + index;
		
		if(currentPage == index) {
			li.className += " active";
		}	
					
		var btn = document.createElement("button");
		btn.className += "page-link page-number";
		btn.innerHTML = index;		
		btn.id = "btnPage" + index;		
	
		li.appendChild(btn);
		// insert list number button before "next button"
		itemNext.before(li);
	}
	
}

function renderPaginationWithoutEllipsisButtonAtFirst() {

	if(currentPage == 1) {
		btnFirst.style.display = "none";
		btnPrev.style.display = "none";
	}
	
	// create button 
	for (let index = 1; index <= 7; index++) {
		
		var li = document.createElement("li");
		li.className += "page-item";
		li.id = "item" + index;		
		if(currentPage == index) {
			li.className += " active";
		}	
		if(index == 6) {
			var btnEllipsis = document.createElement("button");
			btnEllipsis.className = "ellipsis page-link";
			btnEllipsis.innerHTML = "...";			
			li.appendChild(btnEllipsis);
			itemNext.before(li);		
			continue;
		} 		
		if(index == 7) {
			var btnEndPage = document.createElement("button");
			btnEndPage.className += "page-link page-number";
			btnEndPage.innerHTML = totalPage;		
			btnEndPage.id = "btnPage" + totalPage;
			li.appendChild(btnEndPage);
			// insert list number button before "next button"
			itemNext.before(li);
			break;
		} 			
		var btn = document.createElement("button");
		btn.className += "page-link page-number";
		btn.innerHTML = index;		
		btn.id = "btnPage" + index;		
	
		li.appendChild(btn);
		// insert list number button before "next button"
		itemNext.before(li);
	}
}

function renderPaginationWithoutEllipsisButtonAtTheEnd() {
	
	if(currentPage == totalPage) {
		btnLast.style.display = "none";
		btnNext.style.display = "none";
	}
	
	// create button 
	for (let index = 7; index > 0; index--) {
		
		var li = document.createElement("li");
		li.className += "page-item";
		
		var btn = document.createElement("button");
		btn.className += "page-link page-number";
		
		if(index == 7) {
			btn.innerHTML = "1";			
		} else if(index == 6) {
			btn.innerHTML = "...";	
			btn.classList.remove = "page-number";
		} else {
			btn.innerHTML = (totalPage - index) + 1;
			btn.id += "btnPage" + index;			
		}
		
		// add class active for li tag
		if(currentPage === parseInt(btn.innerHTML, 0)) {
			li.className += " active";
		}	
		
		li.appendChild(btn);
		itemNext.before(li);
	}
}

function renderPaginationHaveEllipsisButton() {

	// create button 
	for (let index = 1; index <= 9; index++) {
		
		var li = document.createElement("li");
		li.className += "page-item";
		li.id = "item" + index;

		var btn = document.createElement("button");
		btn.className += "page-link page-number";
		
		if( index == 1 ) {
			btn.innerHTML = 1;
			btn.id = 1;
		} else if( index == 2 ) {
			btn.innerHTML = "...";		
			btn.classList.remove("page-number");
		} else if( index == 3 ) {
			btn.innerHTML = currentPage - 2;		
			btn.id = "btnPage" + (currentPage - 2);	
		} else if( index == 4 ) {
			btn.innerHTML = currentPage - 1;		
			btn.id = "btnPage" + (currentPage - 1);	
		} else if( index == 5 ) {
			btn.innerHTML = currentPage;		
			btn.id = "btnPage" + currentPage;	
		} else if( index == 6 ) {
			btn.innerHTML = currentPage + 1;		
			btn.id = "btnPage" + (currentPage + 1);	
		} else if( index == 7 ) {
			btn.innerHTML = currentPage + 2;		
			btn.id = "btnPage" + (currentPage + 2);	
		} else if( index == 8 ) {
			btn.innerHTML = "...";	
			btn.classList.remove("page-number");
		} else if( index == 9 ) {			
			btn.innerHTML = totalPage;		
			btn.id = "btnPage" + totalPage;			
		}	
		
		if(currentPage === parseInt(btn.innerHTML, 0)) {
			li.className += " active";
		}
		
		li.appendChild(btn);
		itemNext.before(li);
	}
}

function goPreviousPage(currentPage) {
	if(currentPage > 1) {
		currentPage--;
		window.location.href = Url + pathInfo + currentPage;
		console.log(Url + pathInfo + currentPage);
	}
}

function goNextPage(currentPage) {	
	if(currentPage < totalPage) {
		currentPage++;
		window.location.href = Url + pathInfo + currentPage;
		console.log(Url + pathInfo + currentPage);
	}
}

function goFirstPage() {
	window.location.href = Url + pathInfo + 1;
}

function goLastPage() {
	window.location.href = Url + pathInfo + totalPage;
}

function gotoPage(pageNumber) {
	window.location.href = Url + pathInfo + pageNumber;		
}
