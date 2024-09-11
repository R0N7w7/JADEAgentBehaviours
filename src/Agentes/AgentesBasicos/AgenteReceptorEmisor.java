package Agentes.AgentesBasicos;

import jade.core.Agent;
import jade.lang.acl.ACLMessage;

public class AgenteReceptorEmisor extends Agent {

    @Override
    protected void setup() {
        // Espera de forma bloqueante hasta recibir un mensaje
        ACLMessage request = blockingReceive();

        // Si no se recibe un mensaje, imprime un aviso y termina
        if (request == null) {
            System.out.println("AgenteReceptorEmisor informa: No recibí mensaje");
            return;
        }

        // Imprime el remitente y contenido del mensaje recibido
        System.out.println("AgenteReceptorEmisor recibe mensaje de: " + request.getSender().getLocalName());
        System.out.println("El mensaje contiene: " + request.getContent());

        // Utiliza createReply() para generar automáticamente una respuesta dirigida al remitente original
        ACLMessage response = request.createReply();
        response.setContent("Esta cadena es un mensaje de respuesta a: " + request.getSender().getLocalName());

        // Envía la respuesta
        send(response);
        System.out.println("AgenteEmisorReceptor responde correctamente");
    }
}
