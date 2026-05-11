package Collections;
import java.util.*;

//Faça um programa em Java que leia 10 nomes de marcas de tênis e
//imprima cada uma delas. Utilize Sets e HashSets.
public class Exercicio2 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

Set<String> marcas = new HashSet<String>();
for (int contador = 1; contador<=10;contador++) {
	System.out.println("Digite a marca {"+contador+"} -> ");
	String marca = leitor.next(); 
	marcas.add(marca);}
for (String string : marcas) {
	System.out.println("Marcas: "+string);
	
}
}

}
