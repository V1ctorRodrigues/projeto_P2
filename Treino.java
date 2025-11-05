import java.util.ArrayList;

public class Treino {
    private String nome;
    private ArrayList<Exercicio> exercicios = new ArrayList<>();

    public Treino(String nome) {
        this.nome = nome;
    }

  
    public String getNome() { return nome; }
    public ArrayList<Exercicio> getExercicios() { return exercicios; }

    public void setNome(String nome) { this.nome = nome; }

  
    public void adicionarExercicio(Exercicio exercicio) {
        if (exercicio != null) {
            exercicios.add(exercicio);
        }
    }

    public boolean removerExercicio(String nome) {
        for (int i = 0; i < exercicios.size(); i++) {
            if (exercicios.get(i).getNome().equalsIgnoreCase(nome)) {
                exercicios.remove(i);
                return true;
            }
        }
        return false;
    }

    public double calcularCargaTotal() {
        double total = 0;
        for (Exercicio e : exercicios) {
            total += e.calcularVolume();
        }
        return total;
    }

    
    public int calcularTempoTotalSegundos() {
        int total = 0;
        for (Exercicio e : exercicios) {
            total += e.getTempoSegundos() * e.getSeries();
        }
        return total;
    }

 
    public void exibirResumoTreino() {
        System.out.println("Treino: " + nome);
        System.out.println("Exercícios:");
        if (exercicios.isEmpty()) {
            System.out.println("  Nenhum exercício adicionado.");
        } else {
            for (Exercicio e : exercicios) {
                System.out.println("  - " + e.toString());
            }
        }
        System.out.println("Carga total (volume): " + calcularCargaTotal() + " kg");
        int tempo = calcularTempoTotalSegundos();
        System.out.println("Tempo total aproximado: " + tempo + " segundos (" + (tempo / 60) + " min " + (tempo % 60) + " s)");
    }

   
    public String toString() {
        return "Treino: " + nome + " | Exercícios: " + exercicios.size();
    }
}

