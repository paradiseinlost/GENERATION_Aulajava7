package Aulajava7;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exer_estrutura_de_dados_fila_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
int opcao=0; // minha opção é igual a zero, por que o zero é retirado e entra a opção que a pessoa digitar.
String nome ; // declarando minha variavel que sera adicionada na QUEUE / FILA

Scanner leia = new Scanner (System.in); //declarando meu scanner
				
Queue<String> fila=new LinkedList<String>(); // definindo que meu programa será uma QUEUE/LISTA do tipo String

do { // iniciando o menu de opções
	
	System.out.println("\n1- Adicionar o seu nome na fila : ");
	System.out.println("\n2- Listar todos os clientes da fila : ");
	System.out.println("\n3- Retirar o cliente da fila : ");
	System.out.println("\n0- Sair : ");
	
opcao=leia.nextInt(); // lendo a opçao que o usuario ira digitar

switch (opcao) { //definindo que o meu switch irá verificar a variaver de opção

case 1: //caso o usuario digite 1 fazer isso aqui
	leia.nextLine(); //apenas limpando a tela
	
	System.out.println("\n Digite o seu nome : " ) ;
	
    nome=leia.nextLine(); // lendo a string/palavra/nome da pessoa que o usuario digitou
    
    fila.add(nome); // adicionando a informação na minha QUEUE / FILA
    
    System.out.println("\n"+fila); // mostrando minha fila
    
    System.out.println("\n Cliente adicionado com Sucesso !!! "); //mensagem de confirmação
    
break;// BREAK SEMPRE QUE ACABAR COM CADA CASO

case 2: //caso o usuario digite 2 fazer isso aqui
	
	leia.nextLine();//apenas limpando a tela
	
	System.out.println("\n Estes são os clientes que estão na fila : "+fila); // mostrando minha fila
	
break;// BREAK SEMPRE QUE ACABAR COM CADA CASO
	
case 3: //caso o usuario digite 3 fazer isso aqui
	
	leia.nextLine();//apenas limpando a tela
	
	fila.poll();//retirando a PRIMEIRA informação adicionado na minha fila
	
	System.out.println("\n"+fila); // mostrando minha fila
	
	System.out.println("\nO cliente foi chamado ! ");
	
break;// BREAK SEMPRE QUE ACABAR COM CADA CASO

case 0: //caso o usuario digite 0 fazer isso aqui
	
	leia.nextLine();//apenas limpando a tela
	
	System.out.println("\nO programa foi Finalizado!!!");
	
break;// BREAK SEMPRE QUE ACABAR COM CADA CASO

default: //caso o usuario digite qualquer opção que não exista fazer isso aqui

System.out.println("\nOpção inválida!!!");
}
			
}

while (opcao!=0);
			}

}
