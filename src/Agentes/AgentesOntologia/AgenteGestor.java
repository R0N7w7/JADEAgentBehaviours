
package Agentes.AgentesOntologia;

import Ontologias.Reporte;
import Ontologias.Tarea;
import jade.core.Agent;
import jade.core.behaviours.CyclicBehaviour;
import jade.lang.acl.ACLMessage;

public class AgenteGestor extends Agent {
    protected void setup() {
        addBehaviour(new CyclicBehaviour() {
            public void action() {
                ACLMessage msg = receive();
                if (msg != null) {
                    try {
                        Reporte reporte = (Reporte) msg.getContentObject();
                        System.out.println("Se recibe el reporte de la tarea: " + reporte.getTarea().getNombre()+ ", Estado: " + reporte.getEstado());
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                } else {
                    block();
                }
            }
        });
    }
}
