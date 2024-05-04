package model;

public class Estagiario extends Funcionario implements Trabalhavel {
    
    //#region Atributos
    private String supervisor;
    private String aprendendo;
    //#endregion

    //#region Construtores
    public Estagiario(){

    }

    public Estagiario(int id, String nome, float valorHora, float horasTrabalhadas, String supervisor,
            String aprendendo) {
        super(id, nome, valorHora, horasTrabalhadas);
        this.supervisor = supervisor;
        this.aprendendo = aprendendo;
    }
    //#endregion
    
    //#region Getters e Setters
    public String getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(String supervisor) {
        this.supervisor = supervisor;
    }

    public String getAprendendo() {
        return aprendendo;
    }

    public void setAprendendo(String aprendendo) {
        this.aprendendo = aprendendo;
    }
    //#endregion

    //#region Métodos
    @Override
    public float calcularSalario() {
        float salario = valorHora * horasTrabalhadas;
        return salario;
    }
    //#endregion

    //#region toString
    @Override
    public String toString() {
        String text = super.toString() + "\nSupervisor: " + supervisor + "\nAprendendo Atualmente: " + aprendendo + "\nSalario: " + calcularSalario();
        return text;
    }
    //#endregion

}
