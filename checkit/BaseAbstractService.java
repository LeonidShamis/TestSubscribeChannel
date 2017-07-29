package checkit;

public abstract class BaseAbstractService {

    private final String uri;

    BaseAbstractService(String apiUrl) {
        this.uri = apiUrl;
    }

    public abstract String getSubscribeMessage(String channelName);

    public String subscribeChannel(String channelName) {
        String message = getSubscribeMessage(channelName);
        System.out.println("Sent subscribe message: { " + message + " }");
        return channelName;
    }
}