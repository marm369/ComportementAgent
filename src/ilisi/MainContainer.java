package ilisi;

import jade.core.Runtime;
import jade.wrapper.AgentContainer;
import jade.wrapper.AgentController;
import jade.wrapper.StaleProxyException;
import jade.core.Profile;
import jade.core.ProfileImpl;

public class MainContainer {
	public static void main(String[] arg) {
		
		Runtime runtime = Runtime.instance();
		ProfileImpl profile = new ProfileImpl();
		profile.setParameter(Profile.MAIN_HOST,"localhost");
		profile.setParameter(Profile.MAIN_PORT, "1099");
		profile.setParameter(Profile.GUI, "true");
		
		AgentContainer mainContainer = runtime.createMainContainer(profile);
		
		try {
			AgentController agent = mainContainer.createNewAgent("MyAgent","ilisi.MyAgent3",null);
			agent.start();
		} catch (StaleProxyException e) {
		
			e.printStackTrace();
		}
		
		
		
	}

}
