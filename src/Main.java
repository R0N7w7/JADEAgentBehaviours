/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Ron
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final String[] JADEARGS = new String[]{
            "-agents",
            "AgenteEmisor:Agentes.AgentesConComportamientos.Cyclic.AgenteCyclicEmisor;"
            + "AgenteReceptor:Agentes.AgentesConComportamientos.Cyclic.AgenteCyclicReceptor"
        };
        jade.Boot.main(JADEARGS);
    }
}
