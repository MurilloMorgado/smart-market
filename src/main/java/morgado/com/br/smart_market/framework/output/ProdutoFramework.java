package morgado.com.br.smart_market.framework.output;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import morgado.com.br.smart_market.application.output.ProdutoOutput;
import morgado.com.br.smart_market.domain.models.Produto;
import morgado.com.br.smart_market.framework.mapper.ProdutoMapper;
import morgado.com.br.smart_market.framework.models.ProdutoDB;
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

  @Override
  public Produto buscarProduto(Long idProduto) {

    return produtoRepository.findById(idProduto).map(produtoMapper::toDomain)
        .orElseThrow(() -> new InternalError("Produto não encontrado"));
  }

  @Override
  public Produto criarProduto(Produto produto) {
    ProdutoDB produtoDB = produtoMapper.toEntity(produto);

    ProdutoDB salvo = produtoRepository.save(produtoDB);
    return produtoMapper.toDomain(salvo);
  }

  @Override
  public void atualizarProduto(Produto produto, Long idProduto) {

    ProdutoDB produtoDBBuscado = produtoMapper.toEntity(buscarProduto(idProduto));

    ProdutoDB produtoRequest = produtoMapper.toEntity(produto);

    BeanUtils.copyProperties(produtoRequest, produtoDBBuscado, "id");

    produtoRepository.save(produtoDBBuscado);

  }

  @Override
  public void deletarProduto(Long idProduto) {
    produtoRepository.deleteById(idProduto);
  }

}
