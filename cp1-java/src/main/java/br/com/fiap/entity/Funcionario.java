package br.com.fiap.entity;

import javax.persistence.*;

@Entity
@Table(name="TAB_FUNC")
@SequenceGenerator(name="funcionario", sequenceName = "SQ_TB_FUNC", allocationSize = 1)
public class Funcionario {

    @Id
    @Column(name="id_funcionario")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "funcionario")
    private Integer idFuncionario;

    @Column(name="nome_completo", )
    protected String nomeCompleto;
    protected Integer horasTrabalhadas;
    protected Double valorHora;

    public Funcionario(String nomeCompleto, Integer horasTrabalhadas, Double valorHora) {
        this.nomeCompleto = nomeCompleto;
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHora = valorHora;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public Integer getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(Integer horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public Double getValorHora() {
        return valorHora;
    }

    public void setValorHora(Double valorHora) {
        this.valorHora = valorHora;
    }

    public Double calculaSalario(){
        Double salario = horasTrabalhadas * valorHora;
        return salario;
    }
    public void retornaInformacao(){
       System.out.println(
               "\nNome: " + getNomeCompleto() +
                       "Horas Trabalhadas: " + getHorasTrabalhadas() +
                       "Valor Hora: " + getValorHora() +
                       "Salário: " + calculaSalario());
    }

}
