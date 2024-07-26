
//clase para realizar la inyección
public class MessageProcessor {
    private MessageService messageService;

    // Constructor para la inyección de dependencias
    public MessageProcessor(MessageService messageService) {
        this.messageService = messageService;
    }
    
    //Invocará el metodo de la interfaz que estará sobrescrito 
    //por cada dependencia
    public void processMessage(String message, String recipient) {
        messageService.sendMessage(message, recipient);
    }
}

