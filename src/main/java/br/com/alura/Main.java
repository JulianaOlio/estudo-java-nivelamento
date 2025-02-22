package br.com.alura;

import br.com.alura.model.Pessoa;
import com.google.gson.Gson;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String jsonPessoa = "{\"nome\":\"Anselmo\",\"idade\":44,\"cidade\":\"Osasco\"}";

        Gson gson = new Gson();
        Pessoa pessoa = gson.fromJson(jsonPessoa, Pessoa.class);

        System.out.println("Objeto Pessoa: " + pessoa);


    }
}