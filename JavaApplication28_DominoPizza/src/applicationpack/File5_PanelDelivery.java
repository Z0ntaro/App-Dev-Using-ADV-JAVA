package applicationpack;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
public class File5_PanelDelivery extends JPanel
{
    private JRadioButton    rdbtnEatIn,rdbtnTakeOut;
    private ButtonGroup     btnGrpDelivery;
    private JRadioButton makeRadioButton(String cap, int x, int y, int w, int h)
    {
        JRadioButton temp = new JRadioButton(cap);
        temp.setOpaque(false);
        temp.setFont(new Font("verdana", 1, 16));
        temp.setBounds(x,y,w,h);
        temp.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
            }
        });
        add(temp);
        btnGrpDelivery.add(temp);
        return temp;
    }
    public File5_PanelDelivery()
    {
        btnGrpDelivery = new ButtonGroup();
        Border b1 = BorderFactory.createLineBorder(Color.BLUE, 3);
        Border b2 = BorderFactory.createTitledBorder(b1,"Mode of Delivery",TitledBorder.LEFT,TitledBorder.TOP,new Font("verdana",1,18));
        setBorder(b2);
        setBackground(Color.ORANGE);
        
        rdbtnEatIn  = makeRadioButton("Eat In",   10, 30,150,30);
        rdbtnEatIn.setSelected(true);
        rdbtnTakeOut = makeRadioButton("Take Out",   10, 70,150,30);
        
        
    }
}
