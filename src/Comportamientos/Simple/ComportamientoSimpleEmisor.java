/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Comportamientos.Simple;

import jade.core.AID;
import jade.core.Agent;
import jade.core.behaviours.SimpleBehaviour;
import Utils.AgentMethods;

/**
 *
 * @author Ron
 */
public class ComportamientoSimpleEmisor extends SimpleBehaviour {

    int n = 0;

    public ComportamientoSimpleEmisor(Agent agente) {
        myAgent = agente;
    }

    @Override
    public void action() {
        AgentMethods.enviarMensaje(myAgent, "AgenteReceptor", "Hola Agente Receptor");
        AgentMethods.esperarMensaje(myAgent);
        n++;
    }

    @Override
    public boolean done() {
        return n >= 3;
    }
}
