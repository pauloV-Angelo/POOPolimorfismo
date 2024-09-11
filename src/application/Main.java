package application;

import entities.Robo;
import entities.RoboLutador;
import entities.RoboVoador;

public class Main {
    public static void main(String[] args) {
        // Criando robôs através da referencia da superclasse Robo (polimorfismo + upcasting)
        Robo meuRobo1 = new RoboLutador();
        Robo meuRobo2 = new RoboVoador();

        // métodos comuns da classe abstrata
        meuRobo1.andar();  
        meuRobo2.andar(); 
        System.out.println();

        /* métodos específicos de cada robô, porém sem precisar do downcasting ainda 
         * por se tratar de um método sobreescrito da superclasse */
        meuRobo1.recarregar();  
        meuRobo2.recarregar();  
        System.out.println();
        
        // Testando o polimorfismo da interface Combatente e downcasting dos objetos
       RoboLutador meuRoboLutador = (RoboLutador) meuRobo1; 
       RoboVoador meuRoboVoador = (RoboVoador) meuRobo2;
       meuRoboLutador.atacar();
       meuRoboLutador.defender();
       meuRoboVoador.atacar();
       meuRoboVoador.defender();
       System.out.println();

        // Testando a interface Comunicador do RoboVoador
       meuRoboVoador.enviarMensagem();
    }
}
