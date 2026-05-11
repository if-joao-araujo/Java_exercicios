package Collections.exercicio4;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/*Você foi contratado para fazer o sistema de cadastro de alunos do IFPE. 
 * Modele a classe Aluno com os atributos: nome, cpf, dataNascimento; leia do teclado 
 * os dados de diversos alunos (parar quando o usuário digitar -1 no nome); 
 * armazenando-os em um uma lista; em seguida leia um cpf do teclado e imprima na tela o 
 * nome e a data de nascimento do aluno com o CPF digitado
 * */
public class Principal {public static void main(String[] args) {
	
	Scanner leitor = new Scanner(System.in);
	Map<String,Aluno>alunos = new TreeMap<>();
	
	
	while(true) {
		System.out.println("\n--- CADASTRO DE ALUNOS ---");
        System.out.println("Digite o nome (ou -1 para encerrar ):\n");
        String condicao = leitor.next();
		if(condicao.equals("-1")) {
			break;}
		System.out.println("Digite o nome:");
		String nome= leitor.nextLine();
		System.out.println("Digite o cpf de "+nome+":");
		String cpf = leitor.next();
		System.out.println("Digite a data de nascimento de "+nome+":");
		String dataNascimento = leitor.next(); 
		Aluno aluno = new Aluno(nome,cpf,dataNascimento);
		alunos.put(cpf, aluno);
	
	}
	
	
	System.out.println("Digite o CPF para buscar o aluno:");
	String cpfAluno = leitor.next();
	Aluno buscaAluno = alunos.get(cpfAluno);
	if(buscaAluno !=null) {
		System.out.println("Aluno encontrado!!");
		System.out.println(buscaAluno.dadosAluno());
		
	}else {
		System.out.println("Aluno não encontrado!!");
	} leitor.close();
}

}
