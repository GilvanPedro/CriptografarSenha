package br.com;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Criptografia criptografia = new Criptografia();
        Scanner sc = new  Scanner(System.in);
        Random rand =  new Random();

        String[] senha = {"senha muito foda", "senha media", "meio frouxa mas meh"};
        int num = rand.nextInt(senha.length+1);
        String senha2 = "";
        String hash = criptografia.criptografarSenha(senha[num]);

        System.out.println("Senha criptografada: " + hash);
        System.out.println("=========== Adivinhe a Senha ===========");
        while(!criptografia.descriptografarSenha(senha2, hash)){
            System.out.print("Digite seu senha: ");
            senha2 = sc.nextLine();

            if(criptografia.descriptografarSenha(senha2, hash)){
                System.out.println("Senha correta!!");
            } else{
                System.out.println("Senha incorreta!!");
            }
        }
    }
}