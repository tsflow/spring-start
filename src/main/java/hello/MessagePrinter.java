package hello;

import org.springframework.stereotype.Component;

/**
 *打印机类
 */
@Component
public class MessagePrinter {

    public MessagePrinter() {
        System.out.println("MessagePrinter 初始化！");
    }

    private MessageService service;

    public void setService(MessageService service) {
        this.service = service;
    }

    public  void PrintMessage(){
        System.out.println(this.service.GetMessage());
    }
}
