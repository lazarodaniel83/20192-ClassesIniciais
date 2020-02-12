public class Conta{
    private String nome;
    double valor;

    public Conta(String nome){
        this.setNome(nome);
        this.valor = 0;
    }    
    
    private void setNome(String nome){
        this.nome = nome;
    }    
    
    public String getNome(){
        return this.nome;
    } 
    
    public void creditar(double valor){
        
    }    
    
    public void debitar(double valor){
        
    }    
    
}
