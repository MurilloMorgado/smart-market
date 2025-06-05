package morgado.com.br.smart_market.application.service;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import morgado.com.br.smart_market.application.input.ProdutoMarcaInput;
import morgado.com.br.smart_market.application.output.ProdutoMarcaOutput;
import morgado.com.br.smart_market.domain.models.ProdutoMarca;

@Service
@RequiredArgsConstructor
public class ProdutoMarcaApplication implements ProdutoMarcaInput {

  private ProdutoMarcaOutput produtoMarcaOutput;

  @Override
  public List<ProdutoMarca> listarMarcas() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'listarMarcas'");
  }

  @Override
  public ProdutoMarca buscarMarca(Long idProdutoMarca) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'buscarMarca'");
  }

  @Override
  public Long criarMarca(ProdutoMarca produtoMarca) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'criarMarca'");
  }

  @Override
  public void atualizarMarca(ProdutoMarca produtoMarca, Long idProdutoMarca) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'atualizarMarca'");
  }

  @Override
  public void deletarMarca(Long idProdutoMarca) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'deletarMarca'");
  }

}
