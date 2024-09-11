package entities;

//Classe abstrata Robo define os atributos e métodos básicos
public abstract class Robo {
	protected int nivelEnergia;

	public Robo() {
		this.nivelEnergia = 100; // Todos os robôs começam com a barra de energia cheia
	}

	// Método comum para todos os robôs andarem
	public void andar() {
		if (nivelEnergia >= 10) {
			System.out.println("O robô está se movendo.");
			nivelEnergia -= 10;
		} else{
			System.out.println("Recarregue o robô para usar essa função");
		}
	}

	// Método abstrato que cada robô vai implementar de uma forma específica para recarregar energia
	public abstract void recarregar();
}