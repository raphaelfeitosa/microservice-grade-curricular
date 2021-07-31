package com.cliente.escola.gradecurricular.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.hateoas.RepresentationModel;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.List;

@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
public class CursoDto extends RepresentationModel<CursoDto> {

    private Long id;

    @NotBlank(message = "Informe o nome do curso")
    @Size(min = 10, max = 30)
    private String nome;

    @NotBlank(message = "Informe o codigo do curso")
    @Size(min = 2, max = 5)
    private String codigo;

    private List<Long> materias;
}
