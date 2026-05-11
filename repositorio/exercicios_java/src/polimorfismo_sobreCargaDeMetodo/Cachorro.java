package polimorfismo_sobreCargaDeMetodo;

public class Cachorro extends Lobo {
    
    public void reagir(String frase) {
        if (frase.equals("toma comida") || frase.equals("olá")) {
            System.out.println("Abanar rabo");
        } else {
            System.out.println("Rosnar!!");
        }
    }
    
    public void reagir(int hora, int min) {
        if (hora >= 18) {
            System.out.println("Ignorado!!");
        } else if (hora < 12) {
            System.out.println("Abanar rabo");
        } else {
            System.out.println("Abanar e latir!!");
        }
    }
    
    public void reagir(boolean dono) {
        if (dono == true) {  // Poderia ser simplificado para if (dono)
            System.out.println("Abanando rabinho");
        } else {
            System.out.println("Rosnando!!");
        }
    }
    
    public void reagir(int idade, float peso) {
        if (idade <= 5) {
            if (peso < 10) {
                System.out.println("abanar ");
            } else {
                System.out.println("latir");
            }
        } else {
            if (peso < 10) {
                System.out.println("Rosnar");
            } else {
                System.out.println("Ignorado");
            }
        }
    }
}