package checkit;

public class MyStreamingMarketDataService implements StreamingMarketDataService {

    private final MyStreamingService service;

    MyStreamingMarketDataService(MyStreamingService service) {
        this.service = service;
    }

    @Override
    public String getTicker(String currencyPair, Object... args) {
        // Use currency pair for channel name
        String channelName = currencyPair;
        String subscribedChannel = service.subscribeChannel(channelName);
        return "Here is a Ticker for channel " + subscribedChannel;
    }
}
