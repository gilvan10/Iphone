import java.util.List;
import java.util.ArrayList;

public class NavegadorNaInternet {

    List url;

    public NavegadorNaInternet() {
        this.url = new ArrayList<>();
    }

    public void exibirPagina(String url) {
        System.out.println("Acessando página " + url);
    }

    public void adicionarNovaAba(String url) {
        this.url.add(url);
        System.out.println("Nova aba adicionada");
    }

    public void atualizarPagina(String url) {
        System.out.println("Pagina sendo atualizada " + url);
    }
    
}
