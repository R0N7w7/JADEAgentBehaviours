package Agentes.AgentesOntologia;

import Ontologias.Reporte;
import Ontologias.Tarea;
import jade.core.AID;
import jade.core.Agent;
import jade.core.behaviours.CyclicBehaviour;
import jade.lang.acl.ACLMessage;

public class AgenteEmpleado extends Agent {
    protected void setup() {
        addBehaviour(new CyclicBehaviour() {
            public void action() {
                ACLMessage msg = receive();
                if (msg != null) {
                    try {
                        Tarea tarea = (Tarea) msg.getContentObject();
                        System.out.println("Tarea recibida: " + tarea.getNombre());
                        // Simular trabajo
                        doWait(tarea.getDuracion() * 1000);

                        // Enviar reporte
                        Reporte reporte = new Reporte(tarea, "Completed", 100);
                        sendReport(reporte);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                } else {
                    block();
                }
            }

            private void sendReport(Reporte reporte) {
                ACLMessage reportMsg = new ACLMessage(ACLMessage.INFORM);
                reportMsg.addReceiver(new AID("AgenteGestor", AID.ISLOCALNAME));
                try {
                    reportMsg.setContentObject(reporte);
                    send(reportMsg);
                    System.out.println("Se envía reporte de la tarea: " + reporte.getTarea().getNombre());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
