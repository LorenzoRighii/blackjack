package br.com.joaocarloslima.vinteum.model;

public class Mesa extends Participante {

    private EstiloDeJogo estilo = new Padrao();

    @Override
    public boolean querCarta() {
        return !parou() && !estourou() && estilo.querCarta(getMao());
    }

    public void setEstilo(EstiloDeJogo estilo) {
        this.estilo = estilo;
    }

    public EstiloDeJogo getEstilo() {
        return estilo;
    }
}
