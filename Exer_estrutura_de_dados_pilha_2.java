package Aulajava7;

import java.util.Scanner;
import java.util.Stack;

public class Exer_estrutura_de_dados_pilha_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String livro;// declarando minha variavel que sera adicionada na pilha
int opcao=0;// minha op��o � igual a zero, por que o zero � retirado e entra a op��o que a pessoa digitar.

Scanner leia = new Scanner(System.in);//declarando meu scanner

		
            Stack<String> pilha = new Stack <String>(); // definindo que meu programa ser� uma pilha do tipo String
            
 do {          // iniciando o menu de op��es 
	 
	System.out.println("\n1-Adicionar Livro na pilha :"); 
	System.out.println("\n2-Listar todos os Livros :"); 
	System.out.println("\n3-Retirar livro da pilha :"); 
	System.out.println("\n0-Sair :"); 
opcao=leia.nextInt(); // lendo a op�ao que o usuario ira digitar

switch (opcao) { //definindo que o meu switch ir� verificar a variaver de op��o

case 1: //caso o usuario digite 1 fazer isso aqui
	leia.nextLine(); //apenas limpando a tela
	
	System.out.println("\nDigite o nome do seu livro: ");
    livro=leia.nextLine(); // lendo a string/palavra/nome do livro que o usuario digitou
    pilha.push(livro); // adicionando a informa��o na minha pilha
    System.out.println("\n"+pilha); // mostrando minha pilha
    System.out.println("\nLivro adicionado com Sucesso!! "); //mensagem de confirma��o
    
break; // BREAK SEMPRE QUE ACABAR COM CADA CASO

case 2:   //caso o usuario digite 2 fazer isso aqui
	leia.nextLine();//apenas limpando a tela
	
	System.out.println("\nEssa � a lista de todos os Livros : "+pilha);// mostrando minha pilha
	
break;// BREAK SEMPRE QUE ACABAR CADA CASO

case 3://caso o usuario digite 3 fazer isso aqui
	leia.nextLine();//apenas limpando a tela
	pilha.pop();//retirando a ultima informa��o adicionado na minha pilha
	System.out.println("\nEste livro foi Retirado !!!");
	
break;// BREAK SEMPRE QUE ACABAR CADA CASO

case 0: //caso o usuario digite 0 fazer isso aqui
	leia.nextLine();//apenas limpando a tela
	System.out.println("\nO programa foi Finalizado!!!");

break;// BREAK SEMPRE QUE ACABAR CADA CASO
	
default:	//caso o usuario digite qualquer op��o que n�o exista fazer isso aqui
	
System.out.println("\nOp��o invalida !!! ");
}
 }
 
while (opcao!=0);
		
	}

}
