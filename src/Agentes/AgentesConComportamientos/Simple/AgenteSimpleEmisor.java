/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Agentes.AgentesConComportamientos.Simple;

import Comportamientos.Simple.ComportamientoSimpleEmisor;
import jade.core.Agent;

/**
 *
 * @author Ron
 */
public class AgenteSimpleEmisor extends Agent {

    @Override
    public void setup() {
        addBehaviour(new ComportamientoSimpleEmisor(this));
    }
}
