package morgado.com.br.smart_market.application.output;

import java.util.List;

import morgado.com.br.smart_market.domain.models.Marca;

public interface MarcaOutput {
  
  List<Marca> listarMarcas();

  Marca buscarMarca(Long idMarca);

  Long criarMarca(Marca marca);

  void atualizarMarca(Marca marca, Long idMarca);

  void deletarMarca(Long idMarca);
}
