package EjercicioWorker;
import javax.swing.JOptionPane;

public class MainEjercicioWorker {
    public static void main(String[] args) {
        ejercicioWorker worker = new ejercicioWorker();
        worker.addWorker();
        worker.calulateHours();
        JOptionPane.showMessageDialog(null,"El trabajador " + worker.getName() + " tuvo una jornada de " + worker.getHoursWorked() + " y su salario fue de " + worker.getTotalValue());
    }
}