/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Comportamientos.Waker;

import Utils.AgentMethods;
import jade.core.Agent;
import jade.core.behaviours.WakerBehaviour;

/**
 *
 * @author Ron
 */
public class ComportamientoWakerEmisor extends WakerBehaviour {

    public ComportamientoWakerEmisor(Agent a, long timeout) {
        super(a, timeout);
    }

    @Override
    public void onWake() {
        AgentMethods.enviarMensaje(myAgent, "AgenteReceptor", "Hola Agente Receptor");
        AgentMethods.esperarMensaje(myAgent);
    }
}
