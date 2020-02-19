public abstract class Conta implements Ordenavel{
    private String id;
    private String nome;
    double valor;

    public Conta(String id, String nome){
        this.setId(id);
        this.setNome(nome);
        this.valor = 0;
    }    

    private void setId(String id){
        this.id = id;
    }    
    
    private void setNome(String nome){
        this.nome = nome;
    }    
    
    public String getNome(){
        return this.nome;
    } 
    
    public String getId(){
        return this.id;
    }     

    public double getSaldo(){
        return this.valor;
    } 
    
    public abstract void creditar(double valor);
    
    public abstract void debitar(double valor);
    
    public int compare(Ordenavel outro){
      if(!(outro instanceof Conta)) return 0;
      Conta c = (Conta) outro;
      return this.getId().compareTo(c.getId());
    };    
    
    public String toString(){
        return this.getId() + "-" + this.getNome() + " " + this.getSaldo();
    }    
    
}
