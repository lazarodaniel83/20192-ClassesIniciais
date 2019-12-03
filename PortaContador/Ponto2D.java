public class Ponto2D{

    private double abscissa;
    private double ordenada;

    public Ponto2D(){
        this(0.0, 0.0);
    }    
    
    public Ponto2D(double abscissa, double ordenada){
        this.setAbscissa(abscissa);
        this.setOrdenada(ordenada);
    }
    
    private void setAbscissa(double abscissa){
        this.abscissa = abscissa;
    }    
    
    private void setOrdenada(double ordenada){
        this.ordenada = ordenada;
    }    
    
    private double getAbscissa(){
        return this.abscissa;
    }    
    
    private double getOrdenada(){
        return this.ordenada;
    }   
    
//    public String toString(){
//        return "(" + this.getAbscissa() + ";" + this.getOrdenada() + ")";
//    }    

    public String toString(){
        return  Double.toString(this.getAbscissa());
    }    


}
