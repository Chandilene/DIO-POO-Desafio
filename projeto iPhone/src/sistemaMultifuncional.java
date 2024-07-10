public class sistemaMultifuncional {
    public static void main(String[] args) {
        iPhone meuIphone = new iPhone();

        // Testando ReprodutorMusical
        meuIphone.selecionarMusica("Velha Infância - Tribalistas");
        meuIphone.tocar();
        meuIphone.pausar();

        // Testando AparelhoTelefonico
        meuIphone.ligar("11 99999-9999");
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();

        // Testando NavegadorInternet
        meuIphone.exibirPagina("www.teste.com");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();
    }
}
