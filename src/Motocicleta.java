public class Motocicleta extends Vehiculo implements Conducible{
    private String Cilindrada;
    private  String tipoManejo;
    public Motocicleta(int Rueda,String Marca,String Modelo,String Cilindada,String tipoManejo){
        super(Rueda,Marca,Modelo);
        this.Cilindrada = Cilindada;
        this.tipoManejo = tipoManejo;
    }

    @Override
    public  void obtenerInformacion(){
        super.obtenerInformacion();
        System.out.println("numero de puertas: " +Cilindrada);
        System.out.println("ntipo de combustible: " +tipoManejo);
    }
    @Override
    public void conducir() {
        System.out.println("este Motocicleta es condusible");
    }
}
