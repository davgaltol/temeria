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
        System.out.println("El sueldo de este mes del mercenario es " + tarifa*30);
    }

    @Override
    public void trabajar() {
        System.out.println("El brujo " + nombre + " está trabajando y medita y rastrea bestias" );
    }

}