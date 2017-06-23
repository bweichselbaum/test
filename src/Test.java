import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by bweic on 23.06.2017.
 */
public class Test {
    private JTextField txtZ1;
    private JTextField txtZ2;
    private JButton btnRechnen;
    private JButton btnloeschen;
    private JLabel lblErg;
    private JPanel panel;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Test");
        frame.setContentPane(new Test().panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        System.out.println("Hallo Welt!");
    }

    public Test(){
       btnRechnen.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               try{
                    double res = Double.parseDouble(txtZ1.getText()) + Double.parseDouble(txtZ2.getText());
                    lblErg.setText("" + res);
               } catch (Exception ex){
                   JOptionPane.showMessageDialog(null, "Fehler");
               }
           }
       });

       btnloeschen.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               txtZ1.setText("");
               txtZ2.setText("");
               lblErg.setText("");
           }
       });
    }
}
