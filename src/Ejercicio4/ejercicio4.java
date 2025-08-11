// Un estudiante necesita calcular su rendimiento academico segun las siguientes calificaciones
// Fisica, Quimica, Biologia , Matematicas, Informatica
// Requisitos:
// 1- Cada materia entre 1 y 10
// 2- Porcentaje final (Suma total /50)*100
// 3- de 0 a 59.9% mala | 60 a 80% mal | Mayor que 80% es excelente

package Ejercicio4;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class ejercicio4 {
    private String name;
    private byte fisScore;
    private byte cheScore;
    private byte bioScore;
    private byte mathScore;
    private byte infScore;
    DecimalFormat decimalFormat = new DecimalFormat("#");

    public void addStudent(){
        this.name = JOptionPane.showInputDialog(null,"¿Cual es tu nombre?");
    }

    public void getScores(){
        this.fisScore = recollectScore("Fisica");
        this.cheScore = recollectScore("Quimica");
        this.bioScore = recollectScore("Biologia");
        this.mathScore = recollectScore("Matematicas");
        this.infScore = recollectScore("Informatica");
    }

    public byte recollectScore(String subject){
        while (true){
            try{
                byte score = Byte.parseByte(JOptionPane.showInputDialog(null,"¿Cuanto sacaste en " + subject + "?"));
                if (score >= 0 && score <= 10){
                    return score;
                } else {
                    JOptionPane.showMessageDialog(null,"Debes ingresar una nota entre 0 y 10");
                }
            } catch (NumberFormatException e){
                JOptionPane.showMessageDialog(null,"Debes ingresar un numero valido");
            }
        }
    }

    public void calculateScore(){
        float total = (float)( (fisScore + cheScore + bioScore + mathScore + infScore) /50)*100;
        String note = "";
        if (total >= 0 && total < 60){
            note = "Mala";
        } else if (total >= 60 && total <= 80){
            note = "Buena";
        } else {
            note = "Excelente";
        }
        JOptionPane.showMessageDialog(null,name + " tu puntaje total fue de " + decimalFormat.format(total) + " esto se considera una nota \n" + note);
    }
}
