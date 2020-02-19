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
        this.addConta(new Passivo("2.0","EMPRESTIMO"));   
        this.addConta(new Ativo("1.0", "CAIXA"));
        this.addConta(new Ativo("1.1","IMOVEIS"));
        this.addConta(new PatrimonioLiquido("3.0","CAPITAL SOCIAL"));         
        this.addConta(new Ativo("1.2","VEICULOS")); 
        
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
        Ordenador ordenador = new Ordenador();
        ordenador.ordenar(this.contas);
        for(Conta c : this.contas)
            str += (c + "\n");
        return str;    
    }    
    
}
