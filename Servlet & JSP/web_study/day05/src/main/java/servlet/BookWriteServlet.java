package servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

@WebServlet("/book/write")
public class BookWriteServlet extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String[] addCss = {"book/style1","book/style2" };
        List<String> addScript = Arrays.asList("book/script1","book/script2");
        req.setAttribute("addScript",addScript);

        req.setAttribute("addCss", addCss);

        RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/view/book/write.jsp");
        rd.forward(req,resp);

    }
}
