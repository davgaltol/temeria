public class Caballero extends EmpleadoCorte{

    String arma;

    Caballero(String nombre, int edad, String arma, double sueldo){
        this.nombre=nombre;
        this.edad=edad;
        this.arma=arma;
        this.sueldoFijo=sueldo;
    }

    @Override
    public void trabajar() {
        System.out.println("El caballero " + nombre + " patrulla las murallas con su " + arma + ".");
    }
}
