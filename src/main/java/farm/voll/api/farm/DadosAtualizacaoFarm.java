package farm.voll.api.farm;

import farm.voll.api.endereco.DadosCadastroEndereco;
import jakarta.validation.constraints.NotNull;

public record DadosAtualizacaoFarm(
        @NotNull
        Long id,

        String nome,

        DadosCadastroEndereco endereco) {
}
