package org.example.exo5.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.example.exo5.entity.FicheDeSoin;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/fiches-de-soin")
public class FicheDeSoinServlet extends HttpServlet {

    private List<FicheDeSoin> fichesDeSoins = new ArrayList<>();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("fichesDeSoins", fichesDeSoins);
        req.getRequestDispatcher("views/create-fiche-de-soin.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}