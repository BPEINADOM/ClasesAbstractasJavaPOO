import Domain.Model.Gerente;
import Domain.Model.Vendedor;
import Domain.Model.Empleado;

public class CalculadoraSalario {

    public static void main(String[] args) {

        System.out.println("*****************7502410037******************");
        System.out.println("********BILLY JEAN YER PEINADO MADERA********");
        System.out.println("*********************************************");

        // Instancias
        Empleado gerente = new Gerente(3500000.0, 450000.0);
        Empleado vendedor = new Vendedor(1500000.0, 0.05, 2000);

        // Mostrar el salario de los empleados
        System.out.println("- Gerente:");
        gerente.mostrarSalario();
        System.out.println("- Vendedor:");
        vendedor.mostrarSalario();

        System.out.println("*********************************************");

    }
}
