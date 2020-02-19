public class Lancamento implements Ordenavel{
    private int indice;
    private String descricao;
    private double valor;
    private Conta debito;
    private Conta credito; 
    
    public Lancamento(int indice, String descricao, Conta credito, Conta debito, double valor){
        this.setIndice(indice);
        this.setDescricao(descricao);
        this.setCredito(credito);
        this.setDebito(debito);        
        this.setValor(valor);
    }; 

    private void setIndice(int indice){
        this.indice = indice;
    };
    
    
    private void setCredito(Conta credito){
        this.credito = credito;
    };
    
    private void setDebito(Conta debito){
        this.debito = debito;
    }    
    
    
    private void setDescricao(String descricao){
        this.descricao = descricao;
    }    
    
    private void setValor(double valor){
        this.valor = valor;
    }   
    
    public String toString(){
        String str = this.descricao + "\n";
        str += ("[C]" + this.credito.getNome() + "\n"); 
        str += ("[D]" + this.debito.getNome() + "\n");        
        return str + this.valor;
    } 
    
    public int compare(Ordenavel outro){
      if(!(outro instanceof Lancamento)) return 0;
      Lancamento l = (Lancamento) outro;
      return this.indice - l.indice;
    };    

    
        
    
}

