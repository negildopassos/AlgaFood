package com.ngtech.algafood;

import notificador.NotificadorEmail;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import service.AtivacaoClienteService;


public class AlgaConfig {


    @Bean
    public NotificadorEmail notificadorEmail(){
        NotificadorEmail notificador =  new NotificadorEmail("smtp.algamail.com.br");
        notificador.setCaixaAlta(true);
        return notificador;
    }


    @Bean
    public AtivacaoClienteService ativacaoClienteService() {
        return new AtivacaoClienteService(notificadorEmail());
    }
}
