public class PatrimonioLiquido extends Conta{
    public PatrimonioLiquido(String nome){
        super(nome);
    }    
    
    public void creditar(double valor){
        this.valor += valor;
    }    
    
    public void debitar(double valor){
        this.valor -= valor;        
    }    
}
