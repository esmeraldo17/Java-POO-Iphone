package meuIphone;

import aparelhos.iPhone.Iphone;

public class MeuIphone {
    public static void main(String[] args) {
        Iphone iphoneX = new Iphone();

        System.out.println("Abrindo o reprodutor musical");
        iphoneX.selecionarMusica("Tipo hashirama");
        iphoneX.tocar();
        iphoneX.pausar();

        System.out.println("Iniciando uma chamada");
        iphoneX.ligar("932496138");
        iphoneX.iniciarCorreioVoz();
        iphoneX.atender();

        System.out.println("Abrindo o navegador de Internet");
        iphoneX.exibirPagina("dio.me");
        iphoneX.adicionarNovaAba();
        iphoneX.atualizarPagina();
    }
}
