package ProvaSemInterface;

public class Jogador {
    
    private String Nome;
    private int NumeroVotos;

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public int getNumeroVotos() {
        return NumeroVotos;
    }

    public void setNumeroVotos(int numeroVotos) {
        NumeroVotos = numeroVotos;
    }

    public void incrementaUmVoto() {
        this.NumeroVotos = getNumeroVotos() + 1;
    }
}
