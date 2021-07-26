package co.urbanraw.web;

import java.io.IOException;
import java.io.PrintWriter;

import co.urbanraw.web.dao.BooksDao;
import jakarta.servlet.Servlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class AddBooksController extends HttpServlet implements Servlet {
       
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    
    	String book_name = req.getParameter("bname");
    	String book_author = req.getParameter("aname");
    	
    	if(book_name.equals("") || book_author.equals("") )
    	{
    		PrintWriter out = resp.getWriter();
        	out.println("<script type=\"text/javascript\">");
        	out.println("alert('Please Fill All Fields!');");
        	out.println("location='AddBooks.jsp';");
        	out.println("</script>");
    	}
    	else
    	{
    		BooksDao dao = new BooksDao();
        	String InsertionResult = dao.addBooks(book_name, book_author);	
        	
        	if(InsertionResult.equals("done"))
        	{
        	PrintWriter out = resp.getWriter();
        	out.println("<script type=\"text/javascript\">");
        	out.println("alert('Book Added Successfully!');");
        	out.println("location='AddBooks.jsp';");
        	out.println("</script>");
        	}
        	else if (InsertionResult.equals("error"))
        	{
        		PrintWriter out = resp.getWriter();
            	out.println("<script type=\"text/javascript\">");
            	out.println("alert('Something Went Wrong!');");
            	out.println("location='AddBooks.jsp';");
            	out.println("</script>");
        	}
    	}
    	
    	
    	
    	//System.out.println(InsertionResult);
    	
//    	req.setAttribute("UpdateResult", InsertionResult);
//    	RequestDispatcher rd = req.getRequestDispatcher("AddBooks.jsp");
//		rd.forward(req, resp);
    	
    	
    	
    }

}
