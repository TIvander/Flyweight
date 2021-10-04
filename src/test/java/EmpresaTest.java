import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class EmpresaTest {

    @Test
    void deveRetornarFuncionarios() {
        Empresa empresa = new Empresa();

        empresa.contratar("Carlos", "Analista de Suporte", 4000f);
        empresa.contratar("Julia", "Analista de Suporte", 4000f);
        empresa.contratar("Aline", "Analista de Suporte", 4000f);
        empresa.contratar("Marcelo", "Analista de Infra", 3500f);
        empresa.contratar("Humberto", "Analista de Infra", 3500f);
        empresa.contratar("Doisberto", "Desenvolvedor", 4500f);
        empresa.contratar("Tresberto", "Desenvolvedor", 4500f);
        empresa.contratar("Marco", "Desenvolvedor", 4500f);
        empresa.contratar("Ricardo", "Desenvolvedor", 4500f);

        List<String> exibir = Arrays.asList(
                "Funcionario{nome='Carlos'}",
                "Funcionario{nome='Julia'}",
                "Funcionario{nome='Aline'}",
                "Funcionario{nome='Marcelo'}",
                "Funcionario{nome='Humberto'}",
                "Funcionario{nome='Doisberto'}",
                "Funcionario{nome='Tresberto'}",
                "Funcionario{nome='Marco'}",
                "Funcionario{nome='Ricardo'}"
        );
        assertEquals(exibir, empresa.obterFuncionarios());
    }

    @Test
    void deveRetornarCargos() {
        Empresa empresa = new Empresa();

        empresa.contratar("Carlos", "Analista de Suporte", 4000f);
        empresa.contratar("Julia", "Analista de Suporte", 4000f);
        empresa.contratar("Aline", "Analista de Suporte", 4000f);
        empresa.contratar("Marcelo", "Analista de Infra", 3500f);
        empresa.contratar("Humberto", "Analista de Infra", 3500f);
        empresa.contratar("Doisberto", "Desenvolvedor", 4500f);
        empresa.contratar("Tresberto", "Desenvolvedor", 4500f);
        empresa.contratar("Marco", "Desenvolvedor", 4500f);
        empresa.contratar("Ricardo", "Desenvolvedor", 4500f);

        assertEquals(3, CargoFactory.getTotalCargos());
    }
}