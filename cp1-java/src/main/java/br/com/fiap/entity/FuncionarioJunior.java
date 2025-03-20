package br.com.fiap.entity;

public class FuncionarioJunior extends Funcionario{

    public FuncionarioJunior(String nomeCompleto, Integer horasTrabalhadas, Double valorHora) {
        super(nomeCompleto, horasTrabalhadas, valorHora);
    }

    @Override
    public Double calculaSalario(){
        return getHorasTrabalhadas() * getValorHora();
    }

    @Override
    public void retornaInformacao(){
        System.out.println(
                        "\nNome: " + getNomeCompleto() +
                        "\nHoras Trabalhadas: " + getHorasTrabalhadas() +
                        "\nValor Hora: " + getValorHora() +
                        "\nSalário: " + calculaSalario());
    }

}
