public class TesteMusica{
    
    public void run(){
        String[] artistas1 = {"ARTISTA1", "ARTISTA2", "ARTISTA3"};
        String[] artistas2 = {"ARTISTA2", "ARTISTA3", "ARTISTA1"};

        Musica musica1 = new Musica("TITULO", artistas1, 120, "GENEROA", 'C',
                                    "GRAVADORA");
                                    
        Musica musica2 = new Musica("TITULO", artistas2, 120, "GENEROA", 'C',
                                    "GRAVADORA");
                                    
        
        System.out.println(musica1.equals(musica2));                            
        System.out.println(musica1.getProximidade(musica2));                            
        System.out.println(musica2.getProximidade(musica1));                              
    }    
    
}
