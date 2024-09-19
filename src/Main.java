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
            "AgenteJefe:Agentes.AgentesOntologia.AgenteJefe;"
            + "AgenteEmpleado1:Agentes.AgentesOntologia.AgenteEmpleado;"
            + "AgenteEmpleado2:Agentes.AgentesOntologia.AgenteEmpleado;"
            + "AgenteGestor:Agentes.AgentesOntologia.AgenteGestor;"
        };
        jade.Boot.main(JADEARGS);
    }
}
