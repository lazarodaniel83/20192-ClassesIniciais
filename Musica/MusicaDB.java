public class MusicaDB{
    private Musica[] musicas;
    
    public MusicaDB(){
        this.musicas = new Musica[0];
    }    
    
    public void addMusica(Musica musica){
        Musica[] aux = new Musica[this.musicas.length + 1];
        for(int i = 0; i < this.musicas.length; i++)
          aux[i] = this.musicas[i];
        aux[aux.length - 1] = musica;
        this.musicas = aux;
    } 
    
    public Playlist criarSimilar(String nome, long duracao, Playlist base){
        Playlist similar = new Playlist(nome);
        int iCont = 0;
        this.ordenar(base);
        while(similar.getDuracao() < duracao && iCont < this.musicas.length){
            if(!base.pertence(this.musicas[iCont]))
              base.addMusica(this.musicas[iCont]);
            iCont++;  
        }    
        return similar;
    }
    
    private void ordenar(Playlist base){
        for(int i = 0; i < this.musicas.length - 1; i++)
          for(int j = i+1; j < this.musicas.length; j++)
            if(base.getProximidade(this.musicas[i]) <  
               base.getProximidade(this.musicas[j])){
                   Musica aux = this.musicas[i];
                   this.musicas[i] = this.musicas[j];
                   this.musicas[j] = aux;
            }       
    }    
    
}
