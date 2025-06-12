package morgado.com.br.smart_market.framework.output;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import morgado.com.br.smart_market.application.output.SupermercadoOutput;
import morgado.com.br.smart_market.domain.models.Supermercado;
import morgado.com.br.smart_market.framework.mapper.SupermercadoMapper;
import morgado.com.br.smart_market.framework.models.SupermercadoDB;
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

  @Override
  public Supermercado buscarSupermercado(Long idSupermercado) {

    return supermercadoRepository.findById(idSupermercado).map(supermercadoMapper::toDomain)
        .orElseThrow(() -> new InternalError("Supermercado não encontrdo"));

  }

  @Override
  public Supermercado criarSupermercado(Supermercado supermercado) {
    
    SupermercadoDB supermercadoDB = new SupermercadoDB(supermercado);
    return supermercadoMapper.toDomain(supermercadoRepository.save(supermercadoDB));

  }

  @Override
  public void atualizarSupermercado(Long idSupermercado, Supermercado supermercado) {
    
    Supermercado supermercadoBanco = buscarSupermercado(idSupermercado);

    BeanUtils.copyProperties(supermercado, supermercadoBanco, "id");

    SupermercadoDB supermercadoDB = new SupermercadoDB(supermercadoBanco);

    supermercadoRepository.save(supermercadoDB);

  }

  @Override
  public void deletarSupermercado(Long idSupermercado) {
    
    supermercadoRepository.deleteById(idSupermercado);
  }

}
