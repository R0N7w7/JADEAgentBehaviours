/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Agentes.AgentesConComportamientos.Waker;

import Comportamientos.Waker.ComportamientoWakerEmisor;
import jade.core.Agent;

/**
 *
 * @author Ron
 */
public class AgenteWakerEmisor extends Agent {

    @Override
    public void setup() {
        long timeout = 3000;
        addBehaviour(new ComportamientoWakerEmisor(this, timeout));
    }
}
