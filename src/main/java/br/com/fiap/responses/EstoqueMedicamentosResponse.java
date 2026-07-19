package br.com.fiap.responses;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import br.com.fiap.dtos.EstoqueMedicamentosDTO;

public record EstoqueMedicamentosResponse(
     @JsonProperty("parametros") List<EstoqueMedicamentosDTO> parametros
) {}
