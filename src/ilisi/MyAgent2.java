package ilisi;

import jade.core.Agent;
import jade.core.behaviours.Behaviour;
import jade.core.behaviours.ParallelBehaviour;

public class MyAgent2 extends Agent {

    @Override
    protected void setup() {
        System.out.println("Agent " + getLocalName() + " is starting...");
        ParallelBehaviour parallelBehaviour = new ParallelBehaviour();
        parallelBehaviour.addSubBehaviour(new SalutationBehaviour("hello", 3));
        parallelBehaviour.addSubBehaviour(new SalutationBehaviour("salam", 3));
        parallelBehaviour.addSubBehaviour(new SalutationBehaviour("bonjour", 3));
        
        addBehaviour(parallelBehaviour);
    }

    @Override
    protected void takeDown() {
        System.out.println("Agent " + getLocalName() + " has been terminated.");
    }

}
