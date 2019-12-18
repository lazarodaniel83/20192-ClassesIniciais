public class Texto{
    
    private Palavra palavras[];

    public double getSimilaridade(Texto texto){
        double similaridade = 0;
        for(Palavra p : this.palavras)
            similaridade += texto.getSimilaridade(p);
        return similaridade / this.palavras.length;   
    }    
    
    
    private double getSimilaridade(Palavra palavra){
        double similaridade = 0;
        for(Palavra p : this.palavras)
          if(similaridade < p.getSimilaridade(palavra))
            similaridade = p.getSimilaridade(palavra);
        return similaridade;    
    }    
    
    
    
}
