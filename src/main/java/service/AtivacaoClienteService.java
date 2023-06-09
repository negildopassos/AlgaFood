package service;

import modelo.Cliente;
import notificador.NotificadorEmail;


public class AtivacaoClienteService {
    private NotificadorEmail notificador;

    public AtivacaoClienteService(NotificadorEmail notificador) {
        this.notificador = notificador; 
    }

    public void ativar(Cliente cliente) {
        cliente.ativar();

        notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
    }
}
