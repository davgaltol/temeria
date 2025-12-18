public abstract class EmpleadoCorte extends Empleado {

    protected double sueldoFijo=0;

    public void solicitarVacaciones(){
        System.out.println("El empleado " + nombre + " ha solicitado vacaciones.");
    };

    @Override
    public void calcularSalario() {
        System.out.println("El sueldo es " + (sueldoFijo));
    }

    public void setSueldoFijo(double sueldoFijo){
        this.sueldoFijo=sueldoFijo;
    }
}
