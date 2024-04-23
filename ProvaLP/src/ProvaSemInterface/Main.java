package ProvaSemInterface;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Map<String, Integer> NumeroVotos = new HashMap<>();
        ArrayList<String> jogadores = new ArrayList<>();
        jogadores.add("Alane Dias");
        jogadores.add("Beatriz Reis");
        jogadores.add("Davi Brito");
        jogadores.add("Deniziane Ferreira");
        jogadores.add("Fernanda Bande");
        jogadores.add("Giovanna Lima");
        jogadores.add("Giovanna Pitel");
        jogadores.add("Isabelle Nogueira");
        jogadores.add("Juninho");
        jogadores.add("Leidy Elin");
        jogadores.add("Lucas Henrique");
        jogadores.add("Lucas Luigi");
        jogadores.add("Lucas Pizane");
        jogadores.add("Marcus Vinicius");
        jogadores.add("Matteus Amaral");
        jogadores.add("Maycon Cosmer");
        jogadores.add("MC Bin Laden");
        jogadores.add("Michel Nogueira");
        jogadores.add("Nizam");
        jogadores.add("Raquele Cardozo");
        jogadores.add("Rodriguinho");
        jogadores.add("Thalyta Alves");
        jogadores.add("Vanessa Lopes");
        jogadores.add("Vinicius Rodrigues");
        jogadores.add("Wanessa Camargo");
        jogadores.add("Yasmin Brunet");



        Scanner objeto = new Scanner(System.in);

        while(true) {


            System.out.println("Digite um nome (ou sair para encerrar): ");
            String NomeJogador = objeto.nextLine();

            if (NomeJogador.equalsIgnoreCase("sair")){
                break;
            }


            if (jogadores.contains(NomeJogador)) {

                if (NumeroVotos.containsKey(NomeJogador)){

                }


            } else {
                System.out.printf("Esse nome nao existe para ser votado");
            }
        }

        int TotalVotos = 0;


        System.out.printf("“Se eu conseguir mover montanhas, se eu conseguir surfar um tsunami, se eu conseguir\n" +
                "domar o sol, se eu conseguir fazer o mar virar sertão, e o sertão virar mar, se eu\n" +
                "conseguir dizer o que eu nunca vou conseguir dizer, aí terá chegado o dia em que eu\n" +
                "vou conseguir te eliminar com alegria. Com" + TotalVotos + "votos, é você quem sai\n" +
                 "."
        );

    }




}