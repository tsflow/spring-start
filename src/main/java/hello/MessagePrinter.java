package hello;

/**
 *打印机类
 */
public class MessagePrinter {

    private MessageService service;

    public void setService(MessageService service) {
        this.service = service;
    }

    public  void PrintMessage(){
        System.out.println(this.service.GetMessage());
    }
}
