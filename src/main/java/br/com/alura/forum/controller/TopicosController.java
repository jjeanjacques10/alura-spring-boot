package br.com.alura.forum.controller;

import br.com.alura.forum.controller.dto.TopicoDto;
import br.com.alura.forum.model.Topico;
import br.com.alura.forum.repository.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TopicosController {

    @Autowired
    private TopicRepository topicoRepository;

    @RequestMapping("/topicos")
    public List<TopicoDto> lista(){
        List<Topico> topicos = topicoRepository.findAll();

        return TopicoDto.converter(topicos);
    }
}
