package farm.voll.api.endereco;

import jakarta.validation.constraints.NotBlank;

public record DadosCadastroEndereco(
        @NotBlank
        String logradouro,
        @NotBlank
        String numero,
        @NotBlank
        String complemento,
        @NotBlank
        String bairro,
        @NotBlank
        String cidade,
        @NotBlank
        String uf,
        @NotBlank
        String cep,
        @NotBlank
        String origem,
        @NotBlank
        String destino,
        @NotBlank
        String cliente
) {
}
