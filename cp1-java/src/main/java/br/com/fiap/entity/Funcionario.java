package br.com.fiap.entity;

import javax.persistence.*;

@Entity
@Table(name="TAB_FUNCIONARIO")
@SequenceGenerator(name="funcionario", sequenceName = "SQ_TB_FUNC", allocationSize = 1)
public class Funcionario {

    // atributo para persistência
    @Id
    @Column(name="id_funcionario")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "funcionario")
    private Integer idFuncionario;

    // atributos herdáveis
    @Column(name="nome_completo", nullable = false, length = 100 )
    protected String nomeCompleto;
    @Column(name="horas_trabalhadas", nullable = false, length = 2)
    protected Integer horasTrabalhadas;
    @Column(name="valor_hora", nullable = false, precision = 10, scale = 2)
    protected Double valorHora;

    // atributo para persistência
    @Column(name="nivelProfissional", nullable = false, scale = 20)
    private NivelProfissional nivelProfissional;

    public Funcionario(String nomeCompleto, Integer horasTrabalhadas, Double valorHora, NivelProfissional nivelProfissional) {
        super();
        this.nomeCompleto = nomeCompleto;
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHora = valorHora;
        this.nivelProfissional = nivelProfissional;
    }

    public Funcionario() {}

    public Integer getIdFuncionario() { return idFuncionario; }

    public void setIdFuncionario(Integer idFuncionario) { this.idFuncionario = idFuncionario; }

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

    public NivelProfissional getNivelProfissional() { return nivelProfissional; }

    public void setNivelProfissional(NivelProfissional nivelProfissional) { this.nivelProfissional = nivelProfissional; }

    public Double calculaSalario(){
        return ((getHorasTrabalhadas() * getValorHora())* 30);
    }
    public void retornaInformacao(){
       System.out.println(
               "\nNome: " + getNomeCompleto() +
                       "\nHoras Trabalhadas: " + getHorasTrabalhadas() + "h" +
                       "\nValor Hora: R$" + getValorHora() +
                       "\nSalário: R$" + calculaSalario() +
                       "\nTipo: " + getNivelProfissional()
       );

    }

}
