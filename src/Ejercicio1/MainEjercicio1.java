package Ejercicio1;
import javax.swing.JOptionPane;

public class MainEjercicio1 {
    public static void main(String[] args) {
        ejercicio1 worker = new ejercicio1();
        worker.addWorker();
        JOptionPane.showMessageDialog(null,"El trabajador " + worker.getName() + " tuvo una jornada de " + worker.getHoursWorked() + " y su salario fue de " + worker.calulateHours());
    }
}