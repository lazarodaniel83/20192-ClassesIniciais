public class Balanco{
    private Conta[] contas;
    
    public Balanco(){
        this.contas = new Conta[0];
    };  
    
    public Conta findByName(String nome){
        for(Conta conta : this.contas)
          if(conta.getNome().equals(nome))
            return conta;
        return null;    
    }    
    
    public void ajustar(String nomeCredito, String nomeDebito, double valor){
        this.findByName(nomeCredito).creditar(valor);
        this.findByName(nomeDebito).debitar(valor);        
    };
    
}
