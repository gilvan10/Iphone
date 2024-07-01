import java.util.HashMap;
import java.util.Map;

public class AparelhoTelefonico {

    Map<String,String> agenda;

    public AparelhoTelefonico() {
        this.agenda = new HashMap<String,String>();
    }

    public void adicionarContato(String nome, String numero) {
        this.agenda.put(nome,numero);
    }

    public void ligar(String nome) {
        String chave;
        String valor;
        boolean encontrouContato = false;
        for(Map.Entry<String,String> entry : this.agenda.entrySet()){
            chave = entry.getKey();
            valor = entry.getValue();
            if(nome.equals(chave)){
               System.out.println("Ligando para " + nome + " número " + valor);
               encontrouContato = true;
               break;
            }
        } 
        if(!encontrouContato) 
           System.out.println("Algum erro ocorreu");
    }


    public void atender(String numero) {
        System.out.println("Atendendo o número " + numero);
    }
    
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando Correio de Voz");
    }

}
