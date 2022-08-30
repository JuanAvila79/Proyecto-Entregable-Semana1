/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operacionnumeros;

import javax.swing.JOptionPane;

/**
 *
 * @author noc-02
 */
public class OperacionNumeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1 = 9;
        int num2 = 5;
        String opc = null;

        do {
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
            System.out.println(" ****** Menu ****** \n");
            System.out.println(" ****** 1.- Suma ****** \n");
            System.out.println(" ****** 2.- Resta ****** \n");
            System.out.println(" ****** 3.- Multiplicación ****** \n");
            System.out.println(" ****** 4.- División ****** \n");
            System.out.println(" ****** 5.- Salir. ****** \n");
            opc = JOptionPane.showInputDialog("Ingrese una Opción : ");

            switch (opc) {
                case "1":
                    JOptionPane.showMessageDialog(null, "La Operación de sumar los numeros 9 y 5 es : " + (num1 + num2));
                    break;
                case "2":
                    JOptionPane.showMessageDialog(null, "La Operación de Restar los numeros 9 y 5 es :" + (num1 - num2));
                    break;
                case "3":
                    JOptionPane.showMessageDialog(null, "La Operación de Multiplicar los numeros 9 y 5 es : " + (num1 * num2));
                    break;
                case "4":
                    JOptionPane.showMessageDialog(null, "La Operación de Multiplicar los numeros 9 y 5 es : " + (num1 / num2));
                    break;
                case "5":
                    JOptionPane.showMessageDialog(null, "Aplicación Finalizada. ");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Ingrese una opción valida", "Información..", 1);
            }

        } while (!opc.equals("5"));
    }

}
