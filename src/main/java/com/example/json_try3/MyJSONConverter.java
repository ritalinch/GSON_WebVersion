package com.example.json_try3;

import java.io.*;

import com.google.gson.JsonSyntaxException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "MyJSONConverter", urlPatterns = "/send")
public class MyJSONConverter extends HttpServlet {

    public void init() { }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String text = "<!DOCTYPE html><html> <head><meta charset=utf-8>" +
                "<title>Selector</title></head><body>";
        String toConvert = request.getParameter("jsonStringEntered");
        PrintWriter pw = response.getWriter();
        String answer = "";
        try {
            answer = text + Converter.getResult(toConvert) + "</body></html>";
        } catch (JsonSyntaxException | IllegalStateException e) {
            answer = "Illegal format";
        }
        pw.println(answer);
        pw.close();
    }

    public void destroy() { }
}