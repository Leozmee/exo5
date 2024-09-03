package org.example.exo5.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.example.exo5.entity.Patient;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/patients")
public class PatientServlet extends HttpServlet {

    private List<Patient> patients = new ArrayList<>();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("patients", patients);
        req.getRequestDispatcher("views/patient-list.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String nom = req.getParameter("nom");
        String prenom = req.getParameter("prenom");
        Patient patient = new Patient();
        patient.setNom(nom);
        patient.setPrenom(prenom);

        patients.add(patient);
        resp.sendRedirect(req.getContextPath() + "/patients");
    }
}
