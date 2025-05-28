package morgado.com.br.smart_market.framework.output;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import morgado.com.br.smart_market.application.output.CompraOutput;
import morgado.com.br.smart_market.domain.models.Compra;
import morgado.com.br.smart_market.framework.mapper.CompraMapper;
import morgado.com.br.smart_market.framework.models.CompraDB;
import morgado.com.br.smart_market.framework.output.jpa.CompraRepository;

@RequiredArgsConstructor
@Service
public class CompraFramework implements CompraOutput {

  private final CompraRepository compraRepository;
  private final CompraMapper compraMapper;

  @Override
  public List<Compra> listarCompras() {

    return compraRepository.findAll().stream().map(compraMapper::toDomain).collect(Collectors.toList());

  }

  @Override
  public Compra buscarCompra(Long idCompra) {

    return compraRepository.findById(idCompra).map(compraMapper::toDomain)
        .orElseThrow(() -> new InternalError("Compra não encontrada"));

  }

  @Override
  public Compra criarCompra(Compra compra) {

    CompraDB compraDB = compraMapper.toEntity(compra);

    return compraMapper.toDomain(compraRepository.save(compraDB));
  }

}
