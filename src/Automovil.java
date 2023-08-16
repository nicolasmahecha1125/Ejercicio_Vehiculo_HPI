public class Automovil extends Vehiculo implements Conducible{
    private int numeroPuertas;
    private String tipoCombustible;
    public Automovil(int Rueda,String Marca,String Modelo,int numeroPuertas, String tipoCombustible){
        super(Rueda,Marca,Modelo);
        this.numeroPuertas = numeroPuertas;
        this.tipoCombustible = tipoCombustible;
    }

    @Override
    public  void obtenerInformacion(){
        super.obtenerInformacion();
        System.out.println("numero de puertas: " +numeroPuertas);
        System.out.println("tipo de combustible: " +tipoCombustible);
    }
    @Override
    public void conducir() {
        System.out.println("este Automovil es condusible");
    }
}

