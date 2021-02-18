/**  * @author Gabriel Woodburn - gwoodburn  * CIS175 - Spring 2021  * 02/17/2021  */
package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.TemperatureConverter;


/**
 * Servlet implementation class celsiusToFahrenheitServlet
 */
@WebServlet("/celsiusToFahrenheitServlet")
public class celsiusToFahrenheitServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public celsiusToFahrenheitServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String celsiusTemperature = request.getParameter("celsiusTemperature");
		Double celsius = Double.parseDouble(celsiusTemperature);
		TemperatureConverter celsiusToFahrenheit = new TemperatureConverter(Double.parseDouble(celsiusTemperature), celsius);
		
		request.setAttribute("value", celsiusToFahrenheit);
		getServletContext().getRequestDispatcher("/celsiusToFahrenheitResult.jsp").forward(request, response);
	}

}
