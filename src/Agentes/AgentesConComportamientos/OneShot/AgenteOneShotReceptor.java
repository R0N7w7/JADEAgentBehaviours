/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Agentes.AgentesConComportamientos.OneShot;

import Comportamientos.OneShot.ComportamientoOneShotReceptor;
import jade.core.Agent;

/**
 *
 * @author Ron
 */
public class AgenteOneShotReceptor extends Agent {

    @Override
    public void setup() {
        addBehaviour(new ComportamientoOneShotReceptor(this));
    }
}
