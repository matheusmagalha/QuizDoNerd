public class Jogador {
    private String nome;
    private int pontuacao;
    private int posicaoNoTabuleiro;
    private int perguntasRespondidas;

    public Jogador(String nome) {
        this.nome = nome;
        this.pontuacao = 0;
        this.posicaoNoTabuleiro = 0; // Começa na casa 0
        this.perguntasRespondidas = 0;
    }

    public String getNome() {
        return nome;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public int getPosicaoNoTabuleiro() {
        return posicaoNoTabuleiro;
    }

    public int getPerguntasRespondidas() {
        return perguntasRespondidas;
    }

    public void adicionarPontuacao(int pontos) {
        this.pontuacao += pontos;
    }

    public void avancarNoTabuleiro(int casas, int tamanhoMaximoTabuleiro) {
        this.posicaoNoTabuleiro += casas;
        // Garante que o jogador não ultrapasse a última casa, caso avance muito
        if (this.posicaoNoTabuleiro >= tamanhoMaximoTabuleiro - 1) {
            this.posicaoNoTabuleiro = tamanhoMaximoTabuleiro - 1;
        }
    }

    public void voltarNoTabuleiro(int casas) {
        this.posicaoNoTabuleiro -= casas;
        // Garante que o jogador não volte para casas negativas
        if (this.posicaoNoTabuleiro < 0) {
            this.posicaoNoTabuleiro = 0;
        }
    }

    public void incrementarPerguntasRespondidas() {
        this.perguntasRespondidas++;
    }
}