package ESIIIFactoryATS.controller;

import ESIIIFactoryATS.model.Funcionario;
import ESIIIFactoryATS.model.FuncionarioTempoParcial;

public class CadastroTempoParcial extends Cadastro {
  @Override
  public Funcionario inicializaFuncionario() {
    FuncionarioTempoParcial ftp = new FuncionarioTempoParcial();
    int id = (int) ((Math.random() * 1001) + 1000);
    ftp.setId(id);
    ftp.setNome("Valeska Popozuda");
    ftp.setSalario(2200);
    ftp.setHoraEntrada(20);
    ftp.setHoraSaida(22);
    return ftp;
  }
}