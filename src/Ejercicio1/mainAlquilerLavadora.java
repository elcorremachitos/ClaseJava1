package Ejercicio1;
import javax.swing.JOptionPane;


public class mainAlquilerLavadora {
    public static void main(String[] args) {
        AlquilerLavadora lavadora = new AlquilerLavadora();
        lavadora.setHoras();
        lavadora.setTarifa();
        JOptionPane.showMessageDialog(null,"Subtotal: " + lavadora.calcularSubtotal() + " Descuento: " + lavadora.calcularDescuento() + " Totall: " + lavadora.calcularTotal());
    }
}
