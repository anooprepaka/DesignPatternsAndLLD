package SystemDesign.PubSybModelWithTopics;

public class PubSubModelWithTopics {
    public static void main(String[] args) {

        Message iphone = new Message("iphone");
        Message android = new Message("android");
        Message lambhorghini = new Message("lambhorghini");
        Message ferrari = new Message("ferrari");

        Topic tech = new Topic("Tech");
        Topic tech2 = new Topic("Tech2");
        Topic car = new Topic("car");
        Topic car2 = new Topic("car2");
        Subscriber anoop = new Subscriber("anoop");
        Subscriber another = new Subscriber("another");
        Subscriber another2 = new Subscriber("another2");
        Subscriber another3 = new Subscriber("another3");

        tech.addSubscriber(anoop);
        tech.addSubscriber(another);
        tech.addSubscriber(another2);

        tech2.addSubscriber(another3);
        car.addSubscriber(anoop);
        car.addSubscriber(another);

        car.addSubscriber(another2);
        car2.addSubscriber(another3);
        Publisher publisher = new Publisher();
        Publisher publisher2 = new Publisher();
        Publisher publisher3 = new Publisher();
        Publisher publisher4 = new Publisher();
        publisher.addTopics(tech);
        publisher.addTopics(tech2);
        publisher2.addTopics(car);
        publisher2.addTopics(car2);
        publisher.addmessage(tech,iphone);
        publisher.addmessage(tech2,android);

    }
}
