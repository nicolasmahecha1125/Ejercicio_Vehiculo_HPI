public class Main {
    public static void main(String[] args){
        //creacion de vehiculos
        Automovil carroMazda = new Automovil(4,"Mazda", "TCB-118",4,"gasolina");
        Motocicleta motoHonda = new Motocicleta(2,"Honda","PCP-845","250 cc","Normal");
        //es conducible
        carroMazda.conducir();
        motoHonda.conducir();
        // creacion de propietarios y su asignacion de vehiculos
        Propietario propietario1 = new Propietario("Pedro","Gomez",carroMazda);
        Propietario propietario2 = new Propietario("Nicolas","Santos", motoHonda);
        //mostrar informacion de propietarioa y vehiculos
        propietario1.mostrarInformacion();
        propietario2.mostrarInformacion();
        

    }
}
