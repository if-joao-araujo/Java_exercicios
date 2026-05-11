package Collections;
//Faça um programa em Java para ler o preço de um produto em cada um dos meses do ano e depois 
//imprimir a média do valor do produto no ano. Utilize Lists e ArrayLists.
import java.util.*;
import java.util.List;

public class exercicio1 {
	public static void main(String[] args) {
	Scanner leitor = new Scanner(System.in);


	
	ArrayList<Double> preco = new ArrayList<>();
	double media = 0;
	for(int contador =1 ;contador<=12;contador++) {
		System.out.println("Digite o preço no mes {"+contador+"}:");
		double num = leitor.nextDouble();
		media+=num;
		preco.add(num);
	}
	int contador =1;
	for (Double valoresMes : preco) {
		System.out.println("Preços no mes {"+contador+"} --> "+valoresMes);
		contador++;
	}System.out.println("Media anual --> "+media/12);

	leitor.close();
}
}
