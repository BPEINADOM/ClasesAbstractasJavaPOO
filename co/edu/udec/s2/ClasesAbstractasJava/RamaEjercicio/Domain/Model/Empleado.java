package Domain.Model;

public abstract class Empleado {

    public abstract double calcularSalario();

    public void mostrarSalario() {
        System.out.println("El salario del empleado es: " + calcularSalario());
    }


}
