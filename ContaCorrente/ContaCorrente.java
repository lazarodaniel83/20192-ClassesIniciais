public class ContaCorrente{
    private String numero;
    private double saldo;
    
    public void depositar(double valor){
        this.saldo+=valor;
    } 
    
    public void sacar(double valor){
        if(valor <= this.saldo)
            this.saldo-=valor;
    }    
    
    public double getSaldo(){
        return this.saldo;
    }    
    
}
