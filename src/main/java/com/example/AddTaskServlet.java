package com.example;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.IOException;

public class AddTaskServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        String task = req.getParameter("task");
        if (task != null && !task.trim().isEmpty()) {
            TaskStore.addTask(task);
        }
        resp.sendRedirect("list");
    }
}
