/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Comportamientos.Cyclic;

import jade.core.Agent;
import Utils.AgentMethods;
import jade.core.behaviours.CyclicBehaviour;

/**
 *
 * @author Ron
 */
public class ComportamientoCyclicEmisor extends CyclicBehaviour {

    public ComportamientoCyclicEmisor(Agent agente) {
        myAgent = agente;
    }

    @Override
    public void action() {
        AgentMethods.enviarMensaje(myAgent, "AgenteReceptor", "Hola Agente Receptor");
        AgentMethods.esperarMensaje(myAgent);
    }
}
