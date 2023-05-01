import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionListener;
import javax.swing.*;
public class view_4 extends JFrame{
	private JTable table,table2;
	private JButton ok;
	private JLabel ltxt,ltxt2,B1;
	JFrame frame2 = new JFrame();
	public JPanel panel = new JPanel(new GridBagLayout());
	public void render(String[][] a,String[][] b)
	{

		 ltxt=new JLabel("Student Database:-");
		 B1=new JLabel(" ");
		 String col[]= {"id","name","password","cgpa","year","branch","placed"};
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
		 ltxt2=new JLabel("Comapany Database:-");
		 panel3.add(ltxt2,constraints);
		 constraints.gridy=500;
		 String h[]= {"name","password"};
		 table2=new JTable(b,h);
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
	public void addOkListener(ActionListener listener)
	{
		ok.addActionListener(listener);
	}

}
