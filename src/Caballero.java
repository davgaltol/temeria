import java.util.Scanner;

public class Caballero extends EmpleadoCorte{

    String arma;

    Caballero(String nombre, int edad, String arma, double sueldo){
        this.nombre=nombre;
        this.edad=edad;
        this.arma=arma;
        this.sueldoFijo=sueldo;
    }

    @Override
    public void solicitarVacaciones() {

        System.out.println("El caballero " + nombre + " ha solicitado vacaciones.");
    }
    @Override
    public void calcularSalario() {

        System.out.println("El sueldo es " + (sueldoFijo));
    }
    @Override
    public void trabajar() {
        System.out.println("El caballero " + nombre + " está trabajando y patrulla las murallas.");
    }
}
