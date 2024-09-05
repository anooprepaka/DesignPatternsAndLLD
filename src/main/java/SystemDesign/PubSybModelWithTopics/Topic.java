package SystemDesign.PubSybModelWithTopics;

import lombok.Getter;

import java.util.*;

public class Topic {

    @Getter
    private String  name;
    private List<Subscriber> subscribersList;
    public Topic(String name) {
        this.name = name;
        this.subscribersList = new ArrayList<>();
    }
    public void addSubscriber(Subscriber subscriber)
    {
        subscribersList.add(subscriber);
    }
    public void publish(Message message) {
        for(Subscriber subscriber : subscribersList)
        {
            subscriber.onMessage(message);
        }
    }

}
