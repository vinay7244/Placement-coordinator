import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionListener;

import javax.swing.*;



public class Coordinatorview2 extends JFrame
{
	//private JTextField txtid;
	public JTextField txtname;
	private JTextField txtpass;
	private JTextField txtcompensation;
	private JTextField txtbatch;
	private JTextField txtbranch;
	//private JTextField txtplaced;
	private JTable table;
	private JTable table_1;
	private JTextField txtStudentId;
	private JLabel Ltxtid,Ltxtname;
	private JButton savebt;
	private JButton okbt;
	JPanel panel2 = new JPanel(new GridBagLayout());
	private JPanel panel = new JPanel(new GridBagLayout());

	public Coordinatorview2()
	{
    super("Company Database");
    GridBagConstraints constraints = new GridBagConstraints();
    constraints.fill = GridBagConstraints.HORIZONTAL;
    
    constraints.gridy=200;
    constraints.gridx = 100;
    Ltxtname=new JLabel("Name");
    panel.add(Ltxtname,constraints);
    
    constraints.gridx = 200;
    constraints.gridy=200;
    txtname=new JTextField(20);
    panel.add(txtname,constraints);
    
    constraints.gridy=300;
    constraints.gridx = 100;
    Ltxtname=new JLabel("Password");
    panel.add(Ltxtname,constraints);
    
    constraints.gridx = 200;
    constraints.gridy=300;
    txtpass=new JTextField(20);
    panel.add(txtpass,constraints);
    
    
    constraints.gridx=150;
    constraints.gridy=900;
    savebt= new JButton("Save");
    panel.add(savebt, constraints);
   
    add(panel);
    pack();
    setLocationRelativeTo(null);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
	}

	public String getname()
	{
		return txtname.getText();
	}
	public String getpass()
	{
		return txtpass.getText();
	}
	public void addSaveListener(ActionListener listener)
	{
		savebt.addActionListener(listener);

	}
	public void reset()
	{
		txtname.setText("");
		txtpass.setText("");
		panel.revalidate();
		panel.repaint();
		
	}
	public void verify()
	{
    GridBagConstraints constraints = new GridBagConstraints();
    constraints.fill = GridBagConstraints.HORIZONTAL;
	
    constraints.gridy=100;
    constraints.gridx = 100;
    Ltxtname=new JLabel("Records Updated");
    panel2.add(Ltxtname,constraints);
    
    JOptionPane p=new JOptionPane(panel2);
    JDialog dialog = p.createDialog(new JFrame(), "Acknowledge");
    dialog.setSize(200, 200);
    dialog.setVisible(true);
		
	}
	public void close()
	{
		dispose();
	}
	
	
	

}
	
