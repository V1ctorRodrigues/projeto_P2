public abstract class Exercicio {

    private String nome;
    private String grupoMuscular;
    private double carga;
    private int repeticoes;
    private int series;
    private int tempoDescanso; // segundos

    // Construtor sem parâmetros
    public Exercicio() {
        this.nome = "";
        this.grupoMuscular = "";
        this.carga = 0;
        this.repeticoes = 0;
        this.series = 0;
        this.tempoDescanso = 0;
    }

    // Construtor completo
    public Exercicio(String nome, String grupoMuscular, double carga, int repeticoes, int series, int tempoDescanso) {
        this.nome = nome;
        this.grupoMuscular = grupoMuscular;
        this.carga = carga;
        this.repeticoes = repeticoes;
        this.series = series;
        this.tempoDescanso = tempoDescanso;
    }

    public String getNome() { return nome; }
    public String getGrupoMuscular() { return grupoMuscular; }
    public double getCarga() { return carga; }
    public int getRepeticoes() { return repeticoes; }
    public int getSeries() { return series; }
    public int getTempoDescanso() { return tempoDescanso; }

    public void setNome(String nome) { this.nome = nome; }
    public void setGrupoMuscular(String grupoMuscular) { this.grupoMuscular = grupoMuscular; }
    public void setCarga(double carga) { this.carga = carga; }
    public void setRepeticoes(int repeticoes) { this.repeticoes = repeticoes; }
    public void setSeries(int series) { this.series = series; }
    public void setTempoDescanso(int tempoDescanso) { this.tempoDescanso = tempoDescanso; }

    public abstract double calcularVolumeTotal();

    public void exibirDetalhes() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Exercício: " + nome +
               "\nGrupo Muscular: " + grupoMuscular +
               "\nSéries: " + series +
               "\nRepetições: " + repeticoes +
               "\nCarga: " + carga + "kg" +
               "\nDescanso: " + tempoDescanso + "s";
    }
}