public class Passivo extends Conta{
    public Passivo(String id, String nome){
        super(id, nome);
    }   
    
    public void creditar(double valor){
        this.valor += valor;
    }    
    
    public void debitar(double valor){
        this.valor -= valor;        
    }      
    
}
