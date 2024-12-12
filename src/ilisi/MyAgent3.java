package ilisi;

import jade.core.Agent;
import jade.core.behaviours.Behaviour;
import jade.core.behaviours.SequentialBehaviour;

public class MyAgent3 extends Agent {

	   @Override
	    protected void setup() {
	        System.out.println("Agent " + getLocalName() + " is starting...");
	        SequentialBehaviour sequentialBehaviour = new SequentialBehaviour();
	        sequentialBehaviour.addSubBehaviour(new SalutationBehaviour("hello", 3));
	        sequentialBehaviour.addSubBehaviour(new SalutationBehaviour("salam", 3));
	        sequentialBehaviour.addSubBehaviour(new SalutationBehaviour("bonjour", 3));
	        
	        addBehaviour(sequentialBehaviour);
	    }

	
}
