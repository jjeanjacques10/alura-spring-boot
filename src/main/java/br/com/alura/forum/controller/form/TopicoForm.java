package br.com.alura.forum.controller.form;

import br.com.alura.forum.model.Curso;
import br.com.alura.forum.model.Topico;
import br.com.alura.forum.repository.CursoRepository;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class TopicoForm {

    @NotNull @NotEmpty() @Length(min = 5)
    private String titulo;
    @NotNull @NotEmpty() @Length(min = 5)
    private String mensagem;
    @NotNull @NotEmpty()
    private String nomeCurso;

    public Topico converter(CursoRepository cursoRepository) {
        Curso curso = cursoRepository.findByNome(nomeCurso);
        return new Topico(titulo, mensagem, curso);
    }
}
