package Domain.Model;

public class Vendedor extends Empleado {
    private double salarioBase;
    private double comisionVenta;
    private int ventas;

    // Constructor
    public Vendedor(double salarioBase, double comisionVenta, int ventas) {
        this.salarioBase = salarioBase;
        this.comisionVenta = comisionVenta;
        this.ventas = ventas;
    }

    // Implementacion
    @Override
    public double calcularSalario() {
        return salarioBase + (comisionVenta * ventas);
    }
}
