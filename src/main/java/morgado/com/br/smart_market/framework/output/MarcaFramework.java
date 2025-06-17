package morgado.com.br.smart_market.framework.output;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import morgado.com.br.smart_market.application.output.MarcaOutput;
import morgado.com.br.smart_market.domain.models.Marca;
import morgado.com.br.smart_market.framework.models.MarcaDB;
import morgado.com.br.smart_market.framework.output.jpa.MarcaRepository;

@Service
@RequiredArgsConstructor
public class MarcaFramework implements MarcaOutput {

  private final MarcaRepository marcaRepository;

  @Override
  public List<Marca> listarMarcas() {

    List<Marca> a = marcaRepository.findAll().stream().map(MarcaDB::toDomain).collect(Collectors.toList());
    return a;
  }

  @Override
  public Marca buscarMarca(Long idMarca) {

    return marcaRepository.findById(idMarca).map(MarcaDB::toDomain)
        .orElseThrow(() -> new InternalError("Marca não encontrada"));
  }

  @Override
  public Long criarMarca(Marca marca) {

    MarcaDB marcaDB = new MarcaDB(marca);

    return marcaRepository.save(marcaDB).getId();

  }

  @Override
  public void atualizarMarca(Marca marca, Long idMarca) {
    
    Marca marcaBuscada = buscarMarca(idMarca);
    MarcaDB marcaBuscadaDB = new MarcaDB(marcaBuscada);

    MarcaDB marcaDB = new MarcaDB(marca);

    BeanUtils.copyProperties(marcaDB, marcaBuscadaDB, "id");
    marcaRepository.save(marcaBuscadaDB);

  }

  @Override
  public void deletarMarca(Long idMarca) {
    
    marcaRepository.deleteById(idMarca);
  }
}
