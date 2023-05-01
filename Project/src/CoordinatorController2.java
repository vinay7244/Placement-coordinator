import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionListener;

import javax.swing.*;

public class CoordinatorController2 {
    private CoordinatorModel2 model;
    private Coordinatorview2 view;

    public CoordinatorController2(CoordinatorModel2 model,Coordinatorview2 view) {
        this.model = model;
        this.view = view;

        view.addSaveListener(new SaveListener());
    }

    class SaveListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
        	//int id=view.getid();
        	String name=view.getname();
        	String pass=view.getpass();
        	view.verify();
        	view.reset();
        	view.close();
        	model.createEntry(name,pass);

        }
    }
}