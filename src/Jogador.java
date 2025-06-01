// Jogador.java
public class Jogador {
    private String nome;
    private int pontuacao;
    private int posicaoNoTabuleiro; // 0-indexed
    private int perguntasRespondidas;

    public Jogador(String nome) {
        this.nome = nome;
        this.pontuacao = 0;
        this.posicaoNoTabuleiro = 0;
        this.perguntasRespondidas = 0;
    }

    public String getNome() {
        return nome;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public void adicionarPontuacao(int pontos) {
        this.pontuacao += pontos;
    }

    public int getPosicaoNoTabuleiro() {
        return posicaoNoTabuleiro;
    }

    public void avancarNoTabuleiro(int casas, int tamanhoTotalTabuleiro) {
        this.posicaoNoTabuleiro += casas;
        // Garante que o jogador não ultrapasse o final do tabuleiro para fins de vitória
        if (this.posicaoNoTabuleiro >= tamanhoTotalTabuleiro - 1) {
            this.posicaoNoTabuleiro = tamanhoTotalTabuleiro - 1; // Para garantir que fique na última casa
        }
    }

    // NOVO MÉTODO: Permite que o jogador volte casas
    public void voltarNoTabuleiro(int casas) {
        this.posicaoNoTabuleiro -= casas;
        if (this.posicaoNoTabuleiro < 0) {
            this.posicaoNoTabuleiro = 0; // Não pode ir para casas negativas
        }
    }

    public int getPerguntasRespondidas() {
        return perguntasRespondidas;
    }

    public void incrementarPerguntasRespondidas() {
        this.perguntasRespondidas++;
    }
}