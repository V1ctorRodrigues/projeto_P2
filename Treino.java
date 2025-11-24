import java.util.ArrayList;

public class Treino {
    private String nome;
    private ArrayList<Exercicio> exercicios = new ArrayList<>();

    public Treino(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new AppException("Nome do treino não pode ser vazio.");
        }
        this.nome = nome;
    }

  
    public String getNome() { return nome; }
    public ArrayList<Exercicio> getExercicios() { return exercicios; }

    public void setNome(String nome) throws AppException{
        if (nome == null || nome.trim().isEmpty()) {
            throw new AppException("Nome do treino inválido.");
        }
        this.nome = nome;
    }

  
    public void adicionarExercicio(Exercicio exercicio) throws AppException{
        if (exercicio == null) {
            throw new AppException("Erro: o exercício não pode ser nulo.");
        }
        exercicios.add(exercicio);
    }
    public boolean removerExercicio(String nome) throws AppException {
        if (nomeExercicio == null || nomeExercicio.trim().isEmpty()) {
            throw new AppException("O nome do exercício não pode ser vazio.");
        }

        boolean removido = exercicios.removeIf(
            e -> e.getNome().equalsIgnoreCase(nomeExercicio));

        if (!removido) {
            throw new AppException("Exercício não encontrado para remoção.");
            }

        return true;

    } 

       

    public double calcularCargaTotal() throws AppException {
        if (exercicios.isEmpty()) {
            throw new AppException("Nenhum exercício cadastrado para calcular a carga.");
        }

        double total = 0;
        for (Exercicio e : exercicios) {
            total += e.calcularVolumeTotal();
        }
        return total;

    } 
    
    public int calcularTempoTotalSegundos() throws AppException  {
        if (exercicio.isEmpty(){
            throw new AppException("nenhum exercicio cadastrado para calcúlo do tempo");
        }
        int total = 0;
        for (Exercicio e : exercicios) {
            total += e.getTempoSegundos() * e.getSeries();
        }
        return total;
    }
 
    public void exibirResumoTreino() throws AppException {
        if (exercicios.isEmpty()) {
            throw new AppExcepption("não é possível exibir resumo : nenhum exercicio cadastrado.");
        }
        System.out.println("Treino: " + nome);
        for (Exercicio e : exercicios) {
            System.out.println("\n------------------");
            e.exibirDetalhes();
        }

        System.out.println("\nVolume total : " + calcularCargaTotal() + " kg");
        int tempo = calcularTempoTotalSegundos();
        System.out.println("Tempo total : " + tempo + " s (" + (tempo / 60) + " min " + (tempo % 60) + " s)");

    } 
    @Override 
    public String toString() {
        return "Treino: " + nome + " | Exercícios: " + exercicios.size();
    }
}





