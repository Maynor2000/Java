package excepciones;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author irvin
 */
public class excrpciones2 {
    
    public static void main(String[] args) {
        
        int figura = 0;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Elije una opcion:\n1. Cuadrado\n2. Rectangulo\n3. "
                + "Tri�ngulo\n4. C�rculo");
        figura = entrada.nextInt();
        
        entrada.close(); //Cierra la conexion de la consola
        
        switch(figura){
            
            case 1: 
                
                int lado = Integer.parseInt(JOptionPane.showInputDialog("In"
                        + "troduce el lado:"));
                System.out.println(Math.pow(lado, 2));
                
                break;
                
            case 2:
                
                int base = Integer.parseInt(JOptionPane.showInputDialog("In"
                        + "troduce la base:"));
                int altura = Integer.parseInt(JOptionPane.showInputDialog("In"
                        + "troduce la altura: "));
                
                System.out.println("El �rea del rect�ngulo es: " + base*altura);
                
                break;
                
            case 3:
                
                base = Integer.parseInt(JOptionPane.showInputDialog("In"
                        + "troduce la base:"));
                altura = Integer.parseInt(JOptionPane.showInputDialog("In"
                        + "troduce la altura: "));
                
                System.out.println("El �rea del tri�ngulo es: " + 
                        (base*altura)/2);
                
                break;
                
            case 4:
                
                int radio = Integer.parseInt(JOptionPane.showInputDialog("In"
                        + "troduce el radio: "));
                System.out.println("El �rea del c�rculo es: ");
                System.out.println(Math.PI*(Math.pow(radio, 2)));
                
                break;
                
            default:
                System.out.println("La opci�n no es correcta.");
        }
 //-----------------------------------------------------------------------------
 
        int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce "
                + "tu altura en cm: "));
        
        System.out.printf("Si eres hombre tu peso ideal es: %d kg.", altura-110);
        System.out.printf("Si eres mujer tu peso ideal es: %d kg.", altura-120);
        
              
    }
    
}