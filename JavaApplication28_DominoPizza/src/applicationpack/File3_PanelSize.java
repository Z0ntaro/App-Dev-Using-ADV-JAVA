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
public class File3_PanelSize extends JPanel
{
    private JRadioButton    rdbtnSmall,rdbtnMedium,rdbtnLarge;
    private ButtonGroup     btnGrpSize;
    private String          size="Medium";
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
        btnGrpSize.add(temp);
        return temp;
    }
    public File3_PanelSize()
    {
        btnGrpSize = new ButtonGroup();
        Border b1 = BorderFactory.createLineBorder(Color.BLUE, 3);
        Border b2 = BorderFactory.createTitledBorder(b1,"Size",TitledBorder.LEFT,TitledBorder.TOP,new Font("verdana",1,18));
        setBorder(b2);
        setBackground(Color.ORANGE);
        
        rdbtnSmall  = makeRadioButton("Small",   10, 30,100,30);
        rdbtnMedium = makeRadioButton("Medium",  10, 70,100,30);
        rdbtnMedium.setSelected(true);
        rdbtnLarge  = makeRadioButton("Large",   10,110,100,30);
        
    }
    public String getPizzaSize(){
        return size;
    }
}
