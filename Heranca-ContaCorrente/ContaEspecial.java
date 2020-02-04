public class ContaEspecial extends ContaCorrente{
    private double limite;
    
    
    public ContaEspecial(String numero, double limite){
        super(numero);
        this.setLimite(limite); 
    }    
    
    public void setLimite(double limite){
        this.limite = limite;
    }   
    
    public void sacar(double valor){
       if(valor <= this.saldo + this.limite)
            this.saldo -= valor;
    }   
    
    public String toString(){
        return super.toString() + " Limite: R$ " + this.limite;
    }    
}   
