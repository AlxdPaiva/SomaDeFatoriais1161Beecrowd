/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package somadefatoriais1161beecrowd;
import java.util.Scanner;

/**
 *
 * @author alxdr
 */
public class SomaDeFatoriais1161Beecrowd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner teclado = new Scanner(System.in);
        
        while (teclado.hasNextLong()) {
        
        long M = teclado.nextLong();
        long N = teclado.nextLong();
        long soma = 0;
        long fatM = 1;
        long fatN = 1;
        
        
        for (int cont = 1; cont <= M; cont++) {
            fatM = fatM *= cont;
        }
        
        for (int i = 1; i <= N; i++) {
            fatN = fatN *= i;
        }
        
        System.out.println(soma  = fatM + fatN);
        }
    }
    
}
