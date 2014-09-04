// Ya que el código está separado (en otro fichero fuera del HTML, que
// es este fichero), lo voy a separar todo.

// Y voy a poner los eventos desde aquí

function testAjax(){
	ajax = new XMLHttpRequest();
	// abro conexión
	ajax.open("POST", 
			  "http://localhost:8080/web-ejemplo/rest/adios/Jose",
			  true);
	// tengo que preparar la respuesta antes del envio
	ajax.onreadystatechange = responder;
	// tengo que hacer la petición
	ajax.send();
}

function responder(){
	// lo que contiene este if es así siempre y significa que
	// el servidor a respondido y ha dicho sí. Es decir ha terminado
	// de procesar la petición (200) 
	// y ha devuelto lo que hemos pedido(4).
	if (ajax.readyState == 4 && ajax.status == 200){
	var resultado = ajax.responseText;
	alert(resultado);
	}
}

// me invento una función main
function main(){
	// Aquí voy a enlazar todos los eventos
	var boton1 = document.getElementById("probarAJAX");
	boton1.onclick = testAjax;
}
// la función main se va a ejecutar cuando se cargue la página:
	window.onload = main;
