package controlador;

import modelo.CalculadoraModelo;
import vista.CalculadoraVista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class CalculadoraControlador implements ActionListener {

    private final CalculadoraModelo modelo;
    private final CalculadoraVista vista;

    public CalculadoraControlador(CalculadoraModelo modelo, CalculadoraVista vista) {
        this.modelo = modelo;
        this.vista = vista;

        this.vista.btnSumar.addActionListener(this);
        this.vista.btnRestar.addActionListener(this);
        this.vista.btnMultiplicar.addActionListener(this);
        this.vista.btnDividir.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            double n1 = Double.parseDouble(vista.txtNumero1.getText());
            double n2 = Double.parseDouble(vista.txtNumero2.getText());
            double res = 0;

            if (e.getSource() == vista.btnSumar) res = modelo.sumar(n1, n2);
            else if (e.getSource() == vista.btnRestar) res = modelo.restar(n1, n2);
            else if (e.getSource() == vista.btnMultiplicar) res = modelo.multiplicar(n1, n2);
            else if (e.getSource() == vista.btnDividir) res = modelo.dividir(n1, n2);

            vista.txtResultado.setText(String.valueOf(res));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(vista, "Ingrese números válidos", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (ArithmeticException ex) {
            JOptionPane.showMessageDialog(vista, ex.getMessage(), "Error Math", JOptionPane.WARNING_MESSAGE);
        }
    }
}
