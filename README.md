# Simulate Subscribing to Channel

Simplified demonstration of the issue https://github.com/bitrich-info/xchange-stream/issues/8#issuecomment-318566827 

NOTES:
- Not really creating any streams, not using Observables
- Calling Marker Data service with currenly pair only:
```
	streamingMDService.getTicker(currencyPair);
```

Output (running checkit.Main in IntelliJ IDEA):

```
Going to subscribe to channel for BTC-USD ...
Sent subscribe message: { event: subscribe, channel: BTC-USD }
Ticker: Here is a Ticker for channel BTC-USD
```
