package es.insa.curso.web.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet1
 */
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Servlet1() {
		super();
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// Un servlet siempre funciona así:
		// 1º Extraer los datos de entrada de REQUEST
		String op1 = request.getParameter("op1");
		String op2 = request.getParameter("op2");
		String ope = request.getParameter("op");
		// 2º Convertir los datos
		double x = Double.valueOf(op1);
		double y = Double.valueOf(op2);
		// 3º Delegar la ejecución concreta que toque
		double resultado = calcular(x, y, ope);
		// 4º Devolver los resultados al usuario
		// a) A lo bruto: Como el SYSO pero en WEB
		response.getWriter().print("El resultado es " + resultado);
		// b) Mediante una página Web
		request.setAttribute("r", resultado);
		request.getRequestDispatcher("pagina.jsp")
				.forward(request, response);
		// El código que ponga yo aquí (despues del forward)
		// ya no sirve para nada porque ya ha desaparecido.
		
	}

	private double calcular(double x, double y, String ope) {
		if ("sumar".equals(ope)) {
			return x + y;
		} else if ("restar".equals(ope)) {
			return x - y;
		} else if ("multiplicar".equals(ope)) {
			return x * y;
		} else if ("dividir".equals(ope)) {
			return x / y;
		} else {
			return Double.NaN;
		}
	}

}
