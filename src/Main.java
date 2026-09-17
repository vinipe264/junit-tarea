import controlador.CalculadoraControlador;
import modelo.CalculadoraModelo;
import vista.CalculadoraVista;

public class Main {
    public static void main(String[] args) {
        CalculadoraModelo modelo = new CalculadoraModelo();
        CalculadoraVista vista = new CalculadoraVista();
        new CalculadoraControlador(modelo, vista);
        
        vista.setVisible(true);
    }
}
