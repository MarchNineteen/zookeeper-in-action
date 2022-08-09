package com.wyb.zk.masterJob;

import org.junit.Test;

public class MasterResolveTest {
    //  job 定时任务
    @Test
    public void MasterTest() throws InterruptedException {
        MasterResolve instance = MasterResolve.getInstance();
        System.out.println("master:" + MasterResolve.isMaster());
        Thread.sleep(Long.MAX_VALUE);
    }
}
