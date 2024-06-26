package src;

import src.interfaces.AparelhoTelefonico;
import src.interfaces.NavegadorInternet;
import src.interfaces.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    @Override
    public void ligar(String numero) {
        System.out.println("Chamando o número: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Chamada atendida");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Correio de voz iniciado");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo a página: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada.");
    }
    
    @Override
    public void tocar() {
        System.out.println("Reproduzindo música...");
    }

    @Override
    public void pausar() {
        System.out.println("Reprodução pausada.");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Música selecionada: " + musica);
    }

    public static void main(String[] args) {
        Iphone meuIphone = new Iphone();
        
        meuIphone.selecionarMusica("Who wants to live forever - Queen");
        meuIphone.tocar();
        meuIphone.pausar();

        meuIphone.ligar("87912345678");
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();

        meuIphone.exibirPagina("https://www.dio.me/");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();
    }
}
