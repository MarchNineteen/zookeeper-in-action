package com.wyb.zk.client;

import org.I0Itec.zkclient.ZkClient;
import org.junit.Before;

public class ZkclientTest {
    ZkClient zkClient;

    @Before
    public void init() {
        zkClient = new ZkClient("192.168.0.149:2181", 5000, 5000);
    }

    public void createTest() {
    }
}
