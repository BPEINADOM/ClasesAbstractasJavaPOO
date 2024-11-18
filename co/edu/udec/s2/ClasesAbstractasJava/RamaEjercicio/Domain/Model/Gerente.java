package Domain.Model;

public class Gerente extends Empleado {
    private double salarioFijo;
    private double bono;

    // Constructor
    public Gerente(double salarioFijo, double bono) {
        this.salarioFijo = salarioFijo;
        this.bono = bono;
    }

    // Implementacion
    @Override
    public double calcularSalario() {
        return salarioFijo + bono;
    }

}
