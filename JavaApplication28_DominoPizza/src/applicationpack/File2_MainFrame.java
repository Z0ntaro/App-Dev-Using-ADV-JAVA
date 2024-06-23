package applicationpack;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.border.Border;

class MainPanel extends JPanel implements ActionListener
{
    private JTextField      txtName,txtPhone;
    private JButton         btnSubmit,btnCommit,btnShowMore,btnExit,btnShowLess;
    private JTextArea       txtReport;
    private JScrollPane     spnReport;
    private File3_PanelSize     panelSize;
    private File4_PanelType     panelType;
    private File5_PanelDelivery panelDeliver;
    private File6_PanelToppings      panelTopping;
    
    private JLabel makeLabel(String cap, int x, int y, int w, int h)
    {
        JLabel temp = new JLabel(cap);
        temp.setFont(new Font("Courier New",1,20));
        temp.setBounds(x, y, w, h);
        add(temp);
        return(temp);
    }
    private JTextField makeTextField(int x,int y,int w,int h)
    {
        JTextField temp = new JTextField();
        temp.setFont(new Font("Courier New",1,20));
        temp.setHorizontalAlignment(JTextField.CENTER);
        temp.setBounds(x,y,w,h);
        add(temp);
        return temp;
    }
    private JButton makeButton(String cap,int x,int y,int w,int h)
    {
        JButton temp = new JButton(cap);
        temp.setFont(new Font("Verdana",1,14));
        temp.setBounds(x,y,w,h);
        temp.setMargin(new Insets(0,0,0,0));
        temp.addActionListener(this);
        add(temp);
        return temp;
    }
    public MainPanel()
    {
        JLabel cap = new JLabel("Domino's Pizza");
        cap.setFont(new Font("verdana",1,30));
        cap.setOpaque(true);
        cap.setBackground(Color.cyan);
        cap.setForeground(Color.BLUE);
        cap.setBounds(10,10,760,50);
        cap.setHorizontalAlignment(JLabel.CENTER);
        Border br1 = BorderFactory.createLineBorder(Color.RED, 3);
        Border br2 = BorderFactory.createLineBorder(Color.BLUE, 3);
        Border br3 = BorderFactory.createCompoundBorder(br2, br1);
        cap.setBorder(br3);
        add(cap);
        
        makeLabel("Customer Name",   10,70,170,30);
        txtName = makeTextField(    180,70,250,30);
        makeLabel("Phone",          440,70, 70,30);
        txtName = makeTextField(    520,70,250,30);
        
        panelSize = new File3_PanelSize();
        panelSize.setLayout(new BorderLayout());
        panelSize.setBounds(10,120,250,150);
        add(panelSize);
        
        panelType = new File4_PanelType();
        panelType.setLayout(new BorderLayout());
        panelType.setBounds(10,280,250,120);
        add(panelType);
        
        panelDeliver = new File5_PanelDelivery();
        panelDeliver.setLayout(new BorderLayout());
        panelDeliver.setBounds(350,280,420,120);
        add(panelDeliver);
        
        panelTopping = new File6_PanelToppings();
        panelTopping.setLayout(new BorderLayout());
        panelTopping.setBounds(350,120,420,150);
        add(panelTopping);
        
        btnSubmit   = makeButton("Submit", 80,410,100,30);
        btnCommit   = makeButton("Commit",260,410,100,30);
        btnShowMore = makeButton("Show>>",440,410,100,30);
        btnExit     = makeButton("Exit ", 620,410,100,30);
        
        txtReport = new JTextArea();
        txtReport.setFont(new Font("Courier New",1,14));
        spnReport = new JScrollPane(txtReport);
        spnReport.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        spnReport.setBounds(20,460,750,150);
        add(spnReport);
        
        btnShowLess  = makeButton("Show Less<<",325,620,150,30);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        Object ob = e.getSource();
        if(ob == btnSubmit)
        {
            String size = panelSize.getPizzaSize();
        }
        else if(ob == btnCommit)
        {
            
        }
        else if(ob == btnShowMore)
        {
            File2_MainFrame parent = (File2_MainFrame)SwingUtilities.getWindowAncestor(this); //to access mainframe
            parent.setSize(parent.getWidth(), 700);
            parent.setLocationRelativeTo(null);
        }
        else if(ob == btnExit)
        {
            
        }
        else if(ob == btnShowLess)
        {
            File2_MainFrame parent = (File2_MainFrame)SwingUtilities.getWindowAncestor(this);
            parent.setSize(parent.getWidth(), 485);
            parent.setLocationRelativeTo(null);
        }
    }
}
public class File2_MainFrame extends JFrame
{
    
    private MainPanel panel;
    public File2_MainFrame() 
    {
        panel = new MainPanel();
        panel.setBackground(Color.YELLOW);
        panel.setLayout(new BorderLayout());
        add(panel);
    }
}
