package co.urbanraw.web;

import java.io.IOException;

import co.urbanraw.web.dao.BooksDao;
import co.urbanraw.web.model.Books;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class GetBooksController extends HttpServlet {
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int book_id = Integer.parseInt(request.getParameter("bid"));
		
		BooksDao booksdao = new BooksDao();
		
		Books books = booksdao.getBooks(book_id);
		
		request.setAttribute("booksdata", books);
		RequestDispatcher rd = request.getRequestDispatcher("ShowBooks.jsp");
		rd.forward(request, response);
		
		
	}


}
