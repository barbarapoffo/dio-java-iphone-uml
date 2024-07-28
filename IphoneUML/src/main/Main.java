package main;

import model.iPhone;

public class Main {
    public static void main(String[] args) {
        iPhone myiPhone = new iPhone();
        myiPhone.setModel("iPhone 12");
        myiPhone.setStorageCapacity(128);

        System.out.println("Model: " + myiPhone.getModel());
        System.out.println("Storage Capacity: " + myiPhone.getStorageCapacity() + "GB");

        myiPhone.tocar();
        myiPhone.selecionarMusica("Afterglow - Taylor Swift");
        myiPhone.pausar();

        myiPhone.ligar("123-456-7890");
        myiPhone.atender();
        myiPhone.iniciarCorreioVoz();

        myiPhone.exibirPagina("https://www.instagram.com/babipoffo/");
        myiPhone.adicionarNovaAba();
        myiPhone.atualizarPagina();
    }
}