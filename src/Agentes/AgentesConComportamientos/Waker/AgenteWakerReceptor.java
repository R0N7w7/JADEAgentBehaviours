/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Agentes.AgentesConComportamientos.Waker;

import Comportamientos.Waker.ComportamientoWakerReceptor;
import jade.core.Agent;

/**
 *
 * @author Ron
 */
public class AgenteWakerReceptor extends Agent {

    @Override
    public void setup() {
        long timeout = 6000;
        addBehaviour(new ComportamientoWakerReceptor(this, timeout));
    }
}
