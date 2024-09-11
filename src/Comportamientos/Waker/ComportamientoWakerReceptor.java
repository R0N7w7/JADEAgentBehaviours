/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Comportamientos.Waker;

import Utils.AgentMethods;
import jade.core.Agent;
import jade.core.behaviours.WakerBehaviour;
import jade.lang.acl.ACLMessage;

/**
 *
 * @author Ron
 */
public class ComportamientoWakerReceptor extends WakerBehaviour {

    public ComportamientoWakerReceptor(Agent a, long timeout) {
        super(a, timeout);
    }

    @Override
    public void onWake() {
        ACLMessage mensajeRecibido = AgentMethods.esperarMensaje(myAgent);
        AgentMethods.responderMensaje(myAgent, mensajeRecibido, "Cadena de respuesta para: " + mensajeRecibido.getSender().getLocalName());
    }
}
