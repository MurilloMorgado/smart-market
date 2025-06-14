package morgado.com.br.smart_market.application.output;

import java.util.List;

import morgado.com.br.smart_market.domain.models.ProdutoMarca;

public interface ProdutoMarcaOutput {

  List<ProdutoMarca> listarMarcas();

  ProdutoMarca buscarMarca(Long idProdutoMarca);

  Long criarMarca(ProdutoMarca produtoMarca);

  void atualizarMarca(ProdutoMarca produtoMarca, Long idProdutoMarca);

  void deletarMarca(Long idProdutoMarca);

}
