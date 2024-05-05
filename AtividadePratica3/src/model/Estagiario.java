package model;

public class Estagiario extends Funcionario {
    
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
    @Override //vem da superclasse Funcionario()
    public float calcularSalario() {
        float salario = valorHora * horasTrabalhadas;
        return salario;
    }

    @Override //vem da interface Trabalhavel()
    public String trabalhar() {
        String text = "O Estagiario " + getNome() + " começou a aprender sobre " + aprendendo + " com o Supervisor " + supervisor;
        return text;
    }

    @Override //vem da interface Trabalhavel()
    public String relatarProgresso() {
        String text = "Segundo o Supervisor " + supervisor + ", o " + getNome() + " esta a 32% de concluir o aprendizado sobre " + aprendendo;
        return text;
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
