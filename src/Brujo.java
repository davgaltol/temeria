import java.util.Scanner;

public class Brujo extends EmpleadoExterno{
    String escuela;

    Brujo(String nombre, int edad, String escuela, double tarifa){
        this.nombre=nombre;
        this.edad=edad;
        this.escuela=escuela;
        this.tarifa=tarifa;
    }

    @Override
    public void calcularSalario() {
        Scanner sc = new Scanner(System.in);
        int monstruos=0;
        System.out.println("¿" + nombre + ", cuantos monstruos has rastreado?");
        monstruos=sc.nextInt();
        System.out.println("El sueldo de este mes del brujo es " + tarifa*monstruos + " oros");
    }

    @Override
    public void trabajar() {
        System.out.println("El brujo " + nombre + " medita y rastrea bestias" );
    }


}