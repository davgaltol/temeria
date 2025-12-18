import java.util.Scanner;

public class Mago extends EmpleadoCorte{
    int nivel=0;


    Mago(String nombre, int edad, int nivel, double sueldo){
        this.nombre=nombre;
        this.edad=edad;
        this.nivel=nivel;
        this.sueldoFijo=sueldo;
    }

    @Override
    public void solicitarVacaciones() {

        System.out.println("El mago " + nombre + " ha solicitado vacaciones.");
    }
    @Override
    public void calcularSalario() {

        System.out.println("El sueldo es " + (sueldoFijo));
    }
    @Override
    public void trabajar() {
        System.out.println("El mago " + nombre + " está trabajando y conjura hechizos ");
    }

}
