package com.example.calculator;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CalculatorServlet", value = "/calculator")
public class CalculatorServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");

        String firstNumber = request.getParameter("firstNumber");
        String secondNumber = request.getParameter("secondNumber");

        request.setAttribute("firstNumber", firstNumber);  // Đưa dữ liệu về lại cho client
        request.setAttribute("secondNumber", secondNumber);  // Đưa dữ liệu về lại cho client

        if("".equals(firstNumber)) {
            request.setAttribute("errorFirstNumber", "Không được để trống");
            request.getRequestDispatcher("calculator.jsp").forward(request, response);
            return;
        }

        double total = Double.parseDouble(firstNumber) + Double.parseDouble(secondNumber);

        request.setAttribute("total", total);

        request.getRequestDispatcher("calculator.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");

    }
}
