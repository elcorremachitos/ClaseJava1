package Ejercicio1;
import javax.swing.JOptionPane;

public class MainEjercicio1 {
    public static void main(String[] args) {
        ejercicio1 worker = new ejercicio1();
        worker.addWorker();
        int hoursValueTotal = worker.calulateHours();
        String name = worker.getName();
        short hoursWorked = worker.getHoursWorked();
        JOptionPane.showMessageDialog(null,"El trabajador " + name + " tuvo una jornada de " + hoursWorked + " y su salario fue de " + hoursValueTotal);
    }
}