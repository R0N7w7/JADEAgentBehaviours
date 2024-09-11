/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Agentes.AgentesConComportamientos.Cyclic;

import Comportamientos.Cyclic.ComportamientoCyclicReceptor;
import jade.core.Agent;

/**
 *
 * @author Ron
 */
public class AgenteCyclicReceptor extends Agent {

    @Override
    public void setup() {
        addBehaviour(new ComportamientoCyclicReceptor(this));
    }
}
