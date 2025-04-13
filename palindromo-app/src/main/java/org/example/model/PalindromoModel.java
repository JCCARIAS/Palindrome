package org.example.model;

public class PalindromoModel {
    public String limpiarFrase(String frase) {
        if (frase == null) {
            throw new IllegalArgumentException("La frase no puede ser nula");
        }
        return frase.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
    }

    public boolean esPalindromo(String frase) {
        String limpia = limpiarFrase(frase);
        int i = 0, j = limpia.length() - 1;

        while (i < j) {
            if (limpia.charAt(i++) != limpia.charAt(j--)) {
                return false;
            }
        }
        return true;
    }
}