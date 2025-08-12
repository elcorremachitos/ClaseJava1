/*
EJERCICIO 1 - Explicacion:
 Una empresa paga el salario segun las horas trabajadas por semana.
 El monto por hora depende de la cantidad total de horas.
 Si trabaja entre 1 y 10 horas, cada hora se paga 30.000$
 Si trabaja mas de 10 cada hora se paga a 33.000$
Desarrolla un programa que muestre Nombre, total de Horas y salario Total.
*/

package EjercicioWorker;
import javax.swing.JOptionPane;

public class ejercicioWorker {

    private String name;
    private float hoursWorked;
    private float totalValue;

    public void addWorker(){
        this.name = JOptionPane.showInputDialog(null,"¿Como se llama el trabajador?");
    }

    public void calulateHours(){
        while (true){
            try{
                float hoursWorked = Float.parseFloat(JOptionPane.showInputDialog(null,"¿Cuantas horas hizo el trabajador " + name + "?"));
                this.hoursWorked = hoursWorked;
                if (hoursWorked > 0 && hoursWorked <= 10){
                    this.totalValue = hoursWorked * 30000;
                    return;
                } else if (hoursWorked > 10){
                    this.totalValue = hoursWorked * 33000;
                    return;
                } else {
                    JOptionPane.showMessageDialog(null,"El trabajador debe tener minimo 1 Hora.");
                }
            } catch (NumberFormatException e){
                JOptionPane.showMessageDialog(null,"Debes ingresar un numero valido.");
            }
        }
    }

    public String getName(){
        return name;
    }

    public float getHoursWorked(){
        return hoursWorked;
    }

    public float getTotalValue(){
        return totalValue;
    }
}
