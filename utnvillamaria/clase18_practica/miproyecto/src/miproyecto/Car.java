package miproyecto;


public class Car {
    //el atributo PUBLIC va a ser accedido por todos y no se cumple con el ENCAPSULAMIENTO
    //el atributo PRIVATE va a ser accedido por las clases heredadas
    private Integer velocidadMaxKm;
    private String modelo;
    private String color;
    
    //VOID me indica que no se retorna nada
    public void mostrarColor() {
        System.out.println("Mi color es: " + color);
    }
    
    //Yo interpreto que la velocidad maxima es en kilometros
    //quiero hacer un metodo que devuelva la Velocidad maxima pero en millas
    public double getVelocidadMaxMillas(){  //1km = 0,6213millas
        //Multiplicar la velocidad maxima en km por el factor de conversion a millas
        //variable INTERNA (LOCAL) del método, fuera del método no existe
        Double VelocidadMaxMillas;
        VelocidadMaxMillas= velocidadMaxKm * 0.6213;
        return VelocidadMaxMillas;
    }
    
    //SETTER para la velocidad maxima
    public void setVelocidadMaxKm(Integer velocidadMaxKm){ 
    //el nombre del parametro es igual al nombre de la varaible que quiero modificar
        //this me indica que se lo asigne a al variable que es atributo
        //de la clase Car ya que la variable de mi parametro tiene el mismo nombre
        
        //Si no quiero que la velocidad máxima supere los 400 km/h
        if(velocidadMaxKm > 400){
            System.out.println("Eso seguramente no es un auto.");
        } else {
            this.velocidadMaxKm = velocidadMaxKm;
        }    
    }
    
    //SETTER para el color
    public void setColor(String color){
        if("amarillo".equals(color)){
            System.out.println("No contamos con el color amarillo en este modelo"+
                    " por lo tanto se asignara el color blanco");
            this.color = "blanco";
        } else {
            this.color = color;
        }
    }
    
    //SOBRECARGA del método setColor
    public void setColor(String color1, String color2){
        this.color = color1 + " " + color2;
    }
    
    //GETTER de la velocidad maxima
    public Integer getVelocidadMaxKm(){
        return velocidadMaxKm;
    }
    
    //GETTER del color
    public String getColor(){
        return color;
    }
    
}
