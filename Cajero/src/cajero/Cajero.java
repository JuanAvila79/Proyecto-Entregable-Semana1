/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cajero;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * @author Juan Carlos Avila Meza
 */
public class Cajero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int clave, cuenta, op, co = 0;
        double new_monto, monto;
        Scanner leer = new Scanner(System.in);
        Cuenta[] titular = Cuenta.values();

        do {
            System.out.println("\n\t\t\t\t\t\t\t\t****** Bank of Aldeamo *****");
            System.out.println("\n\t\t\t\t\t\t\t\t 1.- Colsultar su Saldo.");
            System.out.println("\n\t\t\t\t\t\t\t\t 2.- Realizar un Deposito.");
            System.out.println("\n\t\t\t\t\t\t\t\t 3.- Realizar un Retiro.");
            System.out.println("\n\t\t\t\t\t\t\t\t 4.- Salir.");
            op = leer.nextInt();
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

            switch (op) {
                case 1 -> {
                    System.out.println(">>>>>>> Consulta de Saldo <<<<<<<");
                    System.out.println("Ingrese su clave:");
                    clave = leer.nextInt();
                    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                    for (int i = 0; i < titular.length; i++) {
                        if (titular[i].getClave() == clave) {
                            JOptionPane.showMessageDialog(null, "Hola " + titular[i].getDatos() + "\nEn tu Cuenta No.: " + titular[i].getNoCuenta()
                                    + "\nTienes un saldo de :" + titular[i].getMontoCuenta(), "Consulta de Saldo..\n\n", 1);
                            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                            break;
                        } else {
                            if ((titular[i].getClave() != clave) && ((i + 1) == titular.length)) {
                                JOptionPane.showMessageDialog(null, "Verifique su clave e intente de nuevo..", "Clave invalida...", 2);
                                break;
                            }
                        }
                    }
                }
                case 2 -> {
                    System.out.println(">>>>>>>Realizando deposito en Cuenta.<<<<<<<");
                    System.out.println("Ingrse el numero de cuenta : ");
                    cuenta = leer.nextInt();
                    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                    for (int i = 0; i < titular.length; i++) {
                        if (titular[i].getNoCuenta() == cuenta) {
                            System.out.println("Ingrese el monto a depositar :");
                            monto = leer.nextDouble();
                            if (monto > 0) {
                                new_monto = (titular[i].getMontoCuenta() + monto);
                                titular[i].setMontoCuenta(new_monto);
                                JOptionPane.showMessageDialog(null, "\n**** Bank of Aldeamo **** " + "\nConfirmacion de Deposito en la cuenta :" + titular[i].getNoCuenta()
                                        + "\nPor un monto de :" + monto
                                        + "\nTu nuevo Saldo es :" + titular[i].getMontoCuenta(), "Confimacion del deposito..", 1);
                            } else {
                                JOptionPane.showMessageDialog(null, " >>>>>> No se realiza ninguna Operacion <<<<<< ", "Información..", 2);
                                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                            }

                        } else {
                            if ((titular[i].getNoCuenta() != cuenta) && ((i + 1) == titular.length)) {
                                JOptionPane.showMessageDialog(null, "El No. de Cuenta no existe, Verifique e intente de nuevo..", "Cuenta no Existe...", 2);
                                break;
                            }
                        }
                    }
                }
                case 3 -> {
                    System.out.println(">>>>>>>Realizando Retiro en Cuenta.<<<<<<<");
                    System.out.println("Ingrse el numero de cuenta : ");
                    cuenta = leer.nextInt();
                    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                    for (int i = 0; i < titular.length; i++) {
                        if (titular[i].getNoCuenta() == cuenta) {
                            System.out.println("Ingrese el monto a Retirar :");
                            monto = leer.nextDouble();
                            if ((monto > 0) && (monto <= titular[i].getMontoCuenta())) {
                                new_monto = (titular[i].getMontoCuenta() - monto);
                                titular[i].setMontoCuenta(new_monto);
                                JOptionPane.showMessageDialog(null, "\n**** Bank of Aldeamo **** " + "\nConfirmación de Retiro en la cuenta :" + titular[i].getNoCuenta()
                                        + "\nPor un monto de :" + monto
                                        + "\nTu nuevo Saldo es :" + titular[i].getMontoCuenta(), "Confimacion del deposito..", 1);
                            } else {
                                JOptionPane.showMessageDialog(null, "Monto errado o saldo isuficiente..", "Cuenta no Existe...", 2);
                            }

                        } else {
                            if ((titular[i].getNoCuenta() != cuenta) && ((i + 1) == titular.length)) {
                                JOptionPane.showMessageDialog(null, "El No. de Cuenta no existe, Verifique e intente de nuevo..", "Cuenta no Existe...", 2);
                                break;
                            }
                        }
                    }
                }
                case 4 -> {
                    System.out.println("Saliendo del programa");
                    co = op;
                }
                default ->
                    System.out.println("Seleccione una opción valida del menú.");
            }
        } while (co != 4);

    }

}
