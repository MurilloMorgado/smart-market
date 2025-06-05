package morgado.com.br.smart_market.application.input;

import java.util.List;

import morgado.com.br.smart_market.domain.models.ProdutoMarca;

public interface ProdutoMarcaInput {

  List<ProdutoMarca> listarMarcas();

  ProdutoMarca buscarMarca(Long idProdutoMarca);

  Long criarMarca(ProdutoMarca produtoMarca);

  void atualizarMarca(ProdutoMarca produtoMarca, Long idProdutoMarca);

  void deletarMarca(Long idProdutoMarca);
}
