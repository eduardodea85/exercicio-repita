/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciorepita;
import javax.swing.JOptionPane;
/**
 *
 * @author eduar
 */
public class ExercicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //JOptionPane.showMessageDialog(null, "Olá Mundo", "Boas Vindas", JOptionPane.INFORMATION_MESSAGE);
        
        int n, s = 0, t = 0;
        int p = 0, i = 0, c = 0;
        float m = 0;
        do{
          n = Integer.parseInt(JOptionPane.showInputDialog(null, "<html>Informe um número: <br><em>(valor 0 interrompe)</em></html>"));
          //JOptionPane.showMessageDialog(null, "Você digitou o valor: " + n);
          //t += 1;
          t++;
          s += n;
          if (n % 2 == 0){
              //p += 1;
              p++;
          }else if (n % 2 == 1){
              //i += 1;
              i++;
          }
          if (n >= 100){
              //c += 1;
              c++;
          }
          
          m = (n+s)/2;
          
          } while (n != 0);
          
               
        JOptionPane.showMessageDialog(null, "<html>Resultado final <hr>" + "<br>Total de valores: " + t +"<br>Somatório vale " + s + "<br>Total de pares " + p + "<br>Total de impares " + i + "<br>Acima de 100: " + c + "<br>Média dos valores: " + m);
        
        //JOptionPane.showMessageDialog(null, "Você digitou o valor" + n);
    }
    
    
}
