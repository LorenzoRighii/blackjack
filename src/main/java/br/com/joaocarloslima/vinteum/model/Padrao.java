package br.com.joaocarloslima.vinteum.model;

public class Padrao implements EstiloDeJogo {

    @Override
    public String getNome() {
        return "Padrão";
    }

    @Override
    public boolean querCarta(Mao mao) {
        return mao.getPontos() < 17;
    }
}
