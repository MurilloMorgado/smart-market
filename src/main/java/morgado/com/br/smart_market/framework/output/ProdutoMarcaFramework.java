package morgado.com.br.smart_market.framework.output;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import morgado.com.br.smart_market.application.output.ProdutoMarcaOutput;
import morgado.com.br.smart_market.domain.models.ProdutoMarca;
import morgado.com.br.smart_market.framework.output.jpa.ProdutoMarcaRepository;

@Service
@RequiredArgsConstructor
public class ProdutoMarcaFramework implements ProdutoMarcaOutput {
  
  private ProdutoMarcaRepository produtoMarcaRepository;

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
