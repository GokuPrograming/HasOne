package org.example;

import javax.swing.*;
import java.util.Scanner;

public class hasOne {
    public void ingresarDatos() {
        String n;
        n = JOptionPane.showInputDialog("ingresa un Numero");
        validar_Numero(n);

    }

    public boolean validar_Numero(String n) {
        int n1;
        boolean isNumeric = (n != null && n.matches("[0.01-9.99]+"));// valida que el valor ingresado sea un numero.
        if (isNumeric == true) {
            n1 = Integer.parseInt(n);
            System.out.println("es un numero" + isNumeric);
            hasOne(n1);
            return true;
        } else {
            System.out.println("no es un numero" + isNumeric);
            return false;
        }

    }

    public boolean hasOne(int n) {
        while (n != 0) {
            if (n % 10 == 1)
                return true;
            System.out.println("is true");
            n /= 10;
        }
        System.out.println("is false");
        return false;
    }
}
