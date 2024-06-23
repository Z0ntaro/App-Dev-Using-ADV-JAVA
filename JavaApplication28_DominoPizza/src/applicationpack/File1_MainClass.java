package applicationpack;
import javax.swing.JFrame;
public class File1_MainClass
{
    public static void main(String[] args)
    { 
        File2_MainFrame frame = new File2_MainFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Pizza Order Collection Form");
        frame.setSize(800, 700);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
    }
}
