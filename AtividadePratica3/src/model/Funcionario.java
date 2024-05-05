package model;

public abstract class Funcionario implements Trabalhavel {
    
    //#region Atributos
    private int id;
    private String nome;
    protected float valorHora;
    protected float horasTrabalhadas;
    //#endregion

    //#region Construtores
    public Funcionario() {

    }
    public Funcionario(int id, String nome, float valorHora, float horasTrabalhadas) {
        this.id = id;
        this.nome = nome;
        this.valorHora = valorHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }
    //#endregion

    //#region Getters e Setters
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public float getValorHora() {
        return valorHora;
    }
    public void setValorHora(float valorHora) {
        this.valorHora = valorHora;
    }
    public float getHorasTrabalhadas() {
        return horasTrabalhadas;
    }
    public void setHorasTrabalhadas(float horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }
    //#endregion

    //#region Métodos
    public abstract float calcularSalario();
    //#endregion

    //#region toString
    @Override
    public String toString() {
        String text = "\nID: " + id + "\nNome: " + nome;

        return text;
    }
    //#endregion

}
