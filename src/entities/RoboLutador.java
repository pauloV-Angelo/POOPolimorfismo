package entities;

import utils.Combatente;

//Classe concreta que herda da classe abstrata Robo e implementa a interface Combatente
public class RoboLutador extends Robo implements Combatente {

	@Override
	public void atacar() {
		if (nivelEnergia >= 20) {
			System.out.println("Robo Lutador usa um soco poderoso!");
			nivelEnergia -= 20;
		} else {
			System.out.println("Recarregue o robô para usar essa função");
		}
	}

	@Override
	public void defender() {
		if (nivelEnergia >= 10) {
			System.out.println("Robo Lutador bloqueia o ataque com seu escudo.");
			nivelEnergia -= 10;
		} else {
			System.out.println("Recarregue o robô para usar essa função");
		}
	}

	@Override
	public void recarregar() {
		System.out.println("Robo Lutador se conecta a uma estação de recarga.");
		nivelEnergia = 100;
	}
}
