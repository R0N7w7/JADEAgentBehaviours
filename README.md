# JADE Agent Behaviours

A collection of small JADE examples that illustrate how agents send messages, attach behaviours, and exchange typed objects using simple ontology classes. The project covers basic agents, behaviour-driven emitters and receivers (Simple, OneShot, Cyclic, Ticker, Waker), and an ontology-driven workflow where a manager assigns tasks to employees and gathers reports.

## Project layout
- Main.java: boots JADE with the ontology demo agents (manager, two employees, and a supervisor/gestor).
- src/Agentes/AgentesBasicos: minimal agents that print to console or exchange a single ACL message.
- src/Agentes/AgentesConComportamientos: agents that attach behaviours for message exchange; grouped by behaviour type (Simple, OneShot, Cyclic, Ticker, Waker).
- src/Agentes/AgentesOntologia: agents that exchange serialized domain objects (Tarea, Empleado, Reporte).
- src/Comportamientos: behaviour implementations reused by the agents above.
- src/Ontologias: simple Serializable POJOs that model tasks, employees, and reports.
- src/Utils/AgentMethods.java: helper methods to send, wait for, and reply to ACL messages.

## Scenarios
### Basic agents
- MiPrimerAgente and MiSegundoAgente simply log a greeting on startup.
- AgenteEmisor sends an INFORM to AgenteReceptor, waits with blockingReceive, and logs the reply.
- AgenteReceptorEmisor receives one message and answers using createReply, showing the request/response pattern.

### Behaviour-driven messaging
All these behaviours rely on AgentMethods for consistent send/receive logic and target an agent named AgenteReceptor.
- Simple behaviours: ComportamientoSimple1/2 just log; ComportamientoSimpleEmisor/Receptor exchange three request/response cycles and then stop.
- OneShot behaviours: run once; the emitter sends and waits, the receiver replies once.
- Cyclic behaviours: repeat indefinitely, sending then waiting (emisor) or waiting then replying (receptor).
- Ticker behaviours: run periodically (emisor every 2s, receptor every 4s) to exchange messages.
- Waker behaviours: trigger once after a delay (emisor after 3s, receptor after 6s) and perform one exchange.

### Ontology workflow
- AgenteJefe creates Empleado objects and Tarea assignments, then sends each Tarea to AgenteEmpleado1 and AgenteEmpleado2 via INFORM messages.
- Each AgenteEmpleado waits for a Tarea, simulates work for its duration (seconds), and sends a Reporte (with estado and porcentajeRealizacion) to AgenteGestor.
- AgenteGestor receives Reporte objects and logs the task name and status, acting as a simple supervisor.

## Running the examples
Prerequisites: JDK 8+ and the JADE runtime (jade.jar) available on the classpath. Build files are NetBeans/Ant-based (build.xml), but you can also compile and run from the command line.

### Launch the ontology demo (default Main)
Main.java already prepares the JADE arguments for the ontology scenario. From your IDE, run Main. From the command line (adjust paths to jade.jar and build output):
```bash
javac -cp lib/jade.jar;src -d build/classes src/Main.java
java -cp lib/jade.jar;build/classes jade.Boot -gui -agents "AgenteJefe:Agentes.AgentesOntologia.AgenteJefe;AgenteEmpleado1:Agentes.AgentesOntologia.AgenteEmpleado;AgenteEmpleado2:Agentes.AgentesOntologia.AgenteEmpleado;AgenteGestor:Agentes.AgentesOntologia.AgenteGestor"
```

### Launch a behaviour pair
Example with the cyclic emitter/receiver (same idea for OneShot, Ticker, Waker):
```bash
java -cp lib/jade.jar;build/classes jade.Boot -gui -agents "AgenteEmisor:Agentes.AgentesConComportamientos.Cyclic.AgenteCyclicEmisor;AgenteReceptor:Agentes.AgentesConComportamientos.Cyclic.AgenteCyclicReceptor"
```
Replace the class names with the desired behaviour variants or basic agents (e.g., Agentes.AgentesBasicos.AgenteEmisor/AgenteReceptor).

### Notes
- Agent names in the JADE arguments must match the names used inside the behaviours (e.g., emitters send to AgenteReceptor).
- Most behaviours use blockingReceive, so start complementary agents together to avoid indefinite waiting.
- Time-based behaviours use milliseconds for delays (Ticker intervals, Waker wake time) defined inside the agent setup methods.

## Extending
- Add new behaviours under src/Comportamientos and wire them in new agents under src/Agentes.
- Expand the ontology objects (Empleado, Tarea, Reporte) with more fields or validation, and adjust serialization accordingly.
- Swap the JADE arguments in Main to boot different demo combinations depending on the behaviour you want to showcase.
