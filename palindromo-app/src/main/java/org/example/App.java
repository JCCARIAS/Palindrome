package org.example;

import org.example.model.PalindromoModel;
import org.example.view.PalindromoView;

public class App {
    public static void main(String[] args) {
        PalindromoModel model = new PalindromoModel();
        PalindromoView view = new PalindromoView();
        PalindromeController controller = new PalindromeController(model, view);

        controller.procesarFrase();
}
}