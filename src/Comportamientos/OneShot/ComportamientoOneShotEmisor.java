/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Comportamientos.OneShot;

import jade.core.Agent;
import Utils.AgentMethods;
import jade.core.behaviours.OneShotBehaviour;

/**
 *
 * @author Ron
 */
public class ComportamientoOneShotEmisor extends OneShotBehaviour {

    public ComportamientoOneShotEmisor(Agent agente) {
        myAgent = agente;
    }

    @Override
    public void action() {
        AgentMethods.enviarMensaje(myAgent, "AgenteReceptor", "Hola Agente Receptor");
        AgentMethods.esperarMensaje(myAgent);
    }
}
