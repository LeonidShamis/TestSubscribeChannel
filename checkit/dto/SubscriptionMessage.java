package checkit.dto;

public class SubscriptionMessage {

    public static final String EVENT = "event";
    public static final String CHANNEL = "channel";

    private String event;
    private String channel;

    public SubscriptionMessage(String event, String channel) {
        this.event = event;
        this.channel = channel;
    }

    public String getEvent() {
        return event;
    }

    public String getChannel() {
        return channel;
    }

    public String toString() {
        String returnStr = ""
                            + EVENT + ": " + getEvent() + ", "
                            + CHANNEL + ": " + getChannel();
        return returnStr;
    }
}
