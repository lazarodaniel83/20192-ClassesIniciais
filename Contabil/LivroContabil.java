   public class LivroContabil{
       
    private int index;   
    private Lancamento[] lancamentos;
    
    public LivroContabil(){
        this.lancamentos = new Lancamento[0];
        this.index = 1;
    } 
    
    
    private void addLancamento(Lancamento novo){
        Lancamento[] aux = new Lancamento[this.lancamentos.length + 1];
        for(int iCont = 0; iCont < this.lancamentos.length; iCont++)
          aux[iCont] = this.lancamentos[iCont];
        aux[aux.length - 1] = novo;
        this.lancamentos = aux;
    }    
    
    
    public void registrarFato(int indice, String descricao, Conta credito, 
                              Conta debito, double valor){
      this.addLancamento(new Lancamento(indice, descricao, credito, debito, valor));
    }; 
    
    public String toString(){
        String str = "";
        Ordenador ordenador = new Ordenador();
        ordenador.ordenar(this.lancamentos);        
        for(Lancamento l : this.lancamentos)
            str += (l + "\n\n");
        return str;    
    }    
    
}
