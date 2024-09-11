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
public class ComportamientoSimple2 extends SimpleBehaviour {

    int n = 0;

    public ComportamientoSimple2(Agent agente) {
        myAgent = agente;
    }

    @Override
    public void action() {
        System.out.println("Hola, soy otro comportamiento simple del agente: " + myAgent.getLocalName());
        n++;
    }

    @Override
    public boolean done() {
        return n >= 10;
    }
}
