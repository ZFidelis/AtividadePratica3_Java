package model;

public class Gerente extends Funcionario {
    
    //#region Atributos
    private float bonusSalarial;
    private String timeGerenciado;
    //#endregion
    
    //#region Construtores
    public Gerente() {
        
    }

    public Gerente(int id, String nome, float valorHora, float horasTrabalhadas, float bonusSalarial,
            String timeGerenciado) {
        super(id, nome, valorHora, horasTrabalhadas);
        this.bonusSalarial = bonusSalarial;
        this.timeGerenciado = timeGerenciado;
    }
    //#endregion

    //#region Getters e Setters
    public float getBonusSalarial() {
        return bonusSalarial;
    }

    public void setBonusSalarial(float bonusSalarial) {
        this.bonusSalarial = bonusSalarial;
    }

    public String getTimeGerenciado() {
        return timeGerenciado;
    }

    public void setTimeGerenciado(String timeGerenciado) {
        this.timeGerenciado = timeGerenciado;
    }
    //#endregion

    //#region Métodos
    @Override //vem da superclasse Funcionario()
    public float calcularSalario() {
        float salario = (valorHora * horasTrabalhadas) + bonusSalarial;
        return salario;
    }

    @Override //vem da interface Trabalhavel()
    public String trabalhar() {
        String text = "O Gerente " + getNome() + " iniciou o gerenciamento do " + timeGerenciado;
        return text;
    }

    @Override//vem da interface Trabalhavel()
    public String relatarProgresso() {
        String text = "Segundo o " + getNome() + ", o trabalho atual do time " + timeGerenciado + " esta em 54% de progresso";
        return text;
    }
    //#endregion

    //#region toString
    @Override
    public String toString() {
        String text = super.toString() + "\nTime Gerenciado: " + timeGerenciado + "\nSalario: " + calcularSalario();
        return text;
    }
    //#endregion

}
