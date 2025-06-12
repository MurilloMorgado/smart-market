package morgado.com.br.smart_market.application.input;

import java.util.List;

import morgado.com.br.smart_market.domain.models.Supermercado;

public interface SupermercadoInput {
  
  List<Supermercado> listarSupermercado();

  Supermercado buscarSupermercado(Long idSupermercado);

  Supermercado criarSupermercado(Supermercado supermercado);

  void atualizarSupermercado(Long idSupermercado, Supermercado supermercado);

  void deletarSupermercado(Long idSupermercado);
}
