package org.javacodes;

    import javax.servlet.annotation.WebServlet;
    import javax.servlet.http.HttpServlet;
    import javax.servlet.http.HttpServletRequest;
    import javax.servlet.http.HttpServletResponse;
    import java.io.IOException;
    import java.io.PrintWriter;

@WebServlet("/insert")
public class BasicServlet extends HttpServlet {
    public void  init() {
        System.out.println("Servlet initiation !!");
    }

    protected void doPost(HttpServletRequest httpServletRequest,
                          HttpServletResponse httpServletResponse) throws IOException {
        try {
            //fetch the data from request
            String firstName = httpServletRequest.getParameter("fName");
            System.out.println("Fetched first Name ::"+firstName);
            String lastName = httpServletRequest.getParameter("lName");
            System.out.println("Last Name :: "+lastName);
            String address = httpServletRequest.getParameter("address");
            System.out.println("Received address ::" + address);
            String gender = httpServletRequest.getParameter("gender");
            System.out.println("Gender :" +gender);

            //printing on the web
            PrintWriter out = httpServletResponse.getWriter();
            out.println("The full Name is: " + firstName + " " + lastName);


        } catch(Exception e) {
            System.err.println("Error Details :"+e.getMessage());
        }
    }

    protected void doGet(HttpServletRequest httpServletRequest,
                         HttpServletResponse httpServletResponse) throws IOException{
        try {
            System.out.println("Received Get Request...");
        } catch(Exception e) {
            System.err.println("Error Details :"+e.getMessage());
        }
    }

    public void destroy() {

        System.err.println("Destroying the Servlet");
    }
}