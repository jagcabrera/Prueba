package es.insa.curso.web;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
import javax.xml.ws.RequestWrapper;


// ESTO VA A SER UN SERVICIO REST CREADO CON JAX-RS
// PERO JAX-RS DE POR SI ES SOLO UNA INTERFAZ
// JERSEY ES UNA VERSION DE JAX-RS
// PERO SE CONFIGURA CON ANOTACIONES
@Path("/")
public class ServicioREST {
	
	public ServicioREST() {
	}
	
	// lo que hay siempre delante de /saludar es el servidor:
	// http://localhost:8080/web-ejemplo
	@GET
	@Path("/saludar")
	public String saludar(@QueryParam("nombre") String nombre){
		return "Hola " + nombre;
	}
	
	@POST
	@Path("/adios/{nombre}")
	public String despedirse(@PathParam("nombre") String nombre) {
		return "Adios " + nombre;
	}
	
}
