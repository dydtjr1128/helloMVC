package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Customer;
import service.CustometService;

/**
 * Servlet implementation class DoLogin
 */
@WebServlet("/doLogin")
public class DoLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DoLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String customerId = request.getParameter("customerId");
		
		// Perform business logic. Return a bean as a result.
		//...HashMap		
		CustometService service = new CustometService();
		
		Customer customer = service.findCustomer(customerId);
		request.setAttribute("customer", customer);
		
		List<Customer> customerList = service.getAllCustomers();
		request.setAttribute("customerList", customerList);
		
		String page = null;
		if(customer == null) {
			page = "/view/error.jsp";
		}
		else {
			page = "/view/success.jsp";			
		}
		RequestDispatcher dispatcher = request.getRequestDispatcher(page);
		dispatcher.forward(request, response);
	}

}
