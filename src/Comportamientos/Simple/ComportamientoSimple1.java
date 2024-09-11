/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Comportamientos.Simple;

import jade.core.Agent;
import jade.core.behaviours.SimpleBehaviour;

/**
 *
 * @author Ron
 */
public class ComportamientoSimple1 extends SimpleBehaviour {

    public ComportamientoSimple1(Agent agente) {
        myAgent = agente;
    }

    @Override
    public void action() {
        System.out.println("Hola soy un comportamiento simple del agente: " + myAgent.getLocalName());
    }

    @Override
    public boolean done() {
        return true;
    }
}
