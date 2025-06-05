package Produtos;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Sistema ---");

        Produto celular1 = new Celular("Smartphone Galaxy S23", 4500.00, "Samsung", "Galaxy S23", 256, "Android");
        Produto celular2 = new Celular("iPhone 15 Pro", 7999.90, "Apple", "iPhone 15 Pro", 128, "iOS");

        Produto camisa1 = new Camisa("Camisa Polo Clássica", 129.99, "Azul Marinho", "M", "Algodão Pima");
        Produto camisa2 = new Camisa("Camiseta Estampada Geek", 59.90, "Preta", "G", "Malha Fria");

        List<Produto> estoque = new ArrayList<>();
        estoque.add(celular1);
        estoque.add(celular2);
        estoque.add(camisa1);
        estoque.add(camisa2);

        System.out.println("\n--- Informações do Estoque ---");
        for (Produto p : estoque) {
            p.exibirInfo();
            System.out.println("------------------------------");
        }

        System.out.println("\n--- Métodos ---");
        for (Produto p : estoque) {
            System.out.println("\nProcessando produto: " + p.getNome());
            if (p instanceof Celular) {
                Celular celularEspecifico = (Celular) p;
                System.out.println("Este é um celular da marca: " + celularEspecifico.getMarca() +
                        " e modelo: " + celularEspecifico.getModelo());
            } else if (p instanceof Camisa) {
                Camisa camisaEspecifica = (Camisa) p;
                System.out.println("Esta é uma camisa de tamanho: " + camisaEspecifica.getTamanho());
            }
            System.out.println("------------------------------");
        }
    }
}