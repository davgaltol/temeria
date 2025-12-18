import java.util.Scanner;

public class Caballero extends EmpleadoCorte{

    Caballero(String nombre, double sueldo){
        this.nombre=nombre;
        this.sueldoFijo=sueldo;
    }

    @Override
    public void solicitarVacaciones() {
        System.out.println("El caballero " + nombre + " ha solicitado vacaciones.");
    }
    @Override
    public void calcularSalario() {
        Scanner sc= new Scanner(System.in);
        int diasTrabajados=0;
        System.out.println("Dias trabajados");
        diasTrabajados=sc.nextInt();
        System.out.println("El sueldo es " + (diasTrabajados*sueldoFijo));
    }
    @Override
    public void trabajar() {
        System.out.println("El caballero " + nombre + " está trabajando.");
    }
}
