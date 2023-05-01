import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionListener;
import javax.swing.*;
public class Coordinatorview_GM extends JFrame {
	private JButton c1,c2,c3,c4;
	private JLabel L1,L2,L3,L4;
    public JPanel panel = new JPanel(new GridBagLayout());
    public Coordinatorview_GM()
    {
    	super("Placement Coordinator Window");
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.gridx = 100;
        constraints.gridy = 100;
        
        L1=new JLabel("Click here to enter Student details");
        panel.add(L1,constraints);
        constraints.gridx = 200;
        c1=new JButton("Click me");
        panel.add(c1,constraints);

        constraints.gridx = 100;
        constraints.gridy = 200;
        L2=new JLabel("Click here to enter Company details");
        panel.add(L2,constraints);
        constraints.gridx = 200;
        c2=new JButton("Click me");
        panel.add(c2,constraints);

        constraints.gridx = 100;
        constraints.gridy = 300;
        L3=new JLabel("Click here to Approve Companies");
        panel.add(L3,constraints);
        constraints.gridx=200;
        c3=new JButton("Click me");
        panel.add(c3,constraints);
        
        constraints.gridx = 100;
        constraints.gridy = 400;
        L4=new JLabel("Click here to Display Tables");
        panel.add(L4,constraints);
        constraints.gridx=200;
        c4=new JButton("Click me");
        panel.add(c4,constraints);


        
        add(panel);
        pack();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);  	
    }
    public void addC1Listener(ActionListener listener)
    {
    	c1.addActionListener(listener);
    }
    public void addC2Listener(ActionListener listener)
    {
    	c2.addActionListener(listener);
    }
    public void addC3Listener(ActionListener listener)
    {
        c3.addActionListener(listener);
    }
    public void addC4Listener(ActionListener listener)
    {
        c4.addActionListener(listener);
    }
    

}
