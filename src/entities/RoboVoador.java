package entities;

import utils.Combatente;
import utils.Comunicador;

//Classe concreta RoboVoador que herda da classe abstrata Robo e implementa as interfaces Combatente e Comunicador
public class RoboVoador extends Robo implements Combatente, Comunicador {

	@Override
	public void atacar() {
		if (nivelEnergia >= 30) {
			System.out.println("Robo Voador lança mísseis aéreos!");
			nivelEnergia -= 30;
		} else {
			System.out.println("Recarregue o robô para usar essa função");
		}
	}

	@Override
	public void defender() {
		if (nivelEnergia >= 15) {
		System.out.println("Robo Voador ativa uma barreira de energia.");
		nivelEnergia -= 15;
		} else {
			System.out.println("Recarregue o robô para usar essa função");
		}
	}

	@Override
	public void recarregar() {
		System.out.println("Robo Voador usa energia solar para se recarregar.");
		nivelEnergia = 100;
	}

	@Override
	public void enviarMensagem() {
		System.out.println("Robo Voador envia uma mensagem de localização: 'Rastreando coordenadas inimigas.'");
	}
}