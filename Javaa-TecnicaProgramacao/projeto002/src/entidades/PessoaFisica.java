package entidades;

import java.time.LocalDate;

public class PessoaFisica {
    private String nome;
    private Endereco endereco;
    private Documento documento;
    private Contato contato;
    private LocalDate dataNascimento;
    private int scoreCredito;
    private double salario;
    private String matricula;
    
    public String getNome() {
        return nome;
    }
    /**
     * Metodo que permite alterar atributo nome
     * @param nome corresponde ao nome da PF
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Endereco getEndereco() {
        return endereco;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    public Documento getDocumento() {
        return documento;
    }
    public void setDocumento(Documento documento) {
        this.documento = documento;
    }
    public int getScoreCredito() {
        return scoreCredito;
    }
    public void setScoreCredito(int scoreCredito) {
        this.scoreCredito = scoreCredito;
    }
    public Contato getContato() {
        return contato;
    }
    public void setContato(Contato contato) {
        this.contato = contato;
    }
    public LocalDate getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public String toString(){
        return "{'Data':{'Nome':" + getNome() + "'Endereco':'[" + getEndereco() +
        "]'Documento':'" + getDocumento() +
        "]'Score':'" + getScoreCredito() +
        "]'Salario':'" + getSalario() +
        "]'Matricula':'" + getMatricula() +
        "'Contato':'[" + getContato() + "]},'sucess':'true,'message':'Dados exibidos com sucesso'";
    }
    
}
