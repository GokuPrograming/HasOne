package org.example;

import javax.swing.*;
import java.util.Scanner;

public class hasOne {
    public void ingresarDatos() {

        MenuDeSeleccion();
        //n = JOptionPane.showInputDialog("ingresa un Numero");
        //validar_Numero(n);

    }

    public void MenuDeSeleccion() {

        int opcion;
        String respuesta;
        respuesta = JOptionPane.showInputDialog("Bienvenido\n ¿Que deseas realizar?\n" +
                "1 verificar si los digitos ingresados tienen un 1\n" +
                "2 salir del programa");
        opcion = Integer.parseInt(respuesta);
        switch (opcion) {
            case 1:
                String n = null;
                do {
                    n = JOptionPane.showInputDialog("si deseas detener el programa escribe \n exit\n ingresa un Numero");

                    if (n.equals("exit")) {
                        System.exit(0);
                    } else
                        validar_Numero(n);
                } while (n != "exit");

                break;
            case 2:
                JOptionPane.showMessageDialog(null, "gracias por usarnos");
                System.exit(0);
                break;

        }

    }


    public boolean validar_Numero(String n) {
        int n1;
        boolean isNumeric = (n != null && n.matches("[0.01-9.99]+"));// valida que el valor ingresado sea un numero.
        if (isNumeric == true) {
            n1 = Integer.parseInt(n);
            hasOne(n1);// entra al metodo
            // System.out.println("es un numero" + isNumeric);
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Lo sentimos," +
                    "\n pero " + n + "no es un numero\n" +
                    "\n \npor favor ingrese un numero");
            return false;
        }

    }


    public boolean hasOne(int n) {
        boolean encontrar = false;
        while (n != 0) {
            if (n % 10 == 1) {
                encontrar = true;
                break;
            }
            n /= 10;
        }
        if (encontrar) {
            JOptionPane.showMessageDialog(null,
                    "Felicidades!!\n" +
                            " El valor ingresado cuenta almenos un 1" +
                            "\n el numero ingresado fue:   " + n);
            System.out.println("es verdad");
            return true;
        } else {
            JOptionPane.showMessageDialog(null,
                    "lo sentimos ese numero no es funcional" + n);
            System.out.println("is false");
            return false;
        }
    }
}


