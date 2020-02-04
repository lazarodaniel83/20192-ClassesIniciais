public class ContaCorrente{
     String numero;
     double saldo;
     
     public ContaCorrente(String numero){
         this.setNumero(numero);
     }    
    
    
    private void setNumero(String numero){
        this.numero = numero;
    }    
    
    public double getSaldo(){
        return this.saldo;
    } 
    
    public void depositar(double valor){
       this.saldo += valor;
    }      

        
    public void sacar(double valor){
       if(valor <= this.saldo)
            this.saldo -= valor;
    }      
    
    
    public String toString(){
        return "N° " + this. numero + " - R$ " + this.saldo;
    }    
    
}
