import javax.swing.*;
import java.awt.*;

public class Clientes extends JFrame{
    private JTextField textField1;
    private JTextField textField2;
    private JButton button1;
    private JButton button2;
    private JComboBox comboBox1;
    private JComboBox comboBox2;
    private JComboBox comboBox3;

    JPanel panel = new JPanel();

    public Clientes () throws HeadlessException{
        super("Clientes");
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        setSize(600,600);
        AgregarComponentes();
        setVisible(true);
    }
    public void AgregarComponentes() {
        button1 = new JButton("Guardar");
        button1.setActionCommand("1");
        panel.add(button1);

        getContentPane().add(panel);





    }




}
