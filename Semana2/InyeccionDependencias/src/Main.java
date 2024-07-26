
public class Main {
    public static void main(String[] args) {
        // Crear la instancia de la implementación del servicio
        MessageService emailService = new EmailService();
        MessageService smsService = new SMS_Service();

        // Inyectar la dependencia en MessageProcessor a través del constructor
        MessageProcessor messageProcessorMail = new MessageProcessor(emailService);
        MessageProcessor messageProcessorSMS = new MessageProcessor(smsService);


        // Usar MessageProcessor para enviar un mensaje
        messageProcessorMail.processMessage("Hello, how are you?", "persona@gmail.com");
        messageProcessorSMS.processMessage("Hello Roy!","5512345678");
    }
}

