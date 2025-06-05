package morgado.com.br.smart_market.application.service;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import morgado.com.br.smart_market.application.input.MarcaInput;
import morgado.com.br.smart_market.application.output.MarcaOutput;
import morgado.com.br.smart_market.domain.models.Marca;

@Service
@RequiredArgsConstructor
public class MarcaAppliacation implements MarcaInput {

  private MarcaOutput marcaOutput;

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
