package br.com.fiap.view;

import br.com.fiap.entity.FuncionarioJunior;
import br.com.fiap.entity.FuncionarioPleno;
import br.com.fiap.entity.NivelProfissional;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        FuncionarioPleno func = new FuncionarioPleno("André", 8,
                10.0, NivelProfissional.PLENO, 700.0);

        func.retornaInformacao();
    }
}
