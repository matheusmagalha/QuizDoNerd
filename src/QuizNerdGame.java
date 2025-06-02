import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;
import java.util.Comparator;

public class QuizNerdGame {

    // --- Constantes do Tabuleiro ---
    // Você pode ajustar o tamanho do lado do tabuleiro aqui.
    // 5x5 para um jogo completo, 2x2 para testes rápidos.
    public static final int TAMANHO_LADO_TABULEIRO = 5;
    public static final int TAMANHO_TOTAL_TABULEIRO = TAMANHO_LADO_TABULEIRO * TAMANHO_LADO_TABULEIRO;

    // --- Lista para Armazenar Todas as Perguntas ---
    public static ArrayList<Pergunta> todasAsPerguntas = new ArrayList<>();

    // --- Função para Carregar as Perguntas (foco em ADS - 1º semestre) ---
    public static void carregarPerguntas() {
        // Dificuldade 1 (Muito Fácil)
        todasAsPerguntas.add(new Pergunta("Qual a sigla para Unidade Central de Processamento?", new String[]{"RAM", "CPU", "HD", "USB"}, 1, 1));
        todasAsPerguntas.add(new Pergunta("Qual parte do computador é responsável por armazenar dados temporariamente?", new String[]{"HD", "Processador", "RAM", "Placa de Vídeo"}, 2, 1));
        todasAsPerguntas.add(new Pergunta("O que é um 'software'?", new String[]{"Parte física do computador", "Programas e aplicativos", "Dispositivo de entrada", "Componente de rede"}, 1, 1));
        todasAsPerguntas.add(new Pergunta("Qual o sistema operacional mais usado em desktops?", new String[]{"Linux", "macOS", "Windows", "Android"}, 2, 1));
        todasAsPerguntas.add(new Pergunta("O que significa WWW na internet?", new String[]{"World Wide Web", "Windows Web World", "Web Wireless Work", "Worldwide Web Pages"}, 0, 1));
        todasAsPerguntas.add(new Pergunta("Qual o nome do ícone usado para salvar arquivos na maioria dos programas?", new String[]{"Lápis", "Disquete", "Tesoura", "Estrela"}, 1, 1));
        todasAsPerguntas.add(new Pergunta("Para que serve um teclado em um computador?", new String[]{"Ver imagens", "Ouvir música", "Digitar texto", "Desenhar"}, 2, 1));
        todasAsPerguntas.add(new Pergunta("Qual programa é usado para navegar na internet?", new String[]{"Word", "Excel", "Navegador web", "Paint"}, 2, 1));

        // Dificuldade 2 (Fácil)
        todasAsPerguntas.add(new Pergunta("Qual o principal protocolo para navegação na web?", new String[]{"FTP", "SMTP", "HTTP", "TCP"}, 2, 2));
        todasAsPerguntas.add(new Pergunta("O que é um 'byte'?", new String[]{"Um caractere de texto", "Um bit de informação", "Oito bits", "Um tipo de vírus"}, 2, 2));
        todasAsPerguntas.add(new Pergunta("O que é um 'firewall'?", new String[]{"Um programa para criar jogos", "Um sistema de segurança de rede", "Um tipo de navegador de internet", "Um dispositivo de armazenamento"}, 1, 2));
        todasAsPerguntas.add(new Pergunta("Qual das opções NÃO é um tipo de linguagem de programação?", new String[]{"Java", "Python", "HTML", "C++"}, 2, 2));
        todasAsPerguntas.add(new Pergunta("O que é um algoritmo?", new String[]{"Um tipo de hardware", "Um conjunto de instruções para resolver um problema", "Um erro de software", "Um formato de arquivo"}, 1, 2));
        todasAsPerguntas.add(new Pergunta("O que é um 'bug' em programação?", new String[]{"Um recurso", "Um erro de código", "Um atalho de teclado", "Um tipo de programa"}, 1, 2));
        todasAsPerguntas.add(new Pergunta("Qual a unidade de medida de frequência de um processador?", new String[]{"Bytes", "Volts", "Hertz", "Watts"}, 2, 2));
        todasAsPerguntas.add(new Pergunta("O que é 'backup'?", new String[]{"Apagar arquivos", "Compactar dados", "Fazer cópia de segurança", "Mover para a lixeira"}, 2, 2));
        // PERGUNTAS BOMBA Dificuldade 2
        todasAsPerguntas.add(new Pergunta("PERGUNTA BOMBA: Qual a porta padrão para o protocolo HTTP?", new String[]{"80", "443", "21", "23"}, 0, 2, true));
        todasAsPerguntas.add(new Pergunta("PERGUNTA BOMBA: Qual comando Linux lista o conteúdo de um diretório?", new String[]{"cd", "mkdir", "ls", "pwd"}, 2, 2, true));
        todasAsPerguntas.add(new Pergunta("PERGUNTA BOMBA: Qual protocolo é usado para envio de e-mails?", new String[]{"HTTP", "FTP", "SMTP", "POP3"}, 2, 2, true));


        // Dificuldade 3 (Média)
        todasAsPerguntas.add(new Pergunta("Em programação, o que é uma 'variável'?", new String[]{"Um tipo de função", "Um local na memória para armazenar dados", "Um erro de compilação", "Uma instrução condicional"}, 1, 3));
        todasAsPerguntas.add(new Pergunta("Qual estrutura de controle permite que um bloco de código seja executado repetidamente?", new String[]{"Condicional (if-else)", "Função", "Loop (laço)", "Array"}, 2, 3));
        todasAsPerguntas.add(new Pergunta("Em um banco de dados, o que é uma 'tabela'?", new String[]{"Um tipo de relatório", "Uma coleção de dados organizada em linhas e colunas", "Um comando de programação", "Um tipo de conexão de rede"}, 1, 3));
        todasAsPerguntas.add(new Pergunta("Qual o nome dado à fase de detecção e correção de erros em um programa?", new String[]{"Compilação", "Execução", "Depuração (Debug)", "Codificação"}, 2, 3));
        todasAsPerguntas.add(new Pergunta("O que é a 'nuvem' (cloud computing)?", new String[]{"Um tipo de rede local", "Serviços de computação entregues pela internet", "Um novo sistema operacional", "Um dispositivo de armazenamento externo"}, 1, 3));
        todasAsPerguntas.add(new Pergunta("O que é 'debugar' um programa?", new String[]{"Compilar o código", "Executar o programa", "Remover erros do código", "Adicionar novas funcionalidades"}, 2, 3));
        todasAsPerguntas.add(new Pergunta("Em SQL, qual comando adiciona novos registros a uma tabela?", new String[]{"SELECT", "UPDATE", "DELETE", "INSERT INTO"}, 3, 3));
        todasAsPerguntas.add(new Pergunta("O que é um 'array' em programação?", new String[]{"Uma única variável", "Uma coleção de variáveis do mesmo tipo", "Uma função matemática", "Um tipo de erro"}, 1, 3));
        // PERGUNTAS BOMBA Dificuldade 3
        todasAsPerguntas.add(new Pergunta("PERGUNTA BOMBA: Qual a sigla para o formato de documento portátil, muito comum na internet?", new String[]{"DOC", "TXT", "PDF", "XLS"}, 2, 3, true));


        // Dificuldade 4 (Intermediário)
        todasAsPerguntas.add(new Pergunta("Em SQL, qual comando é usado para recuperar dados de um banco de dados?", new String[]{"INSERT", "UPDATE", "SELECT", "DELETE"}, 2, 4));
        todasAsPerguntas.add(new Pergunta("O que significa 'POO' em programação?", new String[]{"Programação Orientada a Objetos", "Processamento de Operações Online", "Protocolo de Otimização de Ondas", "Programação de Operações Ocultas"}, 0, 4));
        todasAsPerguntas.add(new Pergunta("Qual a principal função de um sistema operacional?", new String[]{"Navegar na internet", "Gerenciar os recursos do hardware e software", "Criar documentos de texto", "Enviar e-mails"}, 1, 4));
        todasAsPerguntas.add(new Pergunta("O que é um 'framework' em desenvolvimento de software?", new String[]{"Um tipo de erro de código", "Um conjunto de ferramentas e bibliotecas que oferece uma estrutura para desenvolver aplicações", "Um dispositivo de entrada de dados", "Um método de depuração"}, 1, 4));
        todasAsPerguntas.add(new Pergunta("Qual o nome do processo de transformar código-fonte em um programa executável?", new String[]{"Debug", "Execução", "Compilação", "Interpretação"}, 2, 4));
        todasAsPerguntas.add(new Pergunta("Em POO, o que é 'encapsulamento'?", new String[]{"Herança de classes", "Ocultar os detalhes internos de um objeto", "Criação de múltiplos objetos", "Transformar classes em funções"}, 1, 4));
        todasAsPerguntas.add(new Pergunta("Qual o objetivo principal do controle de versão (ex: Git)?", new String[]{"Compactar arquivos", "Acelerar a execução de programas", "Gerenciar mudanças no código-fonte e colaboração", "Criar interfaces gráficas"}, 2, 4));
        todasAsPerguntas.add(new Pergunta("O que é um 'loop infinito'?", new String[]{"Um erro de compilação", "Um loop que nunca termina", "Um loop muito rápido", "Um loop que executa apenas uma vez"}, 1, 4));
        // PERGUNTAS BOMBA Dificuldade 4
        todasAsPerguntas.add(new Pergunta("PERGUNTA BOMBA: Em Orientação a Objetos, o que é 'herança'?", new String[]{"Reuso de código por cópia", "Criação de novas classes a partir de classes existentes", "Ocultação de dados", "Processo de depuração"}, 1, 4, true));
        todasAsPerguntas.add(new Pergunta("PERGUNTA BOMBA: Qual o conceito que permite a um objeto assumir várias formas em POO?", new String[]{"Herança", "Encapsulamento", "Polimorfismo", "Abstração"}, 2, 4, true));


        // Dificuldade 5 (Desafiador)
        todasAsPerguntas.add(new Pergunta("Qual o protocolo que garante a entrega de dados em uma rede, com controle de fluxo e erros?", new String[]{"UDP", "IP", "ICMP", "TCP"}, 3, 5));
        todasAsPerguntas.add(new Pergunta("O que é 'criptografia' em segurança da informação?", new String[]{"Criação de senhas complexas", "Ocultação de dados para evitar acesso não autorizado", "Verificação de vírus em arquivos", "Proteção contra spam"}, 1, 5));
        todasAsPerguntas.add(new Pergunta("O que é um 'API' (Application Programming Interface)?", new String[]{"Um tipo de vírus de computador", "Um conjunto de definições e protocolos para construir e integrar software de aplicativos", "Um dispositivo de armazenamento de dados", "Um formato de arquivo de imagem"}, 1, 5));
        todasAsPerguntas.add(new Pergunta("Em redes, o que é um 'endereço IP'?", new String[]{"Um nome de usuário", "Um identificador único para um dispositivo em uma rede", "Um tipo de cabo de rede", "Um programa de segurança"}, 1, 5));
        todasAsPerguntas.add(new Pergunta("Qual o conceito de 'escalabilidade' em sistemas?", new String[]{"A facilidade de uso do sistema", "A capacidade do sistema de lidar com um aumento de demanda ou carga", "A segurança dos dados do sistema", "A velocidade de processamento de um sistema"}, 1, 5));
        todasAsPerguntas.add(new Pergunta("O que é 'docker' em desenvolvimento?", new String[]{"Uma linguagem de programação", "Uma ferramenta para criar máquinas virtuais", "Uma plataforma de contêineres para empacotar e executar aplicações", "Um tipo de banco de dados"}, 2, 5));
        todasAsPerguntas.add(new Pergunta("Qual a diferença entre HTTP e HTTPS?", new String[]{"Não há diferença", "HTTPS é mais rápido", "HTTPS é a versão segura do HTTP (com criptografia SSL/TLS)", "HTTP é para download, HTTPS é para upload"}, 2, 5));
        todasAsPerguntas.add(new Pergunta("O que é 'refatoração de código'?", new String[]{"Reescrever o código do zero", "Adicionar novas funcionalidades", "Reestruturar o código existente sem alterar seu comportamento externo para melhorar a legibilidade/manutenção", "Compilar o código"}, 2, 5));
        // PERGUNTAS BOMBA Dificuldade 5
        todasAsPerguntas.add(new Pergunta("PERGUNTA BOMBA: Qual o nome do padrão de arquitetura de software que separa a aplicação em três camadas lógicas: Modelo, Visão e Controlador?", new String[]{"REST", "SOAP", "MVC", "Microserviços"}, 2, 5, true));


        // Dificuldade 6 (Muito Difícil)
        todasAsPerguntas.add(new Pergunta("Qual metodologia de desenvolvimento de software enfatiza entregas incrementais e interação com o cliente?", new String[]{"Cascata", "V-Model", "Ágil", "Espiral"}, 2, 6));
        todasAsPerguntas.add(new Pergunta("O que é 'virtualização' em TI?", new String[]{"Criação de jogos em realidade virtual", "Simulação de hardware e software para criar ambientes virtuais", "Desenvolvimento de aplicativos móveis", "Segurança de dados na nuvem"}, 1, 6));
        todasAsPerguntas.add(new Pergunta("No contexto de bancos de dados, o que é 'normalização'?", new String[]{"Padronização de nomes de tabelas", "Processo de organização de dados para reduzir redundância e melhorar a integridade", "Criação de backups de dados", "Otimização de consultas SQL"}, 1, 6));
        todasAsPerguntas.add(new Pergunta("Qual o termo para o estudo da interação entre humanos e computadores?", new String[]{"Inteligência Artificial", "Cibersegurança", "Engenharia de Software", "Interação Humano-Computador (IHC)"}, 3, 6));
        todasAsPerguntas.add(new Pergunta("O que representa 'big data'?", new String[]{"Um banco de dados muito grande", "Um grande volume de dados que exige tecnologias e métodos específicos para processamento e análise", "Um tipo de linguagem de programação", "Um dispositivo de armazenamento de alta capacidade"}, 1, 6));
        todasAsPerguntas.add(new Pergunta("Qual a finalidade de um balanceador de carga em arquiteturas de software?", new String[]{"Aumentar a segurança da rede", "Distribuir o tráfego de rede entre múltiplos servidores para otimizar o uso de recursos e maximizar a capacidade", "Compactar dados", "Monitorar o desempenho do servidor"}, 1, 6));
        todasAsPerguntas.add(new Pergunta("O que é um 'deadlock' em sistemas operacionais ou bancos de dados?", new String[]{"Um tipo de erro de sintaxe", "Uma situação em que dois ou mais processos ficam bloqueados indefinidamente, esperando uns pelos outros", "Um problema de desempenho de hardware", "Um ataque cibernético"}, 1, 6));
        todasAsPerguntas.add(new Pergunta("Explique brevemente o conceito de 'testes unitários'.", new String[]{"Testes que verificam o sistema completo", "Testes que verificam pequenas partes isoladas do código", "Testes de desempenho de software", "Testes realizados por usuários finais"}, 1, 6));
        // PERGUNTAS BOMBA Dificuldade 6
        todasAsPerguntas.add(new Pergunta("PERGUNTA BOMBA: Qual o teorema que afirma que qualquer programa pode ser construído usando apenas sequências, seleções e iterações?", new String[]{"Teorema de Boole", "Teorema de Turing", "Teorema da Estrutura", "Teorema de Floyd"}, 2, 6, true));
        todasAsPerguntas.add(new Pergunta("PERGUNTA BOMBA: O que é 'programação assíncrona'?", new String[]{"Execução sequencial de tarefas", "Execução de tarefas sem bloquear o fluxo principal do programa", "Programação com múltiplos threads simultaneamente", "Execução de código em segundo plano"}, 1, 6, true));
    }

    // --- Funções do Jogo ---

    public static int obterNumeroDeJogadores() {
        Scanner scanner = new Scanner(System.in);
        int numJogadores = 0;
        while (numJogadores <= 0) {
            System.out.print("Digite o número de jogadores: ");
            if (scanner.hasNextInt()) {
                numJogadores = scanner.nextInt();
                if (numJogadores <= 0) {
                    System.out.println("Por favor, digite um número positivo de jogadores.");
                }
            } else {
                System.out.println("Entrada inválida. Por favor, digite um número.");
                scanner.next(); // Limpa a entrada inválida
            }
        }
        return numJogadores;
    }

    public static int lancarDado() {
        Random random = new Random();
        return random.nextInt(6) + 1; // Gera um número entre 1 e 6
    }

    public static Pergunta obterPerguntaAleatoriaPorDificuldade(int nivelDificuldade) {
        ArrayList<Pergunta> perguntasFiltradas = new ArrayList<>();
        for (Pergunta p : todasAsPerguntas) {
            if (p.getDificuldade() == nivelDificuldade) {
                perguntasFiltradas.add(p);
            }
        }
        // Se não houver perguntas para a dificuldade, pega uma aleatória de todas as disponíveis
        if (perguntasFiltradas.isEmpty()) {
            System.out.println("Atenção: Nenhuma pergunta para a dificuldade " + nivelDificuldade + ". Usando uma pergunta aleatória de todas as disponíveis.");
            return todasAsPerguntas.get(new Random().nextInt(todasAsPerguntas.size()));
        }
        Random random = new Random();
        return perguntasFiltradas.get(random.nextInt(perguntasFiltradas.size()));
    }

    public static void jogarTurno(Jogador jogadorAtual, Scanner scanner) { // Agora recebe o scanner como parâmetro
        System.out.println("\n--- Vez de " + jogadorAtual.getNome() + " ---");
        System.out.println("Sua posição atual: Casa " + (jogadorAtual.getPosicaoNoTabuleiro() + 1) + " de " + TAMANHO_TOTAL_TABULEIRO);

        int dificuldade = lancarDado();
        System.out.println("Dado lançado: " + dificuldade + " (Nível de Dificuldade para a pergunta)");

        Pergunta perguntaAtual = obterPerguntaAleatoriaPorDificuldade(dificuldade);

        if (perguntaAtual.isBomba()) {
            System.out.println("\n*** ATENÇÃO! ESTA É UMA PERGUNTA BOMBA! ***");
        }

        System.out.println("\nPergunta: " + perguntaAtual.getTextoPergunta());
        String[] opcoes = perguntaAtual.getOpcoes();
        for (int i = 0; i < opcoes.length; i++) {
            System.out.println((i + 1) + ". " + opcoes[i]);
        }

        int respostaJogador = -1; // Valor padrão para entrada inválida
        // Loop para garantir que o jogador digite uma opção válida
        while (true) {
            System.out.print("Sua resposta (1-" + opcoes.length + "): ");
            if (scanner.hasNextInt()) {
                respostaJogador = scanner.nextInt();
                if (respostaJogador >= 1 && respostaJogador <= opcoes.length) {
                    break; // Sai do loop se a resposta for um número válido dentro do range de opções
                } else {
                    System.out.println("Opção inválida. Digite um número entre 1 e " + opcoes.length + ".");
                }
            } else {
                System.out.println("Entrada inválida. Por favor, digite um número.");
                scanner.next(); // Limpa a entrada inválida do buffer do scanner
            }
        }

        // --- Lógica principal após a resposta ---
        if (respostaJogador - 1 == perguntaAtual.getIndiceRespostaCorreta()) {
            System.out.println("Correto! Você ganha " + dificuldade + " ponto(s) e avança uma casa!");
            jogadorAtual.adicionarPontuacao(dificuldade);
            jogadorAtual.avancarNoTabuleiro(1, TAMANHO_TOTAL_TABULEIRO);
            System.out.println(jogadorAtual.getNome() + " está agora na Casa " + (jogadorAtual.getPosicaoNoTabuleiro() + 1) + ".");
        } else {
            System.out.println("Incorreto. A resposta correta era: " + (perguntaAtual.getIndiceRespostaCorreta() + 1) + ". " + opcoes[perguntaAtual.getIndiceRespostaCorreta()]);
            System.out.println("Você não avança no tabuleiro.");

            // Lógica da Bomba: Penalidade de Voltar Casas (se errar a bomba)
            if (perguntaAtual.isBomba()) {
                int casasParaVoltar = 2; // Penalidade: volta 2 casas
                jogadorAtual.voltarNoTabuleiro(casasParaVoltar);
                System.out.println("Oh não! Esta era uma pergunta BOMBA! Você volta " + casasParaVoltar + " casas!");
                System.out.println(jogadorAtual.getNome() + " está agora na Casa " + (jogadorAtual.getPosicaoNoTabuleiro() + 1) + ".");
            }
        }
        jogadorAtual.incrementarPerguntasRespondidas(); // Conta a pergunta como respondida
    }

    public static boolean oJogoAcabou(Jogador[] jogadores) {
        for (Jogador jogador : jogadores) {
            if (jogador.getPosicaoNoTabuleiro() >= TAMANHO_TOTAL_TABULEIRO - 1) {
                return true;
            }
        }
        return false;
    }

    public static void exibirSituacaoDoTabuleiro(Jogador[] jogadores) {
        System.out.println("\n--- Situação Atual do Tabuleiro ---");

        ArrayList<Jogador> ranking = new ArrayList<>(java.util.Arrays.asList(jogadores));
        // Ordena por posição no tabuleiro (maior primeiro) para o ranking
        ranking.sort(Comparator.comparingInt(Jogador::getPosicaoNoTabuleiro).reversed());

        for (int i = 0; i < TAMANHO_TOTAL_TABULEIRO; i++) {
            System.out.print("[" + String.format("%02d", i + 1));
            boolean casaOcupada = false;
            for (Jogador jogador : jogadores) {
                if (jogador.getPosicaoNoTabuleiro() == i) {
                    System.out.print(" " + jogador.getNome().charAt(0)); // Mostra a inicial do jogador
                    casaOcupada = true;
                }
            }
            if (!casaOcupada) {
                System.out.print("  "); // Espaços para casas vazias
            }
            System.out.print("]");

            if ((i + 1) % TAMANHO_LADO_TABULEIRO == 0) { // Quebra de linha para formar o tabuleiro
                System.out.println();
            }
        }
        System.out.println("---------------------------------");
        System.out.println("Ranking (Posição no Tabuleiro):");
        for (Jogador j : ranking) {
            System.out.println("- " + j.getNome() + ": Casa " + (j.getPosicaoNoTabuleiro() + 1) + " (Pontuação: " + j.getPontuacao() + ")");
        }
        System.out.println("---------------------------------");
    }

    public static void displayGameResults(Jogador[] jogadores) {
        System.out.println("\n--- Fim de Jogo! Resultados Finais ---");
        ArrayList<Jogador> vencedores = new ArrayList<>();

        int maiorPosicao = -1;
        for (Jogador jogador : jogadores) {
            if (jogador.getPosicaoNoTabuleiro() > maiorPosicao) {
                maiorPosicao = jogador.getPosicaoNoTabuleiro();
            }
        }

        // Encontra todos os jogadores que estão na maior posição
        for (Jogador jogador : jogadores) {
            if (jogador.getPosicaoNoTabuleiro() == maiorPosicao) {
                vencedores.add(jogador);
            }
        }

        if (vencedores.isEmpty()) {
            System.out.println("Não houve vencedor claro.");
        } else if (vencedores.size() == 1) {
            Jogador vencedor = vencedores.get(0);
            System.out.println("E o vencedor é: " + vencedor.getNome() + " por ter chegado ao final do tabuleiro! Pontuação: " + vencedor.getPontuacao() + " pontos.");
        } else {
            System.out.println("Temos um empate para o primeiro lugar! Os vencedores são:");
            for (Jogador j : vencedores) {
                System.out.println("- " + j.getNome() + " (Pontuação: " + j.getPontuacao() + ")");
            }
            // Critério de desempate: maior pontuação
            Jogador vencedorDesempate = vencedores.get(0);
            for (int i = 1; i < vencedores.size(); i++) {
                if (vencedores.get(i).getPontuacao() > vencedorDesempate.getPontuacao()) {
                    vencedorDesempate = vencedores.get(i);
                }
            }
            System.out.println("\nPor desempate (maior pontuação), o grande campeão é: " + vencedorDesempate.getNome() + "!");
        }

        System.out.println("\nPontuações de todos os jogadores:");
        for (Jogador player : jogadores) {
            System.out.println("- " + player.getNome() + ": " + player.getPontuacao() + " pontos. Sua posição no tabuleiro é: " + (player.getPosicaoNoTabuleiro() + 1) + ".");
        }
    }

    // Sorteia a ordem dos jogadores por lançamento de dado
    public static Jogador[] sortearOrdemJogadores(Jogador[] jogadores) {
        System.out.println("\n--- Lançamento de Dados para Definir a Ordem ---");
        Random random = new Random();

        // Classe auxiliar interna para associar o jogador ao resultado do dado
        class JogadorComDado {
            Jogador jogador;
            int resultadoDado;

            JogadorComDado(Jogador j, int r) {
                this.jogador = j;
                this.resultadoDado = r;
            }
        }

        ArrayList<JogadorComDado> resultadosLances = new ArrayList<>();
        for (Jogador j : jogadores) {
            int dado = random.nextInt(6) + 1; // Lança um dado de 1 a 6
            resultadosLances.add(new JogadorComDado(j, dado));
            System.out.println(j.getNome() + " lançou o dado e tirou: " + dado);
        }

        // Ordena os jogadores pelo resultado do dado (maior primeiro)
        Collections.sort(resultadosLances, Comparator.comparingInt((JogadorComDado jcd) -> jcd.resultadoDado).reversed());

        System.out.println("\n--- Ordem dos Jogadores para Começar o Jogo ---");
        Jogador[] jogadoresOrdenados = new Jogador[jogadores.length];
        for (int i = 0; i < resultadosLances.size(); i++) {
            jogadoresOrdenados[i] = resultadosLances.get(i).jogador;
            System.out.println((i + 1) + ". " + jogadoresOrdenados[i].getNome() + " (Dado: " + resultadosLances.get(i).resultadoDado + ")");
        }
        System.out.println("------------------------------------");

        return jogadoresOrdenados;
    }

    // --- Método Principal (Main) - Ponto de Entrada do Programa ---
    public static void main(String[] args) {
        // Um único Scanner para toda a aplicação para gerenciar System.in
        Scanner scanner = new Scanner(System.in);
        carregarPerguntas(); // Carrega todas as perguntas do seu quiz

        System.out.println("Bem-vindo ao Quiz Nerd do Tabuleiro!");
        System.out.println("O objetivo é ser o primeiro a chegar na Casa " + TAMANHO_TOTAL_TABULEIRO + " do tabuleiro " + TAMANHO_LADO_TABULEIRO + "x" + TAMANHO_LADO_TABULEIRO + "!");

        int numJogadores = obterNumeroDeJogadores();
        Jogador[] jogadores = new Jogador[numJogadores];
        for (int i = 0; i < numJogadores; i++) {
            System.out.print("Digite o nome do Jogador " + (i + 1) + ": ");
            String nome = scanner.next();
            jogadores[i] = new Jogador(nome);
        }

        // Sorteia a ordem inicial dos jogadores
        jogadores = sortearOrdemJogadores(jogadores);

        int indiceJogadorAtual = 0; // Começa com o primeiro jogador na ordem sorteada

        // Loop principal do jogo: continua enquanto o jogo não tiver acabado
        while (!oJogoAcabou(jogadores)) {
            Jogador jogadorAtual = jogadores[indiceJogadorAtual];

            // Exibe o tabuleiro e o ranking antes de cada turno
            exibirSituacaoDoTabuleiro(jogadores);

            // O jogador atual joga seu turno, passando o scanner
            jogarTurno(jogadorAtual, scanner);

            // Passa para o próximo jogador (usa o operador de módulo para voltar ao primeiro quando chega no final do array)
            indiceJogadorAtual = (indiceJogadorAtual + 1) % numJogadores;
        }

        // Quando o jogo termina, exibe a situação final do tabuleiro e os resultados
        exibirSituacaoDoTabuleiro(jogadores);
        displayGameResults(jogadores);

        scanner.close(); // Fecha o scanner ao final do jogo
    }
}