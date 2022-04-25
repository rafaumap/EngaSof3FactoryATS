package ESIIIFactoryATS.model;

public class FuncionarioTempoIntegral extends Funcionario {
  private int bancoDeHoras;

  public int getBancoDeHoras() {
    return this.bancoDeHoras;
  }

  public void setBancoDeHoras(int bancoDeHoras) {
    this.bancoDeHoras = bancoDeHoras;
  }

  @Override
  public String toString() {
    return "FuncionarioTempoIntegral [bancoDeHoras=" + bancoDeHoras + "]";
  }
}