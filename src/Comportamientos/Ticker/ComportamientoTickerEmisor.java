/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Comportamientos.Ticker;

import Utils.AgentMethods;
import jade.core.Agent;
import jade.core.behaviours.TickerBehaviour;

/**
 *
 * @author Ron
 */
public class ComportamientoTickerEmisor extends TickerBehaviour {

    public ComportamientoTickerEmisor (Agent a, long timeout) {
        super(a, timeout);
    }

    @Override
    public void onTick() {
        AgentMethods.enviarMensaje(myAgent, "AgenteReceptor", "Hola Agente Receptor");
        AgentMethods.esperarMensaje(myAgent);
    }
}
