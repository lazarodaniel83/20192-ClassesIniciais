public class Ativo extends Conta{
    public Ativo(String nome){
        super(nome);
    }    
    
    public void creditar(double valor){
        this.valor -= valor;
    }    
    
    public void debitar(double valor){
        this.valor += valor;        
    }      
}
