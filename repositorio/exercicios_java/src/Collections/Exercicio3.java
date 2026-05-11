package Collections;
import java.util.*;
import java.util.Map;
import java.util.TreeMap;

//Faça um programa em Java que leia o CPF e a nota de 50 alunos de uma disciplina e imprima a nota do aluno 
//com CPF “764.605.203-56”. Utilize Maps e HashMaps. OBS: farei apenas 5, vsfd.

public class Exercicio3 {
	public static void main(String[] args) {
	

	Scanner leitor = new Scanner(System.in);
	Map<String, String> aluno = new HashMap<>();
	for (int contador = 1; contador <=5;contador++) {
		System.out.println("Digite o nome do aluno  {"+contador+"} -> ");
		String nome = leitor.next();
		System.out.println("Digite o CPF de {"+nome+"} --> ");
		String cpf = leitor.next();
		aluno.put(nome, cpf);
	}
	System.out.println("Digite o CPF do aluno que quer encontrar:");
	String busca = leitor.next();
	String nomeEncontrado = aluno.get(busca);
	if(nomeEncontrado!=null) {
		System.out.println("Aluno: "+aluno.get(nomeEncontrado));
	}else {
		System.out.println("Aluno não encontrado!!");
	}
	int cont = 1;
	System.out.println(" Todos alunos registrados:");
	aluno.forEach((nome,cpf) -> 
    System.out.println("CPF: " + cpf + ", Nome: " + nome));
}}

