/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Comportamientos.Ticker;

import Utils.AgentMethods;
import jade.core.Agent;
import jade.core.behaviours.TickerBehaviour;
import jade.lang.acl.ACLMessage;

/**
 *
 * @author Ron
 */
public class ComportamientoTickerReceptor extends TickerBehaviour {

    public ComportamientoTickerReceptor(Agent a, long timeout) {
        super(a, timeout);
    }

    @Override
    public void onTick() {
        ACLMessage mensajeRecibido = AgentMethods.esperarMensaje(myAgent);
        AgentMethods.responderMensaje(myAgent, mensajeRecibido, "Cadena de respuesta para: " + mensajeRecibido.getSender().getLocalName());
    }
}
