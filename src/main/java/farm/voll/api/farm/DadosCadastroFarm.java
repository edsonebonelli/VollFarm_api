package farm.voll.api.farm;

import farm.voll.api.endereco.DadosCadastroEndereco;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DadosCadastroFarm(
        @NotBlank
        String nome,
        @NotBlank
        @Email
        String email,
        @NotBlank
        String telefone,
        @NotBlank
        String password,
        @NotNull
        Especialidade especialidade,
        @NotNull @Valid
        DadosCadastroEndereco endereco
) {
}
