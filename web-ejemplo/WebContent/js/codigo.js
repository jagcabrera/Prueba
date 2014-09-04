// Ya que el c�digo est� separado (en otro fichero fuera del HTML, que
// es este fichero), lo voy a separar todo.

// Y voy a poner los eventos desde aqu�

function testAjax(){
	ajax = new XMLHttpRequest();
	// abro conexi�n
	ajax.open("POST", 
			  "http://localhost:8080/web-ejemplo/rest/adios/Jose",
			  true);
	// tengo que preparar la respuesta antes del envio
	ajax.onreadystatechange = responder;
	// tengo que hacer la petici�n
	ajax.send();
}

function responder(){
	// lo que contiene este if es as� siempre y significa que
	// el servidor a respondido y ha dicho s�. Es decir ha terminado
	// de procesar la petici�n (200) 
	// y ha devuelto lo que hemos pedido(4).
	if (ajax.readyState == 4 && ajax.status == 200){
	var resultado = ajax.responseText;
	alert(resultado);
	}
}

// me invento una funci�n main
function main(){
	// Aqu� voy a enlazar todos los eventos
	var boton1 = document.getElementById("probarAJAX");
	boton1.onclick = testAjax;
}
// la funci�n main se va a ejecutar cuando se cargue la p�gina:
	window.onload = main;
