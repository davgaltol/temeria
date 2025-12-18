import java.util.Scanner;

public abstract class EmpleadoExterno extends Empleado {
    protected double tarifa;


    public void renovarContrato(){
        Scanner sc=new Scanner(System.in);
        String respuesta;
        System.out.println("Deseas renovar el contrato, " + nombre + "?(si/no)");
        respuesta=sc.nextLine();
        if(respuesta.equals("si")) {
            System.out.println("El empleado " + nombre + " renueva su contrato.");
        }
        else {
            if(respuesta.equals("no")){
                System.out.println("El empleado " + nombre + " no renueva su contrato.");
            }
            else{
                System.out.println("Respuesta incorrecta");
            }
        }
    }
}
