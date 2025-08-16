package com.example;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

public class ListTasksServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        out.println("<html><head><title>Tasks</title>");
        out.println("<link rel='stylesheet' href='https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css'>");
        out.println("</head><body class='p-4'><div class='container'>");

        out.println("<h2>📝 Task List</h2><ul class='list-group'>");
        for (String task : TaskStore.getTasks()) {
            out.printf("<li class='list-group-item'>%s</li>%n", task);
        }
        out.println("</ul>");
        out.println("<br><a href='add.html' class='btn btn-primary'>Add Another Task</a>");
        out.println("<a href='/' class='btn btn-secondary ms-2'>Home</a>");
        out.println("</div></body></html>");
    }
}
