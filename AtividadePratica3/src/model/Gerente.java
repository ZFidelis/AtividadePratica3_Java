package model;

public class Gerente extends Funcionario implements Trabalhavel {
    
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
    @Override
    public float calcularSalario() {
        float salario = (valorHora * horasTrabalhadas) + bonusSalarial;
        return salario;
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
