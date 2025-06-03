package morgado.com.br.smart_market.framework.output;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import morgado.com.br.smart_market.application.output.SupermercadoOutput;
import morgado.com.br.smart_market.domain.models.Supermercado;
import morgado.com.br.smart_market.framework.mapper.SupermercadoMapper;
import morgado.com.br.smart_market.framework.output.jpa.SupermercadoRepository;

@Service
@RequiredArgsConstructor
public class SupermercadoFramework implements SupermercadoOutput {

  private final SupermercadoRepository supermercadoRepository;
  private final SupermercadoMapper supermercadoMapper;

  @Override
  public List<Supermercado> listarSupermercado() {

    return supermercadoRepository.findAll().stream().map(supermercadoMapper::toDomain).collect(Collectors.toList());

  }

}
