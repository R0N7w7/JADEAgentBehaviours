/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Agentes.AgentesConComportamientos.Ticker;

import Comportamientos.Ticker.ComportamientoTickerEmisor;
import jade.core.Agent;

/**
 *
 * @author Ron
 */
public class AgenteTickerEmisor extends Agent {

    @Override
    public void setup() {
        long timeout = 2000;
        addBehaviour(new ComportamientoTickerEmisor(this, timeout));
    }
}
