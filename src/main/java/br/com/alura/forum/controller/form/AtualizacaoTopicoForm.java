package br.com.alura.forum.controller.form;

import br.com.alura.forum.model.Topico;
import br.com.alura.forum.repository.TopicoRepository;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Getter @Setter
public class AtualizacaoTopicoForm {

    @NotNull
    @NotEmpty() @Length(min = 5)
    private String titulo;
    @NotNull @NotEmpty() @Length(min = 5)
    private String mensagem;

    public Topico atualizar(Long id, TopicoRepository topicoRepository) {
        Topico topico = topicoRepository.getOne(id);

        topico.setTitulo(this.titulo);
        topico.setMensagem(this.mensagem);

        return topico;
    }
}
