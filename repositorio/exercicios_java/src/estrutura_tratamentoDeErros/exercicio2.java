package estrutura_tratamentoDeErros;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class exercicio2 {public static void main(String[] args) {
Scanner leitor = new Scanner(System.in);
List<String> lista = new ArrayList<>();
lista.add("joão"); lista.add("maria");lista.add("cezar");
try {
	System.out.println("Deseja ver o nome de qual posição na lista?");
	int busca = leitor.nextInt();
	lista.get(busca);
	System.out.println(lista.get(busca));
}catch (IndexOutOfBoundsException e) {
	System.out.println("nome não encontrado");
}
}

}
