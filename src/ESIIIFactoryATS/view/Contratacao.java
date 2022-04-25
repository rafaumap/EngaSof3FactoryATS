package ESIIIFactoryATS.view;

import ESIIIFactoryATS.controller.CadastroEstagiario;
import ESIIIFactoryATS.controller.CadastroTempoIntegral;
import ESIIIFactoryATS.controller.CadastroTempoParcial;
import ESIIIFactoryATS.controller.CadastroTemporario;
import ESIIIFactoryATS.model.Funcionario;

public class Contratacao {
  public static void main(String[] args) {
    CadastroTempoIntegral cti = new CadastroTempoIntegral();
    CadastroTempoParcial ctp = new CadastroTempoParcial();
    CadastroTemporario ct = new CadastroTemporario();
    CadastroEstagiario ce = new CadastroEstagiario();

    Funcionario funcionario;
    int tipoFuncionario = 4;

    switch (tipoFuncionario) {
      case 1: {
        funcionario = cti.inicializaFuncionario();
        break;
      }
      case 2: {
        funcionario = ctp.inicializaFuncionario();
        break;
      }
      case 3: {
        funcionario = ct.inicializaFuncionario();
        break;
      }
      case 4: {
        funcionario = ce.inicializaFuncionario();
        break;
      }
      default: {
        funcionario = ce.inicializaFuncionario();
        break;
      }
    }

    System.out.println(funcionario);
  }
}