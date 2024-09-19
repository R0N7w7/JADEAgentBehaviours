package Agentes.AgentesOntologia;

import Ontologias.Empleado;
import Ontologias.Tarea;
import jade.core.Agent;
import jade.core.behaviours.OneShotBehaviour;
import jade.lang.acl.ACLMessage;
import jade.core.AID;

public class AgenteJefe extends Agent {
    protected void setup() {
        addBehaviour(new OneShotBehaviour() {
            public void action() {
                // Crear empleados
                Empleado emp1 = new Empleado("Juanito", "Developer", 100);
                Empleado emp2 = new Empleado("Anita", "Tester", 1);

                // Crear tareas
                Tarea tarea1 = new Tarea("Desarrollar la API", "Desarrollar la API en node.js con algún ORM", 5, emp1);
                Tarea tarea2 = new Tarea("Probar las nuevas caracteristicas de la web", "Realizar pruebas unitarias y de integación", 3, emp2);

                // Enviar tareas a los empleados
                sendTask(tarea1, "AgenteEmpleado1");
                sendTask(tarea2, "AgenteEmpleado2");
            }

            private void sendTask(Tarea tarea, String nombreEmpleado) {
                ACLMessage msg = new ACLMessage(ACLMessage.INFORM);
                msg.addReceiver(new AID(nombreEmpleado, AID.ISLOCALNAME));
                try {
                    msg.setContentObject(tarea);
                    send(msg);
                    System.out.println("Jefe envía tarea a: " + tarea.getEmpleadoAsignado().getNombre());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
