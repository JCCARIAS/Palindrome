package org.example;


import org.example.model.PalindromoModel;
import org.example.view.PalindromoView;

public class PalindromeController {
    private PalindromoModel model;
    private PalindromoView view;

    public PalindromeController(PalindromoModel model, PalindromoView view) {
        this.model = model;
        this.view = view;
    }

    public void procesarFrase() {
        try {
            String frase = view.obtenerFraseUsuario();
            boolean resultado = model.esPalindromo(frase);
            view.mostrarResultado(resultado);
        } catch (Exception e) {
            view.mostrarError(e.getMessage());

        }
}
}

