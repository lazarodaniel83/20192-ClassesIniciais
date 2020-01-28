public class Via{
    private TipoVia tipo;
    private String nome;
    private double extensao;
    private double velocidadeMaxima;
    private double[] velocidadeMedia;
    private Via[] adjacentes;
    
    public Via(TipoVia tipo, String nome, double extensao, double velocidadeMaxima){
        this.tipo = tipo;
        this.nome = nome;
        this.extensao = extensao;
        this.velocidadeMaxima = velocidadeMaxima;
        this.velocidadeMedia = new double[24];
        for(int iCont = 0; iCont < this.velocidadeMedia.length; iCont++)
          this.velocidadeMedia[iCont] = this.velocidadeMaxima;
        this.adjacentes = new Via[0];
    }
    
    public double getVelocidadeMedia(int horario){
        return this.velocidadeMedia[horario];
    }  
    
    public void setVelocidadeMedia(int horario, double velocidade){
        this.velocidadeMedia[horario] = velocidade;
    } 
    
    public double getTempoMedioTravessia(int horario){
        return this.extensao / this.getVelocidadeMedia(horario);
    }    
    
    public boolean equals(Via via){
        return this.tipo.equals(via.tipo) && this.nome.equals(via.nome);
    }  
    
    public boolean isAdjacente(Via via){
        for(Via v : this.adjacentes)
          if(v.equals(via))
            return true;
        return false;
    };    
 
    
    
}
