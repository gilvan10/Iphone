public class Teste {

    public static void main(String[] args) {

        ReprodutorMusicial reprodutor = new ReprodutorMusicial();
        reprodutor.adicionarMusica("A barca");
        reprodutor.tocar("A barca");
        reprodutor.pausar("A barca");
        reprodutor.selecionarMusica("A barca");

        AparelhoTelefonico aparelho = new AparelhoTelefonico();
        aparelho.adicionarContato("Gilvan","71 999999990");
        aparelho.adicionarContato("Gil","71 999999992");
        aparelho.ligar("Gil");
        aparelho.atender("71 999999993");
        aparelho.iniciarCorreioVoz();

        NavegadorNaInternet navegador = new NavegadorNaInternet();
        navegador.exibirPagina("www.teste.com.br");
        navegador.adicionarNovaAba("www.testando.com.br");
        navegador.atualizarPagina("www.teste.com.br");

        

    }

}