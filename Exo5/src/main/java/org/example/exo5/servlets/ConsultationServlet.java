package org.example.exo5.servlets;

import org.example.exo5.entity.Consultation;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;



import java.io.IOException;
import java.util.List;

@WebServlet("/consultations")
public class ConsultationServlet extends HttpServlet {

    private SessionFactory sessionFactory;

    public ConsultationServlet() {
        sessionFactory = new Configuration().configure().buildSessionFactory();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Session session = sessionFactory.openSession();
        Query<Consultation> query = session.createQuery("from Consultation", Consultation.class);
        List<Consultation> consultations = query.list();
        session.close();

        req.setAttribute("consultations", consultations);
        req.getRequestDispatcher("views/consultation-details.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
