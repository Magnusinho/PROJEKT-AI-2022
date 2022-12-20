
package com.sample;
 
import javax.swing.JOptionPane;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;



public class DroolsTest {

    public static final void main(String[] args) {
        try {
	        KieServices ks = KieServices.Factory.get();
    	    KieContainer kContainer = ks.getKieClasspathContainer();
        	KieSession kSession = kContainer.newKieSession("ksession-rules");

            kSession.fireAllRules();
            kSession.dispose();
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }

    public static int GUI(String mess) {
    	 int result = JOptionPane.showConfirmDialog(null, mess, "WHAT SHOULD I EAT? - VEGE", JOptionPane.YES_NO_OPTION);
    	 return result;
    }
    
    public static void finalGUI(String mess) {
    	JOptionPane.showMessageDialog(null, "Eat: "+ mess, "WHAT SHOULD I EAT? - VEGE" , JOptionPane.INFORMATION_MESSAGE);
    }

}
