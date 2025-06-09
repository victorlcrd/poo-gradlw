package main.java.ads.poo;

import java.util.ArrayList;

public class Agenda {
    private ArrayList<Contato> contatos;

    public Agenda() {
        contatos = new ArrayList<>();
    }

    public boolean addContato(Contato c) {
        return contatos.add(c);
    }

    public ArrayList<Contato> findContato(String nome, String sobrenome) {
        ArrayList<Contato> resultados = new ArrayList<>();
        for (Contato c : contatos) {
            if (c.toString().contains(nome) && c.toString().contains(sobrenome)) {
                resultados.add(c);
            }
        }
        return resultados;
    }

    public boolean removeContato(int indiceContatoNaLista) {
        if (indiceContatoNaLista >= 0 && indiceContatoNaLista < contatos.size()) {
            contatos.remove(indiceContatoNaLista);
            return true;
        } else {
            System.out.println("Índice inválido.");
            return false;
        }
    }

    @Override
    public String toString() {
        return "Agenda{" +
                "contatos=" + contatos +
                '}';
    }
}