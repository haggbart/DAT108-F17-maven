package no.hvl.dat108;


import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(name = "StudenterServlet", urlPatterns = "/studenter")
public class StudenterServlet extends HttpServlet {

    @EJB
    private StudentDAO dao;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/plain");
        PrintWriter out = response.getWriter();

        List<Student> studenter = dao.hentAlleStudenter();
        studenter.forEach(out::println);
    }
}
