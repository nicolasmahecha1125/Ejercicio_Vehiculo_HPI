public class Vehiculo {
    private int Rueda;
    private String Marca;
    private String Modelo;

    public Vehiculo(int Rueda,String Marca,String Modelo){
        this.Rueda = Rueda;
        this.Marca = Marca;
        this.Modelo = Modelo;
    }


    public void obtenerInformacion(){
        System.out.println("Marca:"+Marca);
        System.out.println("Modelo:"+Modelo);
        System.out.println("Numero Ruedas:"+Rueda);
    }

    public int getRueda() {
        return Rueda;
    }

    public String getMarca() {
        return Marca;
    }

    public String getModelo() {
        return Modelo;
    }

}
