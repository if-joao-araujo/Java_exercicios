package estrutura_tratamentoDeErros;
import java.util.Scanner;
import java.util.*;
public class exercicio1 {public static void main(String[] args) {
//exercicio1: divisão segura
Scanner leitor = new Scanner(System.in);
try {
		
	System.out.println("Digite o numero a: ");
	int numa = leitor.nextInt();
	System.out.println("Digite o numero b: ");
	int numb = leitor.nextInt();
	int divisao = numa/numb;
	
	System.out.println("O resultado é: "+divisao);
}catch (ArithmeticException e) {
	System.out.println("Não é permitido o divisor ser zero");
	// TODO: handle exception
}
finally {
	leitor.close();
}

	
}
}
