import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionListener;
import javax.swing.*;
public class controller_4 {
	private view_4 v;
	private model_4 m;
    public controller_4(model_4 m,view_4 v) {
        this.m = m;
        this.v= v;
        int c=m.size();
        String [][]b=new String[c+1][7];
        b=m.connect(c+1);
        int k=m.size2();
        String [][]cc=new String[k+1][2];
        cc=m.connect2(k+1);
        v.render(b,cc);
        v.addOkListener(new OkListener());



        
    }
    class OkListener implements ActionListener{
    	public void actionPerformed(ActionEvent xx)
    	{
    		v.frame2.dispose();
    	}
    }

}
