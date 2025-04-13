package org.example.view;

import java.util.Scanner;

public class PalindromoView {
    private Scanner scanner;

    public PalindromoView() {
        this.scanner = new Scanner(System.in);
    }

    public String obtenerFraseUsuario() {
        System.out.println("Ingrese una frase para verificar si es palíndromo:");
        return scanner.nextLine();
    }

    public void mostrarResultado(boolean esPalindromo) {
        if (esPalindromo) {
            System.out.println("¡La frase ES un palíndromo!");
        } else {
            System.out.println("La frase NO es un palíndromo.");
        }
    }

    public void mostrarError(String mensaje) {
        System.err.println("Error: " + mensaje);
}
}