package Utils;

import jade.core.Agent;
import jade.lang.acl.ACLMessage;
import jade.core.AID;

public class AgentMethods {

    // Método para esperar un mensaje bloqueante
    public static ACLMessage esperarMensaje(Agent agente) {
        ACLMessage request = agente.blockingReceive();
        if (request != null) {
            System.out.println(agente.getLocalName() + " recibe mensaje de: " + request.getSender().getLocalName());
            System.out.println("El mensaje contiene: " + request.getContent());
        } else {
            System.out.println(agente.getLocalName() + ": No se recibió ningún mensaje.");
        }
        return request;
    }
    // Método para enviar una respuesta a un mensaje recibido
    public static void responderMensaje(Agent agente, ACLMessage request, String contenido) {
        if (request == null) {
            System.out.println(agente.getLocalName() + ": No hay mensaje al cual responder.");
            return;
        }

        ACLMessage response = request.createReply();
        response.setContent(contenido);

        agente.send(response);
        System.out.println(agente.getLocalName() + " responde correctamente.");
    }

    // Método para enviar un mensaje a un agente destino
    public static void enviarMensaje(Agent agente, String nombreDestino, String contenido) {
        ACLMessage mensaje = new ACLMessage(ACLMessage.INFORM);
        mensaje.addReceiver(new AID(nombreDestino, AID.ISLOCALNAME)); // Asume que el nombre es un AID local
        mensaje.setContent(contenido);

        agente.send(mensaje);
        System.out.println(agente.getLocalName() + " envió mensaje a " + nombreDestino);
    }
}
