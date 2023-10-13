package pe.edu.upao.petcare.web.Overview;

import org.springframework.boot.SpringApplication;
import pe.edu.upao.petcare.web.WebApplication;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OverviewMain {

        static String usuario = " anonimo";

        static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        public static void main(String[] args) throws IOException {
            System.out.println("Menu");
            System.out.println("---------------");
            System.out.println("Bienvenido"+ usuario);
            System.out.println("---------------");
            System.out.println("A-crear usuario");
            System.out.println("B-listar usuarios");
            System.out.println("C-login");
            System.out.println("D-cerrar sesion");
            System.out.println("E-salir");

            String opc = "";

            do {

                opc = br.readLine();
                System.out.println("saliendo del programa");

            }while(!opc.equalsIgnoreCase("E"));

        }

    }

