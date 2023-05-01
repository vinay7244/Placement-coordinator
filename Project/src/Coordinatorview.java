import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionListener;

import javax.swing.*;



public class Coordinatorview extends JFrame
{
	private JTextField txtid;
	private JTextField txtname;
	private JTextField txtpass;
	private JTextField txtcgpa;
	private JTextField txtyear;
	private JTextField txtbranch;
	private JTextField txtplaced;
	private JTable table;
	private JTable table_1;
	private JTextField txtStudentId;
	private JLabel Ltxtid,Ltxtname;
	private JButton savebt;
	public JPanel panel2=new JPanel(new GridBagLayout());
    public JPanel panel = new JPanel(new GridBagLayout());
	public Coordinatorview()
	{
	super("Student Database");
    GridBagConstraints constraints = new GridBagConstraints();
    constraints.fill = GridBagConstraints.HORIZONTAL;
    constraints.gridx = 100;
    constraints.gridy = 100;
    
    Ltxtid=new JLabel("Id");
    panel.add(Ltxtid,constraints);
    
    constraints.gridx = 200;
    txtid=new JTextField(20);
    panel.add(txtid,constraints);
    
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
    
    constraints.gridy=400;
    constraints.gridx = 100;
    Ltxtname=new JLabel("CGPA");
    panel.add(Ltxtname,constraints);
    
    constraints.gridx = 200;
    constraints.gridy=400;
    txtcgpa=new JTextField(20);
    panel.add(txtcgpa,constraints);
    
    constraints.gridy=500;
    constraints.gridx = 100;
    Ltxtname=new JLabel("Year");
    panel.add(Ltxtname,constraints);
    
    constraints.gridx = 200;
    constraints.gridy=500;
    txtyear=new JTextField(20);
    panel.add(txtyear,constraints);
    
    constraints.gridy=600;
    constraints.gridx = 100;
    Ltxtname=new JLabel("Branch");
    panel.add(Ltxtname,constraints);
    
    constraints.gridx = 200;
    constraints.gridy=600;
    txtbranch=new JTextField(20);
    panel.add(txtbranch,constraints);
    
    constraints.gridy=700;
    constraints.gridx = 100;
    Ltxtname=new JLabel("Placed");
    panel.add(Ltxtname,constraints);
    
    constraints.gridx = 200;
    constraints.gridy=700;
    txtplaced=new JTextField(20);
    panel.add(txtplaced,constraints);
    
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
	






	public int getid()
	{
		return Integer.parseInt(txtid.getText());
	}
	public String getname()
	{
		return txtname.getText();
	}
	public String getpass()
	{
		return txtpass.getText();
	}
	public float getcgpa()
	{
		return Float.parseFloat(txtcgpa.getText());
	}
	public int getyear()
	{
		return Integer.parseInt(txtyear.getText());
	}
	public String getbranch()
	{
		return txtbranch.getText();
	}
	public boolean getplaced()
	{
		return Boolean.parseBoolean(txtplaced.getText());
	}
	public void addSaveListener(ActionListener listener)
	{
		savebt.addActionListener(listener);		
	}
	
	public void reset()
	{
		txtid.setText("");
		txtname.setText("");
		txtpass.setText("");
		txtcgpa.setText("");
		txtyear.setText("");
		txtbranch.setText("");
		txtplaced.setText("");
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
	
