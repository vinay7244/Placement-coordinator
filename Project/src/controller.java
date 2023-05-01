import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionListener;
import javax.swing.*;
public class controller {
	private view v;
	private model m;
    public controller(model m,view v) {
        this.m = m;
        this.v= v;

        v.addLoadListener(new LoadListener());


        
    }
    class LoadListener implements ActionListener{
    	public void actionPerformed(ActionEvent e)
    	{
    		v.frame.dispose();
    		int x=m.size();
    		System.out.println(x);
    		String [][]a=new String[x+1][7];
    		a=m.connect(x+1);
    		v.render(a);
            v.addUpdateListener(new UpdateListener());
            v.dispose();

            
            

    		
    		
    		
    	}
        class UpdateListener implements ActionListener{
        	public void actionPerformed(ActionEvent xx)
        	{
        		System.out.println("Hi");
        		m.query(v.getq());
        		v.frame1.dispose();
                int c=m.size1();
                String [][]b=new String[c+1][7];
                b=m.connect1(c+1);
                int k=m.size2();
                String [][]cc=new String[k+1][7];
                cc=m.connect2(k+1);
                v.verify();
                v.construct(b,cc);
                v.addOkListener(new OkListener());
        	}
    }
        class OkListener implements ActionListener{
        	public void actionPerformed(ActionEvent xx)
        	{
        		v.frame2.dispose();
        	}
        }

    }

}
