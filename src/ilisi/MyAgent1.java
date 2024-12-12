package ilisi;

import jade.core.Agent;
import jade.core.behaviours.*;


	public class MyAgent1 extends Agent {

	    @Override
	    protected void setup() {
	        System.out.println("Agent " + getLocalName() + " is starting...");

	   
	        addBehaviour(new TickerBehaviour(this, 4000) {
	            @Override
	            protected void onTick() {
	                System.out.println("hello everybody");
	            }
	        });

	        addBehaviour(new TickerBehaviour(this, 7000) {
	            @Override
	            protected void onTick() {
	                System.out.println("salut");
	            }
	        });

	        addBehaviour(new WakerBehaviour(this, 20000) {
	            @Override
	            protected void onWake() {
	                System.out.println("well, I'm leaving the platform ...");
	                doDelete();
	            }
	        });
	    }

	    @Override
	    protected void takeDown() {
	        System.out.println("Agent " + getLocalName() + " has been terminated.");
	    }
	}



