package com.okcoin.commons.okex.open.api.test.ws.spot;

import com.okcoin.commons.okex.open.api.test.ws.spot.config.WebSocketClient;
import com.okcoin.commons.okex.open.api.test.ws.spot.config.WebSocketConfig;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

/**
 * public channel
 *
 * @author oker
 * @create 2019-06-12 14:45
 **/
public class SpotPublicChannelTest {

    private static final WebSocketClient webSocketClient = new WebSocketClient();

    @Before
    public void connect() {
        WebSocketConfig.publicConnect(webSocketClient);
    }

    @After
    public void close() {
        webSocketClient.closeConnection();
    }

    /**
     * 行情频道 ticker
     */
    @Test
    public void tickerChannel() {
        //创建一个list集合，添加要订阅的频道名称
        final ArrayList<String> list = new ArrayList<>();
        list.add("spot/ticker:BTC-USDT");
        list.add("spot/ticker:ETH-USDT");
        webSocketClient.subscribe(list);
        //为保证测试方法不停，需要让线程延迟
        try {
            Thread.sleep(10000000);
        } catch (final Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * k线频道 kline
     */
    @Test
    public void klineChannel() {
        //创建一个list集合，添加要订阅的频道名称
        final ArrayList<String> list = new ArrayList<>();
        list.add("spot/candle60s:BTC-USDT");
        list.add("spot/candle180s:ETH-USDT");
        webSocketClient.subscribe(list);
        //为保证测试方法不停，需要让线程延迟
        try {
            Thread.sleep(10000000);
        } catch (final Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 成交频道 trade
     */
    @Test
    public void tradeChannel() {
        //创建一个list集合，添加要订阅的频道名称
        final ArrayList<String> list = new ArrayList<>();
        list.add("spot/trade:BTC-USDT");
        list.add("spot/trade:ETH-USDT");
        webSocketClient.subscribe(list);
        //为保证测试方法不停，需要让线程延迟
        try {
            Thread.sleep(10000000);
        } catch (final Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 5档深度 depth5
     */
    @Test
    public void depth5Channel() {
        //创建一个list集合，添加要订阅的频道名称
        final ArrayList<String> list = new ArrayList<>();
        list.add("spot/depth5:BTC-USDT");
        list.add("spot/depth5:ETH-USDT");
        webSocketClient.subscribe(list);
        //为保证测试方法不停，需要让线程延迟
        try {
            Thread.sleep(10000000);
        } catch (final Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 深度 depth
     */
    @Test
    public void depthChannel() {
        //创建一个list集合，添加要订阅的频道名称
        final ArrayList<String> list = new ArrayList<>();
        list.add("spot/depth:BTC-USDT");
        list.add("spot/depth:ETH-USDT");
        webSocketClient.subscribe(list);
        //为保证测试方法不停，需要让线程延迟
        try {
            Thread.sleep(10000000);
        } catch (final Exception e) {
            e.printStackTrace();
        }
    }

}
