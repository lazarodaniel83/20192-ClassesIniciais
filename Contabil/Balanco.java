public class Balanco{
    private Conta[] contas;
    
    public Balanco(){
        this.contas = new Conta[0];
        this.asm();
    }; 
    
    private void addConta(Conta novo){
        Conta[] aux = new Conta[this.contas.length + 1];
        for(int iCont = 0; iCont < this.contas.length; iCont++)
          aux[iCont] = this.contas[iCont];
        aux[aux.length - 1] = novo;
        this.contas = aux;
    }     
    
    private void asm(){
        this.addConta(new Ativo("CAIXA"));
        this.addConta(new Ativo("IMOVEIS"));
        this.addConta(new Ativo("VEICULOS")); 
        this.addConta(new Passivo("EMPRESTIMO"));   
        this.addConta(new PatrimonioLiquido("CAPITAL SOCIAL"));         
        
    }    
    
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
    
    public String toString(){
        String str = "";
        for(Conta c : this.contas)
            str += (c + "\n");
        return str;    
    }    
    
}
