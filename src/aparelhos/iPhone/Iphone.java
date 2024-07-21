package aparelhos.iPhone;

import aparelhos.aparelhoTelefonico.AparelhoTelefonico;
import aparelhos.navegadorInternet.NavegadorInternet;
import aparelhos.reprodutorMusical.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet{

    public void exibirPagina(String url) {
       System.out.println("Exibindo pagina " + url);
    }

    public void adicionarNovaAba() {
       System.out.println("Nova aba adicionada");
    }

    public void atualizarPagina() {
      System.out.println("Pagina Atualizada");
    }

    public void ligar(String numero) {
       System.out.println("Ligando para o numero " + numero);
    }

    public void atender() {
       System.out.println("Chamada atendida");
    }

    public void iniciarCorreioVoz() {
       System.out.println("Correio de voz iniciado");
    }

    public void tocar() {
      System.out.println("Tocando a mucica");
    }

    public void pausar() {
        System.out.println("Musica pausada");
    }

    public void selecionarMusica(String musica) {
       System.out.println("Musica " + musica + " selecionada.");
    }



}
