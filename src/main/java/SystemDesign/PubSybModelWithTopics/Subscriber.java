package SystemDesign.PubSybModelWithTopics;

public class Subscriber {
    private String name;
    public Subscriber(String name) {
        this.name = name;

    }
    public String getName()
    {
        return name;
    }
    void onMessage(Message message) {
        System.out.println("Message received: " + message.getMessage()+ this.getName() );
    }
}
