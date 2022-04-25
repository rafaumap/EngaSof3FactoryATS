package ESIIIFactoryATS.controller;

import ESIIIFactoryATS.model.Funcionario;
import ESIIIFactoryATS.model.FuncionarioTempoIntegral;

public class CadastroTempoIntegral extends Cadastro {
  @Override
  public Funcionario inicializaFuncionario() {
    FuncionarioTempoIntegral fti = new FuncionarioTempoIntegral();
    int id = (int) ((Math.random() * 1001) + 1000);
    fti.setId(id);
    fti.setNome("Valeska Popozuda");
    fti.setSalario(2200);
    fti.setBancoDeHoras(2);
    return fti;
  }
}