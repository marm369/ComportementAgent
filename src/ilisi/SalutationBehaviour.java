package ilisi;

import jade.core.behaviours.Behaviour;

public class SalutationBehaviour extends Behaviour {
    private final String salutation; 
    private final int repetitions; 
    private int counter = 0;

    public SalutationBehaviour(String salutation, int repetitions) {
        this.salutation = salutation;
        this.repetitions = repetitions;
    }

    @Override
    public void action() {
    	System.out.println(salutation);
        counter++;
    }

    @Override
    public boolean done() {
        return counter >= repetitions; 
    }

    @Override
    public int onEnd() {
        System.out.println(salutation + " behaviour completed.");
        return super.onEnd();
    }
}