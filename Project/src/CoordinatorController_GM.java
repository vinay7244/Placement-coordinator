import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionListener;
import javax.swing.*;

public class CoordinatorController_GM {
	private Coordinatorview_GM view;
	public CoordinatorController_GM()
	{
		this.view=new Coordinatorview_GM();
	    this.view.addC1Listener(new C1Listener());
	    this.view.addC2Listener(new C2Listener());
	    this.view.addC3Listener(new C3Listener());
	    this.view.addC4Listener(new C4Listener());
	    
	}

    class C1Listener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
        	CoordinatorApp a=new CoordinatorApp(); 
        		
        }
    }
    class C2Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
        	CoordinatorApp2 b=new CoordinatorApp2(); 
        		
        }
    }
    class C3Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
        	App a=new App();
        		
        }
    }
    class C4Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
        	App_4 a=new App_4();
        		
        }
    }
}
