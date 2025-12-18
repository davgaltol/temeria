import java.util.ArrayList;

public class GestionTemeria {
    public static void main(String[] args) {
        ArrayList<Empleado> listaEmpleados=new ArrayList<>();

        //Se recluta una cuadrilla
        listaEmpleados.add(new Caballero("Vernon Roche",25,"espada",100));
        listaEmpleados.add(new Mago("Triss Merigold",30,5,100));
        listaEmpleados.add(new Mercenario("Leo Bonhart",55,7));
        listaEmpleados.add(new Brujo("Geralt de Rivia",40,"Lobo",10));

        //Se presentan los empleados
        for(Empleado empleado:listaEmpleados) {
            System.out.println("Mi nombre es " + empleado.nombre + " y tengo " + empleado.edad + " años");
        }

        //se les ordena que trabajen
        for(Empleado empleado:listaEmpleados) {
            empleado.trabajar();
        }

        //se les calcula su salario
        for(Empleado empleado:listaEmpleados) {
            empleado.calcularSalario();
        }

        for(Empleado empleado:listaEmpleados) {
            if(empleado instanceof EmpleadoCorte) {
                ((EmpleadoCorte) empleado).solicitarVacaciones();
            }
            if(empleado instanceof EmpleadoExterno) {
                ((EmpleadoExterno) empleado).renovarContrato();
            }
        }



    }
}
