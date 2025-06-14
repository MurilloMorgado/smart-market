package morgado.com.br.smart_market.framework.output;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import morgado.com.br.smart_market.application.output.MarcaOutput;
import morgado.com.br.smart_market.domain.models.Marca;
import morgado.com.br.smart_market.framework.output.jpa.MarcaRepository;

@Service
@RequiredArgsConstructor
public class MarcaFramework implements MarcaOutput {

  private MarcaRepository marcaRepository;

  @Override
  public List<Marca> listarMarcas() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'listarMarcas'");
  }

  @Override
  public Marca buscarMarca(Long idMarca) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'buscarMarca'");
  }

  @Override
  public Long criarMarca(Marca marca) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'criarMarca'");
  }

  @Override
  public void atualizarMarca(Marca marca, Long idMarca) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'atualizarMarca'");
  }

  @Override
  public void deletarMarca(Long idMarca) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'deletarMarca'");
  }
}
