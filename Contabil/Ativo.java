public class Ativo extends Conta{
    public Ativo(String id, String nome){
        super(id, nome);
    }    
    
    public void creditar(double valor){
        this.valor -= valor;
    }    
    
    public void debitar(double valor){
        this.valor += valor;        
    }      
}
