public class Pergunta {
    private String textoPergunta;
    private String[] opcoes;
    private int indiceRespostaCorreta; // Índice no array de opções (0-baseado)
    private int dificuldade; // 1 (fácil) a 6 (difícil)
    private boolean isBomba; // True se for uma pergunta "bomba"

    public Pergunta(String textoPergunta, String[] opcoes, int indiceRespostaCorreta, int dificuldade) {
        this.textoPergunta = textoPergunta;
        this.opcoes = opcoes;
        this.indiceRespostaCorreta = indiceRespostaCorreta;
        this.dificuldade = dificuldade;
        this.isBomba = false; // Por padrão, não é bomba
    }

    // Construtor sobrecarregado para perguntas bomba
    public Pergunta(String textoPergunta, String[] opcoes, int indiceRespostaCorreta, int dificuldade, boolean isBomba) {
        this.textoPergunta = textoPergunta;
        this.opcoes = opcoes;
        this.indiceRespostaCorreta = indiceRespostaCorreta;
        this.dificuldade = dificuldade;
        this.isBomba = isBomba;
    }

    public String getTextoPergunta() {
        return textoPergunta;
    }

    public String[] getOpcoes() {
        return opcoes;
    }

    public int getIndiceRespostaCorreta() {
        return indiceRespostaCorreta;
    }

    public int getDificuldade() {
        return dificuldade;
    }

    public boolean isBomba() {
        return isBomba;
    }
}