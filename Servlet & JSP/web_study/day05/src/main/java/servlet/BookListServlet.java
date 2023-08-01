package servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import models.Book;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

@WebServlet("/books")
public class BookListServlet extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        List<Book> books = new ArrayList<>();
        IntStream.range(1,10).forEach(x -> insertBook(x,books));
        req.setAttribute("books", books);

        RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/view/book/list.jsp");
        rd.forward(req,resp);
    }

    private void insertBook(int n, List<Book> books) {
        Book book = new Book("책" + n, "저자" + n, "출판사" + n);
        books.add(book);


    }
}
