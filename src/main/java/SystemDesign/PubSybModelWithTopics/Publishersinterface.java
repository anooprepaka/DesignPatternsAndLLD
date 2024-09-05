package SystemDesign.PubSybModelWithTopics;

import java.util.ArrayList;

public interface Publishersinterface {


    public void addTopics(Topic topic);

    public void removeTopic(Topic topic);

    public void addmessage(Topic topic, Message message);


}
