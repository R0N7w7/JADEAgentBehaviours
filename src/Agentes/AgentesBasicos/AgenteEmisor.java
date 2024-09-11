package Agentes.AgentesBasicos;

import jade.core.AID;
import jade.core.Agent;
import jade.lang.acl.ACLMessage;

public class AgenteEmisor extends Agent {

    @Override
    public void setup() {
        // Se crea un mensaje de la clase ACLMessage con la performativa (tipo) INFORM
        // La performativa INFORM indica que se está enviando un mensaje de tipo informativo
        ACLMessage mensaje = new ACLMessage(ACLMessage.INFORM);

        // Se le indica al mensaje el nombre del receptor
        // El segundo parámetro de AID.ISLOCALNAME indica que "AgenteReceptor" es un agente local
        mensaje.addReceiver(new AID("AgenteReceptor", AID.ISLOCALNAME));

        // Se añade el contenido del mensaje que será recibido por el agente destino
        mensaje.setContent("Hola agente receptor");

        // Se llama al método send para enviar el mensaje, que es propio de los objetos que heredan de la clase Agent
        send(mensaje);

        // Mensaje debug para verificar que el envío del mensaje fue exitoso
        System.out.println("Agente emisor envia correctamente el mensaje");

        // Se espera recibir una respuesta del agente receptor usando blockingReceive()
        // Este método bloquea la ejecución hasta que llega un mensaje
        ACLMessage respuesta = blockingReceive();

        // Verifica si no se recibió ningún mensaje de respuesta
        if (respuesta == null) {
            System.out.println("AgenteEmisor no recibió ninguna respuesta");
            return;  // Si no hay respuesta, termina la ejecución
        }

        // Si se recibe un mensaje, se imprime el nombre del remitente del mensaje
        System.out.println("Agente emisor recibe un mensaje de: " + respuesta.getSender().getLocalName());

        // Se imprime el contenido del mensaje recibido
        System.out.println("El mensaje contiene: " + respuesta.getContent());;
    }
}
