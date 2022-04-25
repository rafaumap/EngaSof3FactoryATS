package ESIIIFactoryATS.controller;

import ESIIIFactoryATS.model.Funcionario;
import ESIIIFactoryATS.model.FuncionarioEstagiario;

public class CadastroEstagiario extends Cadastro {
  @Override
  public Funcionario inicializaFuncionario() {
    FuncionarioEstagiario fe = new FuncionarioEstagiario();
    int id = (int) ((Math.random() * 1001) + 1000);
    fe.setId(id);
    fe.setNome("Valeska Popozuda");
    fe.setSalario(2200);
    fe.setInstituicao("FATEC ZL");
    return fe;
  }
}