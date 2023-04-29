package com.ngtech.algafood;

import notificador.Notificador;
import notificador.NotificadorEmail;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import service.AtivacaoClienteService;

@Configuration
public class ServiceConfig {
    @Bean
    public AtivacaoClienteService ativacaoClienteService(Notificador notificador) {
        return new AtivacaoClienteService((NotificadorEmail) notificador);
    }
}
