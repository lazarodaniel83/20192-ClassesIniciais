   public class LivroContabil{
    private Lancamento[] lancamentos;
    
    public LivroContabil(){
        this.lancamentos = new Lancamento[0];
    } 
    
    
    private void addLancamento(Lancamento novo){
        Lancamento[] aux = new Lancamento[this.lancamentos.length + 1];
        for(int iCont = 0; iCont < this.lancamentos.length; iCont++)
          aux[iCont] = this.lancamentos[iCont];
        aux[aux.length - 1] = novo;
        this.lancamentos = aux;
    }    
    
    
    public void registrarFato(String descricao, Conta credito, 
                              Conta debito, double valor){
      this.addLancamento(new Lancamento(descricao, credito, debito, valor));
    };    
    
}
