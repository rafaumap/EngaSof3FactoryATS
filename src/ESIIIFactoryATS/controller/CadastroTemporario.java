package ESIIIFactoryATS.controller;

import ESIIIFactoryATS.model.Funcionario;
import ESIIIFactoryATS.model.FuncionarioTemporario;

public class CadastroTemporario extends Cadastro {
  @Override
  public Funcionario inicializaFuncionario() {
    FuncionarioTemporario ft = new FuncionarioTemporario();
    int id = (int) ((Math.random() * 1001) + 1000);
    ft.setId(id);
    ft.setNome("Robson Santos");
    ft.setSalario(2200);
    ft.setDia(01);
    ft.setMes(04);
    ft.setAno(2023);
    return ft;
  }
}