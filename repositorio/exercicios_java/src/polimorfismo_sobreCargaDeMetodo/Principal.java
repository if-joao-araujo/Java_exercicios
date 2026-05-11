package polimorfismo_sobreCargaDeMetodo;

public class Principal {
	public static void main(String[] args) {
		
	
	Cachorro c = new Cachorro();
	c.reagir("olá");
	c.reagir(true);
	c.reagir("vai apanhar");
	c.reagir(10,15);
	c.reagir(11,45);
	c.reagir(21,00);
	
	}
}
