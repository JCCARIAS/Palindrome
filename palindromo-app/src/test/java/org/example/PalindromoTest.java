package org.example;

import org.example.model.PalindromoModel;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class PalindromoTest {
    private PalindromoModel model;

    @Before
    public void setUp() {
        model = new PalindromoModel();
    }

    @Test
    public void testUnSoloCaracter() {
        assertTrue("Un solo carácter debe ser palíndromo",
                model.esPalindromo("a"));
    }
    @Test
    public void testFraseVacia() {
        assertTrue("La frase vacía debe ser palíndromo",
                model.esPalindromo(""));
    }

    @Test
    public void testFrasePalindromo() {
        assertTrue("Frase palíndroma básica",
                model.esPalindromo("Anita lava la tina"));
    }

    @Test
    public void testFraseConCaracteresEspeciales() {
        assertTrue("Frase con caracteres especiales",
                model.esPalindromo("A man, a plan, a canal: Panama"));
    }
    @Test
    public void testFraseNoPalindromo() {
        assertFalse("Frase no palíndroma debe devolver false",
                model.esPalindromo("Esto no es un palíndromo"));
}
}