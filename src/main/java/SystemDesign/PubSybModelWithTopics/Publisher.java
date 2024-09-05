package SystemDesign.PubSybModelWithTopics;

import java.util.ArrayList;
import java.util.List;

public class Publisher implements Publishersinterface{
    private List<Topic> topics;

    public Publisher(){
        topics = new ArrayList<>();
    }

    @Override
    public void addTopics(Topic topic) {
        topics.add(topic);
    }

    @Override
    public void removeTopic(Topic topic) {
        if(topics.contains(topic)){
            topics.remove(topic);
        }
    }

    @Override
    public void addmessage(Topic topic, Message message) {
            if(!topics.contains(topic)){
                System.out.println(topic.getName());
                return;
            }
            topic.publish(message);
    }
}
