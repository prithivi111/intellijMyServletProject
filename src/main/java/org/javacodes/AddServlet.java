package org.javacodes;


import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/insert")
public class AddServlet extends HttpServlet {

    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
        int i = Integer.parseInt(req.getParameter("num1"));
        int j = Integer.parseInt(req.getParameter("num2"));

        int k=i+j;
        System.out.println("The result is " + k);
        PrintWriter out= res.getWriter();
        out.println("The addition of two numbers is " + k);
    }

    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        try {
            System.out.println("Received Get Request...");
        } catch(Exception e) {
            System.err.println("Error Details :"+e.getMessage());
        }
    }
}