public class Propietario {
    private  String nombre;
    private  String apellido;
    public Vehiculo vehiculo;
    public Propietario(String nombre,String apellido,Vehiculo vehiculo){
        this.nombre = nombre;
        this.apellido = apellido;
        this.vehiculo = vehiculo;
    }
    public  void mostrarInformacion(){
        System.out.println("informacio del propietario:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: "+ apellido);
        vehiculo.obtenerInformacion();
        System.out.println();
    }

}
