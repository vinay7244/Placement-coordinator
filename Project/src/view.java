import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionListener;
import javax.swing.*;

public class view extends JFrame {
private JTable table,table2;
private JButton reload,update,ok;
private JTextField txtq;
private JLabel ltxt,ltxt2,B1,B2,Ltxtname;
JFrame frame = new JFrame();
JFrame frame2=new JFrame();
JFrame frame1=new JFrame();
public JPanel panel = new JPanel(new GridBagLayout());

public view()
{
GridBagConstraints constraints = new GridBagConstraints();
constraints.fill = GridBagConstraints.HORIZONTAL;
constraints.gridx = 100;
constraints.gridy = 100;

reload= new JButton("Load Table");
panel.add(reload, constraints);


frame.add(panel);
frame.pack();
frame.setLocationRelativeTo(null);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setVisible(true);

}

public void addLoadListener(ActionListener listener)
{
	reload.addActionListener(listener);		
}
public void render(String[][] a)
{

	 String col[]= {"cName","role","jd","branch","stipend","cutoff","status"};
	 JPanel panel2 = new JPanel(new GridBagLayout());
	 GridBagConstraints constraints = new GridBagConstraints();
	 constraints.fill = GridBagConstraints.HORIZONTAL;
	 constraints.gridx = 100;
	 constraints.gridy = 100;
	 table=new JTable(a,col);
	 panel2.add(table,constraints);
	 B2=new JLabel("Enter the Threshold for stipends");
	 constraints.gridy=200;
	 panel2.add(B2,constraints);
	 constraints.gridy=300;
	 txtq=new JTextField();
	 update =new JButton("Update");
	 panel2.add(txtq,constraints);
	 constraints.gridx=200;
	 panel2.add(update,constraints);
	 frame1.add(panel2);
	 frame1.pack();
	 frame1.setLocationRelativeTo(null);
	 frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 frame1.setVisible(true);
	 
	 //JOptionPane p=new JOptionPane(panel2);
	 //JDialog dialog = p.createDialog(new JFrame(), "Acknowledge");
	 //dialog.setVisible(true);	

}
public void addUpdateListener(ActionListener listener)
{
	update.addActionListener(listener);		
}
public String getq()
{
	return txtq.getText();
}

public void construct(String[][] a,String[][] b)
{

	 ltxt=new JLabel("Apporved Companies:-");
	 B1=new JLabel(" ");
	 String col[]= {"cName","role","jd","branch","stipend","cutoff","status"};
	 JPanel panel3 = new JPanel(new GridBagLayout());
	 GridBagConstraints constraints = new GridBagConstraints();
	 constraints.fill = GridBagConstraints.HORIZONTAL;
	 constraints.gridx = 100;
	 constraints.gridy = 100;
	 panel3.add(ltxt,constraints);
	 constraints.gridy=200;
	 table=new JTable(a,col);
	 panel3.add(table,constraints);
	 constraints.gridy=300;
	 panel3.add(B1,constraints);
	 constraints.gridy=400;
	 ltxt2=new JLabel("Disapproved Companies:-");
	 panel3.add(ltxt2,constraints);
	 constraints.gridy=500;
	 table2=new JTable(b,col);
	 panel3.add(table2,constraints);
	 constraints.gridy=600;
	 ok=new JButton("Ok");
	 panel3.add(ok,constraints);
	 
	 frame2.add(panel3);
	 frame2.pack();
	 frame2.setLocationRelativeTo(null);
	 frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 frame2.setVisible(true);
	 
	 
	 
	 
	 
	
}
public void verify()
{
	 JPanel panel4 = new JPanel(new GridBagLayout());
GridBagConstraints constraints = new GridBagConstraints();
constraints.fill = GridBagConstraints.HORIZONTAL;

constraints.gridy=100;
constraints.gridx = 100;
Ltxtname=new JLabel("Records Updated");
panel4.add(Ltxtname,constraints);

JOptionPane p=new JOptionPane(panel4);
JDialog dialog = p.createDialog(new JFrame(), "Acknowledge");
dialog.setSize(150, 150);
dialog.setVisible(true);
	
}


public void addOkListener(ActionListener listener)
{
	ok.addActionListener(listener);
}




/**public static void main(String args[])
{
	view a=new view();
}**/ 

}
