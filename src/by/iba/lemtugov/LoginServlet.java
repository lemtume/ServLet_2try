package by.iba.lemtugov;

import by.iba.lemtugov.dao.UserDao;
import by.iba.lemtugov.list.ListService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

/*
@WebServlet (urlPatterns = "/LoginServlet")
public class LoginServlet extends HttpServlet {

//    public  boolean checkLogin (String name, String password) {
//        return (name.equalsIgnoreCase  ( "Admin" )&& password.equalsIgnoreCase ( "Admin" )); //IgnoreCase - игнорируя регистр
//    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setCharacterEncoding ( "UTF-8" );
        String name = request.getParameter ( "name" );
        String password = request.getParameter ( "password" );

        //request.setAttribute ("name", request.getParameter ( "name" ) ); убрал на 8 шаге


        if (checkLogin ( name,password ))
        {
          //  request.setAttribute ( "group", ListService.retriveList () );
          //  request.getRequestDispatcher ( "/WEB-INF/views/welcom.jsp" ).forward ( request,response );

         //   request.getSession ().setAttribute ( "name", name );
            request.getSession ().setAttribute ( "name", name ); //добавил на 8 шаге
           // request.setAttribute ( "name", name ); убрал на 8 шаге
            request.getRequestDispatcher ( "/GroupServlet" ).forward ( request, response );
        }
        else {
            request.setAttribute ( "error", "Invalid password and|or login" );
            request.getRequestDispatcher ( "/WEB-INF/views/login.jsp" ).forward ( request,response );
        }
      //  request.getRequestDispatcher ( "/WEB-INF/views/welcom.jsp" ).forward ( request,response );

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       /* PrintWriter out = response.getWriter ();
        request.setCharacterEncoding ( "UTF-8" );
        out.println ( "<HTML>" );
        out.println ( "<BODY>" );
        out.println ( "First Servlet" );
        out.println ( "</BODY>" );
        out.println ( "</HTML>" );

       request.getRequestDispatcher ( "/WEB-INF/views/login.jsp" ).forward ( request, response );
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.service ( req, resp );
        System.out.println ("SERVICE");
    }

    @Override
    public void destroy() {
        super.destroy ();
        System.out.println ("DESTROY");
    }

    @Override
    public void init() throws ServletException {
        super.init ();
        System.out.println ("INIT");
    }
}*/
@WebServlet(urlPatterns = "/LoginServlet")
public class LoginServlet extends javax.servlet.http.HttpServlet {
    // public boolean validateUser(String user, String password) {
// return user.equalsIgnoreCase("admin") && password.equals("admin");
// }
    protected void doPost(javax.servlet.http.HttpServletRequest request,
                          javax.servlet.http.HttpServletResponse response)
            throws javax.servlet.ServletException, IOException {
        String name = request.getParameter("name");
        String password = request.getParameter("password");
        UserDao daoUser = new UserDao();
        if (daoUser.isValidUser(name, password)) {
            request.setAttribute("name", name);
// response.sendRedirect(request.getContextPath()+"/GroupServlet"); //  ПЛОХО НЕТ ПАРАМЕТРОВ
                    request
.getRequestDispatcher("/GroupServlet")
                    .forward(request, response);
        } else {
            request.setAttribute("errorMessage", "Неверный логи или пароль!!");
            request.getRequestDispatcher("/WEB-INF/views/login.jsp")
                    .forward(request, response);
        }
    }
    protected void doGet(javax.servlet.http.HttpServletRequest request,
                         javax.servlet.http.HttpServletResponse response)
            throws javax.servlet.ServletException, IOException {
        request
                .getRequestDispatcher("/WEB-INF/views/login.jsp")
                .forward(request, response);
    }
}