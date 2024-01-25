import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
@WebServlet("/save-request")
public class MainServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String firstName=req.getParameter("firstName");
        String lastName=req.getParameter("lastName");
        String telephone=req.getParameter("telephone");

        if(firstName.isEmpty() || lastName.isEmpty() || telephone.isEmpty()){
            resp.sendRedirect("index.jsp");
        }else{

            req.setAttribute("firstName", firstName);
            req.setAttribute("lastName", lastName);
            req.setAttribute("telephone", telephone);

            getServletContext().getRequestDispatcher("/success.jsp").forward(req, resp);
        }
    }
}
