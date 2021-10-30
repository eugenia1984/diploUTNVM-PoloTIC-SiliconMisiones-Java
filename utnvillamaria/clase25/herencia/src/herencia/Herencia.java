package herencia;


public class Herencia {


    public static void main(String[] args) {
        Auto miAuto = new Auto();
        Motocicleta miMotocicleta = new Motocicleta();
        
        //Por herencia la clase Auto tiene el método acelerar() que hereda de la superclase(Vehiculo)
        //pero con el @Override lo sobreescribir y me muestra otra clso
        miAuto.acelerar();
        //puedo setear el atributo matricula que tambien hereda de la super clase
        miAuto.setMatricula("AA123BB");
        //tambien puedo setear la matricula de mi motocicleta
        miMotocicleta.setMatricula("AC587AB");
        //lo muestro por pantalla
        System.out.println("La matricula de miAuto es: "+miAuto.getMatricula());
        System.out.println("La matricula de miMotocicleta es: "+miMotocicleta.getMatricula());
    }
    
}
