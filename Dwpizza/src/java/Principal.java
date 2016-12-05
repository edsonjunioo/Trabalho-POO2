import java.util.Scanner;
import java.io.IOException;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Edson
 */
public class Principal {
    
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        String login;
        int senha;
        String sabor;
        
        System.out.print("Login: ");
        login = ler.nextLine();
        
        System.out.print("\nSenha: ");
        senha = ler.nextInt();
        
       if (senha == 1234){
       System.out.printf("\n Seja bem vindo Sr. \"%s\".\n\n", login);
       }else{ System.out.printf("Login ou Senha incorretos\n\n");
       }
       
       
       System.out.print("Escolha o sabor da Pizza\n\n");
       sabor = ler.nextLine();
       
        
        Pizza sA1 = new PizzaCalabresa();
        Pizza sA2 = new PizzaMarguerita();
        Pizza sB1 = new PizzaMussarela();
        Pizza sB2 = new PizzaPortuguesa();
        Pizza sC1 = new PizzaFrango();
        Pizza sC2 = new PizzaPortuguesa();
        
        sA1 = new AdicionalBorda(sA1);
        sA1 = new AdicionalTomateSeco(sA1);
        sB1 = new AdicionalTomateSeco(sB1);
        sB2 = new AdicionalChampignon(sB2);
        
        System.out.println("Cardapio de Pizzas e Preços");
        
        System.out.println(sA1.getDescricao() + " PRECO: " + sA1.getCusto());
        
        
        
        System.out.println("Sugestões com adicionais");
        
        System.out.println(sA1.getDescricao() + " PRECO: " + sA1.getCusto());
        System.out.println(sA2.getDescricao() + " PRECO: " + sA2.getCusto());
        System.out.println(sB1.getDescricao() + " PRECO: " + sB1.getCusto());
        System.out.println(sB2.getDescricao() + " PRECO: " + sB2.getCusto());
        System.out.println(sC1.getDescricao() + " PRECO: " + sC1.getCusto());
        System.out.println(sC2.getDescricao() + " PRECO: " + sC2.getCusto());
}
    
      
       
    
}
