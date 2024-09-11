/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Comportamientos.Cyclic;

import jade.core.Agent;
import Utils.AgentMethods;
import jade.core.behaviours.CyclicBehaviour;
import jade.lang.acl.ACLMessage;

/**
 *
 * @author Ron
 */
public class ComportamientoCyclicReceptor extends CyclicBehaviour {

    public ComportamientoCyclicReceptor(Agent agente) {
        myAgent = agente;
    }

    @Override
    public void action() {
        ACLMessage mensajeRecibido = AgentMethods.esperarMensaje(myAgent);
        AgentMethods.responderMensaje(myAgent, mensajeRecibido, "Cadena de respuesta para: " + mensajeRecibido.getSender().getLocalName());
    }
}
