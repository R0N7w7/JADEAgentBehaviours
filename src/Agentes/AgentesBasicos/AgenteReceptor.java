package Agentes.AgentesBasicos;

import jade.core.Agent;
import jade.lang.acl.ACLMessage;

public class AgenteReceptor extends Agent {

    @Override
    public void setup() {
        ACLMessage mensajeRecibido = blockingReceive();

        if (mensajeRecibido == null) {
            System.out.println("No se recibió un mensaje");
            return;
        }

        System.out.println("Se recibió un mensaje de: "+mensajeRecibido.getSender().getLocalName());
        System.out.println("El mensjae contiene: " + mensajeRecibido.getContent());
    }
}
