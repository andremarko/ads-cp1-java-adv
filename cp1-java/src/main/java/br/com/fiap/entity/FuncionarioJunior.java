package br.com.fiap.entity;

public class FuncionarioJunior extends Funcionario{

    private Integer bonusMeta;

    public FuncionarioJunior(String nomeCompleto, Integer horasTrabalhadas, Double valorHora, String nivelProfissional, Integer bonusMeta) {
        super(nomeCompleto, horasTrabalhadas, valorHora, nivelProfissional);
        this.bonusMeta = bonusMeta;
    }

    @Override
    public Double calculaSalario(){
        return ((getHorasTrabalhadas() * 30) * getValorHora()) + bonusMeta;
    }

    public Integer getBonusMeta() {
        return bonusMeta;
    }

    public void setBonusMeta(Integer bonusMeta) {
        this.bonusMeta = bonusMeta;
    }
}
