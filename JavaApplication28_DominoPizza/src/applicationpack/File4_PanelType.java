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
public class File4_PanelType extends JPanel
{
    private JRadioButton    rdbtnThin,rdbtnThick;
    private ButtonGroup     btnGrpType;
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
        btnGrpType.add(temp);
        return temp;
    }
    public File4_PanelType()
    {
        btnGrpType = new ButtonGroup();
        Border b1 = BorderFactory.createLineBorder(Color.BLUE, 3);
        Border b2 = BorderFactory.createTitledBorder(b1,"Crust Type",TitledBorder.LEFT,TitledBorder.TOP,new Font("verdana",1,18));
        setBorder(b2);
        setBackground(Color.ORANGE);
        
        rdbtnThin  = makeRadioButton("Thin Crust",   10, 30,150,30);
        rdbtnThin.setSelected(true);
        rdbtnThick = makeRadioButton("Thick Crust",   10, 70,150,30);
        
        
    }
}
