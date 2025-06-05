package morgado.com.br.smart_market.framework.output;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import morgado.com.br.smart_market.application.output.ProdutoMarcaOutput;
import morgado.com.br.smart_market.framework.output.jpa.ProdutoMarcaRepository;

@Service
@RequiredArgsConstructor
public class ProdutoMarcaFramework implements ProdutoMarcaOutput {
  
  private ProdutoMarcaRepository produtoMarcaRepository;
}
