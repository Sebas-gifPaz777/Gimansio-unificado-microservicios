package gimenacio.microservice.entrenadores.service;


import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NotificacionConsumer {

    @RabbitListener(queues = "notificaciones.cola")
    public void recibirNotificacion(String notificacion) {
        System.out.println(notificacion);
    }
}