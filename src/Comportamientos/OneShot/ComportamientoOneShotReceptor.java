/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Comportamientos.OneShot;

import jade.core.Agent;
import Utils.AgentMethods;
import jade.core.behaviours.OneShotBehaviour;
import jade.lang.acl.ACLMessage;

/**
 *
 * @author Ron
 */
public class ComportamientoOneShotReceptor extends OneShotBehaviour {

    public ComportamientoOneShotReceptor(Agent agente) {
        myAgent = agente;
    }

    @Override
    public void action() {
        ACLMessage mensajeRecibido = AgentMethods.esperarMensaje(myAgent);
        AgentMethods.responderMensaje(myAgent, mensajeRecibido, "Cadena de respuesta para: " + mensajeRecibido.getSender().getLocalName());
    }
}
