package applicationpack;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JCheckBox;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

public class File6_PanelToppings extends JPanel 
{
    private JCheckBox[] chkbxTop = new JCheckBox[6];
    private String[]    top = {"Extra Cheese", "Black Olives", "Green Pepper", "Mashroom", "Onion", "Tomato"};

    private JCheckBox makeCheckBox(String cap, int x, int y, int w, int h)
    {
        JCheckBox temp = new JCheckBox(cap);
        temp.setOpaque(false);
        temp.setFont(new Font("verdana", 1, 14));
        temp.setBounds(x,y,w,h);
        temp.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
            }
        });
        add(temp);
        return temp;
    }
    
    public File6_PanelToppings()
    {
        
       
        Border b1 = BorderFactory.createLineBorder(Color.BLUE,4);
        Border b2 = BorderFactory.createTitledBorder(b1,"Topping",TitledBorder.LEFT,TitledBorder.TOP,new Font("verdana",1,18));
        setBackground(Color.ORANGE);
        setBorder(b2);
        int xPos = 20;
        int yPos = 30;
        for(int i=0; i<6;i++)
        {
            chkbxTop[i]=makeCheckBox(top[i],xPos,yPos,160,30);
            if(i==2)
            {
                xPos = 200;
                yPos = 30;
            }
            else
                yPos +=40;
        }
        
        /*rdbtncheese= makeCheckBox("Extra Cheese",20,30,160,30);
        rdbtnolives= makeCheckBox("Black Olives",20,70,160,30);
        rdbtnpepper= makeCheckBox("Green Pepper",20,110,160,30);
        rdbtnmushroom= makeCheckBox("Mushroom",170,30,160,30);
        rdbtnonion= makeCheckBox("Onion",170,70,160,30);
        rdbtntomato= makeCheckBox("Tomato",170,110,160,30);
       */ 
        
    }
    
    
    
}
