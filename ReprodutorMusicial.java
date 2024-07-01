import java.util.List;
import java.util.ArrayList;

public class ReprodutorMusicial {

    List musicas;

    public ReprodutorMusicial() {
        this.musicas = new ArrayList<String>();
    }

    public void adicionarMusica(String musica) {
        this.musicas.add(musica);
    }

    public void tocar(String musica) {
        System.out.println("Tocando música " + musica);
    }

    public void pausar(String musica) {
        System.out.println("Pausando música " + musica);
    }

    public void selecionarMusica(String musica) {
        try {
            String musicaEscolhida;
            boolean encontrouMusica = false;
            for(int i = 0; i < this.musicas.size(); i++){
                musicaEscolhida = (String)this.musicas.get(i);
                if(musicaEscolhida.equals(musica)) {
                   encontrouMusica = true;
                   break;
                }
            }
            if(encontrouMusica){
               System.out.println("Música selecionada " + musica);
            } 
            else {
               System.out.println("Música não encontrada");
            }
               
            
        }catch(Exception e) {
            System.out.println("Erro ao selecionar música.");
        }
        
    }

}