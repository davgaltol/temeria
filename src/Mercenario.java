import java.util.Scanner;

public class Mercenario extends EmpleadoExterno{

    Mercenario(String nombre, int edad, double tarifa){
        this.nombre=nombre;
        this.edad=edad;
        this.tarifa=tarifa;
    }

    @Override
    public void calcularSalario() {
        Scanner sc=new Scanner(System.in);
        int dias=0;
        System.out.println("¿Cuantos días ha trabajado en este encargo?");
        dias=sc.nextInt();
        System.out.println("El sueldo de este mes del mercenario es " + tarifa*dias);
    }

    @Override
    public void trabajar() {
        System.out.println("El mercenario " + nombre + " está trabajando y ha aceptado encargo de escolta " );
    }

}
