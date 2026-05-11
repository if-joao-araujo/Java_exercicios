package estrutura_tratamentoDeErros;
import java.util.*;
public class exercicio3 {public static void main(String[] args) {
	Scanner leitor = new Scanner(System.in);
	
	while (true) {
		try {
		System.out.println("Digite o numero A:");
		int a = leitor.nextInt();
		System.out.println("Digite o numero B:");
		int b = leitor.nextInt();
		System.out.println("A divisão é:"+(a/b));
		
	}catch (ArithmeticException e) {
		System.out.println("Não é possivel fazer divisão por zero:");
	}catch (NumberFormatException e) {
		System.out.println("Digite apenas numeros");
	}catch (Exception e) {
		System.out.println("Digite numeros validos");	}
	try {
	System.out.println("Deseja encerra? Digite : [1] Sim ou  outro numero para continuar:");
	int condicao = leitor.nextInt();
	if(condicao == 1) {
		break;
	}}catch (Exception e) {
		System.out.println("Digite 1 ou outro numero");
	}
}
	}

}
