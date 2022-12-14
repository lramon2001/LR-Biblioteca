package br.com.lucasramon.lrbiblioteca.services;

import br.com.lucasramon.lrbiblioteca.models.Emprestimo;

public interface NotificacaoService {
    
    void notificar(Emprestimo emprestimo);
}
