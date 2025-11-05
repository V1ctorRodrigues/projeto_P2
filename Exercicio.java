public class Exercicio {
    private String nome;
    private double peso; 
    private int repeticoes;
    private int series;
    private int tempoSegundos;

   
    public Exercicio(String nome, double peso, int repeticoes, int series, int tempoSegundos) {
        this.nome = nome;
        this.peso = peso;
        this.repeticoes = repeticoes;
        this.series = series;
        this.tempoSegundos = tempoSegundos;
    }

   
    public String getNome() { return nome; }
    public double getPeso() { return peso; }
    public int getRepeticoes() { return repeticoes; }
    public int getSeries() { return series; }
    public int getTempoSegundos() { return tempoSegundos; }

   
    public void setNome(String nome) { this.nome = nome; }
    public void setPeso(double peso) { this.peso = peso; }
    public void setRepeticoes(int repeticoes) { this.repeticoes = repeticoes; }
    public void setSeries(int series) { this.series = series; }
    public void setTempoSegundos(int tempoSegundos) { this.tempoSegundos = tempoSegundos; }

    
    public double calcularVolume() {
        return peso * repeticoes * series;
    }

    public void exibirDetalhes(){
        System.out.println("Exercicio: " + nome);
        System.out.println("Séries x Repeticões: " + series  " x " + repeticoes);
        System.out.println("Peso por repetição: " + peso + " Kg");
        System.out.println("Tempo por série: " + tempoSegundos + " s");
        System.out.println("Volume (carga) total: " + calcularVolume() + " kg");
    }
        
    public String toString() {
        return nome + " - " + series + "x" + repeticoes + " - " + peso + "kg, tempo por série: " + tempoSegundos + "s";
    }
}








