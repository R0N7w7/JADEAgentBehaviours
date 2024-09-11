/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Agentes.AgentesConComportamientos.Ticker;

import Comportamientos.Ticker.ComportamientoTickerReceptor;
import jade.core.Agent;

/**
 *
 * @author Ron
 */
public class AgenteTickerReceptor extends Agent {

    @Override
    public void setup() {
        long timeout = 4000;
        addBehaviour(new ComportamientoTickerReceptor(this, timeout));
    }
}
