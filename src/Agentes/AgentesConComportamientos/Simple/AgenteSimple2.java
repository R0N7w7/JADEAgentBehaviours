/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Agentes.AgentesConComportamientos.Simple;

import jade.core.Agent;
import Comportamientos.Simple.ComportamientoSimple2;

/**
 *
 * @author Ron
 */
public class AgenteSimple2 extends Agent {

    @Override
    public void setup() {
        addBehaviour(new ComportamientoSimple2(this));
    }
}
