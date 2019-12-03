public class Porta{
    private boolean aberta;
    
    public Porta(boolean aberta){
        this.setAberta(aberta);
    }    
    
    
    private void setAberta(boolean aberta){
      this.aberta = aberta;    
    }    
    
    public void abrir(){
      this.setAberta(true);  
    };    
    
    public void fechar(){
      this.setAberta(false);
    };    
    
    
    public boolean isAberta(){
        return this.aberta;
    };
    
    public void finalize() throws Exception{
        System.out.println("Fim de Porta");
    }    
};
