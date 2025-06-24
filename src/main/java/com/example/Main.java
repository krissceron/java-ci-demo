package com.example;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        try (PrintWriter w = new PrintWriter("output/index.html", "UTF-8")) {
            w.println("<h1>Hello from Java CI/CD, Kriss!</h1>");
             w.println("<h2>Esto es un despliegue continuo</h2>");
            System.out.println("HTML generado correctamente.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}