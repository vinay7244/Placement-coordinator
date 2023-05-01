import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionListener;

import javax.swing.*;

public class CoordinatorController {
    private CoordinatorModel model;
    private Coordinatorview view;

    public CoordinatorController(CoordinatorModel model,Coordinatorview view) {
        this.model = model;
        this.view = view;

        view.addSaveListener(new SaveListener());
    }

    class SaveListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
        	int id=view.getid();
        	String name=view.getname();
        	String pass=view.getpass();
        	float cgpa=view.getcgpa();
        	int year=view.getyear();
        	String branch=view.getbranch();
        	boolean b=view.getplaced();
        	view.reset();
        	view.verify();
        	view.close();
        	model.createEntry(id,name,pass,cgpa,year,branch,b);
        }
    }
}