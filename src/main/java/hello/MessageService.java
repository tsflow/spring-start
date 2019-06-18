package hello;

import org.springframework.stereotype.Component;

/*消息服务*/
@Component
public class MessageService {

    public MessageService() {
        System.out.println("MessageService初始化");
    }

    /**
     * 执行打印功能
     * @return 返回要打印的值
     */
    public  String GetMessage(){
        return "Hello World!";
    }
}
