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
 * Servlet implementation class fahrenheitToCelsiusServlet
 */
@WebServlet("/fahrenheitToCelsiusServlet")
public class fahrenheitToCelsiusServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public fahrenheitToCelsiusServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String fahrenheitTemperature = request.getParameter("fahrenheitTemperature");
		double fahrenheit = Double.parseDouble(fahrenheitTemperature);
		TemperatureConverter fahrenheitToCelsius = new TemperatureConverter(fahrenheit);
		
		request.setAttribute("value", fahrenheitToCelsius);
		getServletContext().getRequestDispatcher("/fahrenheitToCelsiusResult.jsp").forward(request, response);
	}

}
