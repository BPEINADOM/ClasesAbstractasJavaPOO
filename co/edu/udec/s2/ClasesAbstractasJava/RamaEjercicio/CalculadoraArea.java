import Domain.Model.Circulo;
import Domain.Model.Figura;
import Domain.Model.Rectangulo;

public class CalculadoraArea {

    public static void main(String[] args) {

        System.out.println("*****************7502410037******************");
        System.out.println("********BILLY JEAN YER PEINADO MADERA********");
        System.out.println("*********************************************");

        // Instancias de las figuras
        Figura circulo = new Circulo(9);
        Figura rectangulo = new Rectangulo(10, 14);

        // Mostrar el area de las figuras
        System.out.println("- Circulo:");
        circulo.mostrarArea();
        System.out.println("- Rectangulo:");
        rectangulo.mostrarArea();

        System.out.println("*********************************************");
    }
}
