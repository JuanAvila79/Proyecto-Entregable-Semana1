/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cajero;

/**
 *
 * @author noc-02
 */
public enum Cuenta {
    LUZ_LOPEZ(1325, 102003945, 1000000),
    ARNOLD_ULLOA(2346, 102003456, 100000),
    CAMILO_ACOSTA(2033, 105003238, 45000),
    ALEX_HERNANDEZ(3340, 1032005548, 5000000),
    JUAN_AVILA(2560, 109000999, 5000000);
    private int NoCuenta;
    private int clave;
    private double MontoCuenta;

    private Cuenta(int clave, int NoCuenta, double MontoCuenta) {
        this.NoCuenta = NoCuenta;
        this.clave = clave;
        this.MontoCuenta = MontoCuenta;
    }

    public int getNoCuenta() {
        return NoCuenta;
    }

    public int getClave() {
        return clave;
    }

    public double getMontoCuenta() {
        return MontoCuenta;
    }

    public void setMontoCuenta(double MontoCuenta) {
        this.MontoCuenta = MontoCuenta;
    }

    public String getDatos() {
        return this.name().toUpperCase();
    }
}
