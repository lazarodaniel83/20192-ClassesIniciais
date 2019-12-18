public class Palavra{
    private String conteudo;
    private Palavra[]  similares;
    
    public Palavra(String conteudo){
        this.setConteudo(conteudo);
        this.similares = new Palavra[0];
    }  
    
    public Palavra(String conteudo, Palavra palavra){
        this(conteudo);
        this.similares = new Palavra[palavra.similares.length + 1];
        for(int i = 0; i < palavra.similares.length; i++)
            this.similares[i] = palavra.similares[i];
        this.similares[this.similares.length - 1] = palavra;    
    }  
    
    private void setConteudo(String conteudo){
        this.conteudo = conteudo;
    } 
    
    public String getConteudo(){
        return this.conteudo;
    }  
    
    public boolean equals(Palavra palavra){
        return this.getConteudo().equals(palavra.getConteudo());
    } 
    
    public boolean isSimilar(Palavra palavra){
        for(Palavra p : this.similares)
          if(p.equals(palavra))
            return true;
        return false;    
    } 
    
    public double getSimilaridade(Palavra palavra){
        double similaridade = 0;
        int similaresComuns = 0;
        if(this.equals(palavra)) return 1;
        if(palavra.isSimilar(this)) similaridade += 0.5;
        for(Palavra similar : this.similares) 
          if(palavra.isSimilar(similar))
            similaresComuns++;
        similaridade += (similaresComuns / (2.0 * this.similares.length));    
        return similaridade;
    }    
    
}
