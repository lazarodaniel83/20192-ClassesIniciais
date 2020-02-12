public class RegistroContabil{
    private String nomeEmpresa;
    private String cnpjEmpresa;
    private Balanco balanco;
    private LivroContabil livro;    
    
    public RegistroContabil(String nomeEmpresa, String cnpjEmpresa){
        this.setNomeEmpresa(nomeEmpresa);
        this.setCNPJEmpresa(cnpjEmpresa);
        this.balanco = new Balanco();
        this.livro = new LivroContabil();        
    }    
    
    private void setNomeEmpresa(String nomeEmpresa){
        this.nomeEmpresa = nomeEmpresa;
    }    
    
    private void setCNPJEmpresa(String cnpjEmpresa){
        this.cnpjEmpresa = cnpjEmpresa;
    } 
    
    public void registrarFato(String descricao, String nomeCredito, 
                              String nomeDebito, double valor){
      this.livro.registrarFato(descricao, this.balanco.findByName(nomeCredito), 
                               this.balanco.findByName(nomeDebito), valor);
      this.balanco.ajustar(nomeCredito, nomeDebito, valor);
    };                              
    
    
    
}
