public class Playlist{
    private String nome;
    private Musica[] musicas;
    
    public Playlist(String nome){
        this.setNome(nome);
        this.musicas = new Musica[0];
    }
    
    
    public void addMusica(Musica musica){
        Musica[] aux = new Musica[this.musicas.length + 1];
        for(int i = 0; i < this.musicas.length; i++)
          aux[i] = this.musicas[i];
        aux[aux.length - 1] = musica;
        this.musicas = aux;
    }    
    
    
    private void setNome(String nome){
        this.nome = nome;
    }    
    
    public Musica[] getMusicas(){
        return this.musicas;
    };    
    
    public long getDuracao(){
        long duracao = 0;
        for(Musica musica : this.musicas)
          duracao += musica.getDuracao();
        return duracao;  
    } 
    
    public double getProximidade(Musica musica){
        double proximidade = 0;
        for(Musica m : this.musicas)
          if(m.getProximidade(musica) > proximidade)
            proximidade = m.getProximidade(musica);
        return proximidade;    
    }
    
    public boolean pertence(Musica musica){
        for(Musica m : this.musicas)
          if(m.equals(musica))
            return true;
        return false;    
    };
    
}
