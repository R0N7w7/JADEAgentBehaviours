/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Comportamientos.Simple;

import jade.core.AID;
import jade.core.Agent;
import jade.core.behaviours.SimpleBehaviour;
import Utils.AgentMethods;
import jade.lang.acl.ACLMessage;

/**
 *
 * @author Ron
 */
public class ComportamientoSimpleReceptor extends SimpleBehaviour {

    int n = 0;

    public ComportamientoSimpleReceptor(Agent agente) {
        myAgent = agente;
    }

    @Override
    public void action() {
        ACLMessage mensajeRecibido = AgentMethods.esperarMensaje(myAgent);
        AgentMethods.responderMensaje(myAgent, mensajeRecibido, ("Este es un mensaje de respuesta para " + mensajeRecibido.getSender().getLocalName()));
        n++;
    }

    @Override
    public boolean done() {
        return n >= 3;
    }
}
