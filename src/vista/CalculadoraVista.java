package vista;

import javax.swing.*;
import java.awt.*;

public class CalculadoraVista extends JFrame {

    public JTextField txtNumero1 = new JTextField(10);
    public JTextField txtNumero2 = new JTextField(10);
    public JTextField txtResultado = new JTextField(10);

    public JButton btnSumar = new JButton("+");
    public JButton btnRestar = new JButton("-");
    public JButton btnMultiplicar = new JButton("*");
    public JButton btnDividir = new JButton("/");

    public CalculadoraVista() {
        setTitle("Calculadora MVC");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(350, 200);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridLayout(5, 2, 5, 5));
        panel.add(new JLabel(" Número 1:"));
        panel.add(txtNumero1);
        panel.add(new JLabel(" Número 2:"));
        panel.add(txtNumero2);

        panel.add(btnSumar);
        panel.add(btnRestar);
        panel.add(btnMultiplicar);
        panel.add(btnDividir);

        panel.add(new JLabel(" Resultado:"));
        txtResultado.setEditable(false);
        panel.add(txtResultado);

        add(panel);
    }
}
