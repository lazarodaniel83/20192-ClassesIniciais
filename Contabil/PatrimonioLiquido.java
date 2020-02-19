public class PatrimonioLiquido extends Conta{
    public PatrimonioLiquido(String id, String nome){
        super(id, nome);
    }    
    
    public void creditar(double valor){
        this.valor += valor;
    }    
    
    public void debitar(double valor){
        this.valor -= valor;        
    }    
}
