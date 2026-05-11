package Collections.exercicio4;

public class Aluno {
	private String nome,dataNascimento,cpf;
	
	public Aluno(String nome,String cpf, String datanascimento) {
		this.setNome(nome);
		this.setCpf(cpf);
		this.setDataNascimento(datanascimento);
		
		
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String dadosAluno() {
	  return "Nome " +this.getNome()+ " Data de Nascimento "+this.getDataNascimento();
  }
}
