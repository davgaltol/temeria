import java.util.Scanner;

public abstract class EmpleadoCorte extends Empleado {

    protected double sueldoFijo=0;

    public void solicitarVacaciones(){
        Scanner sc=new Scanner(System.in);
        String respuesta;
        System.out.println("Deseas solicitar vacaciones, " + nombre + "?(si/no)");
        respuesta=sc.nextLine();
        if(respuesta.equals("si")) {
            System.out.println("El empleado " + nombre + " ha solicitado vacaciones.");
        }
        else {
            if(respuesta.equals("no")){
            System.out.println("El empleado " + nombre + " no ha solicitado vacaciones.");
            }
            else{
                System.out.println("Respuesta incorrecta");
            }
        }
    }

    @Override
    public void calcularSalario() {
        System.out.println("El sueldo es " + (sueldoFijo) + " oros.");
    }

    public void setSueldoFijo(double sueldoFijo){
        this.sueldoFijo=sueldoFijo;
    }
}
