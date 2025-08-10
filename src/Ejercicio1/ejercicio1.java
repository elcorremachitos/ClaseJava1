// EJERCICIO 1 - Explicacion:
// Una empresa paga el salario segun las horas trabajadas por semana.
// El monto por hora depende de la cantidad total de horas.
// Si trabaja entre 1 y 10 horas, cada hora se paga 30.000$
// Si trabaja mas de 10 cada hora se paga a 33.000$
// EJERCICIO 1 - Problema:
// Desarrolla un programa que muestre Nombre, total de Horas y salario Total.

package Ejercicio1;
import javax.swing.JOptionPane;

public class ejercicio1 {

    private short hoursWorked;
    private String name;

    public void addWorker(){
        this.name = JOptionPane.showInputDialog(null,"¿Como se llama el trabajador?");
    }

    public int calulateHours(){
        int hoursValue = 0;
        short hoursWorked = Short.parseShort(JOptionPane.showInputDialog(null,"¿Cuantas horas trabajo el trabajador " + name + "?"));
        this.hoursWorked = hoursWorked;
        if (hoursWorked > 0 && hoursWorked <= 10){
            hoursValue = 30000;
        } else if (hoursWorked > 10){
            hoursValue = 33000;
        } else {
            System.out.println("DEBES TRABAJAR MINIMO 1 HORA");
        }
        return hoursWorked * hoursValue;
    }

    public String getName(){
        return name;
    }

    public short getHoursWorked(){
        return hoursWorked;
    }
}
