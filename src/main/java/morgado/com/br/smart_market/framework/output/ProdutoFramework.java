package morgado.com.br.smart_market.framework.output;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import morgado.com.br.smart_market.application.output.ProdutoOutput;
import morgado.com.br.smart_market.domain.models.Produto;
import morgado.com.br.smart_market.framework.mapper.ProdutoMapper;
import morgado.com.br.smart_market.framework.output.jpa.ProdutoRepository;

@Service
@RequiredArgsConstructor
public class ProdutoFramework implements ProdutoOutput {

  private final ProdutoRepository produtoRepository;
  private final ProdutoMapper produtoMapper;

  @Override
  public List<Produto> listarProdutos() {

    return produtoRepository.findAll().stream().map(produtoMapper::toDomain).collect(Collectors.toList());

  }

}
