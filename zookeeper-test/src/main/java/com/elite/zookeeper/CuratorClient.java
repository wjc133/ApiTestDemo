package com.elite.zookeeper;

import org.apache.curator.RetryPolicy;
import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.CuratorFrameworkFactory;
import org.apache.curator.retry.ExponentialBackoffRetry;

/**
 * Created by wjc133
 * Date: 2016/10/19
 * Time: 16:35
 */
public class CuratorClient {
    public static final String NAMESPACE = "JAVA";
    private CuratorFramework zclient;

//    static {
//        RetryPolicy rp = new ExponentialBackoffRetry(1000, 3);
//        String zkHost = "127.0.0.1:2181";
//        CuratorFrameworkFactory.Builder builder = CuratorFrameworkFactory.builder().connectString(zkHost)
//                .connectionTimeoutMs(5000).sessionTimeoutMs(5000).retryPolicy(rp);
//        builder.namespace(NAMESPACE);
//        zclient = builder.build();
//        zclient.start();
//    }

    public CuratorClient(CuratorFramework curator) {
        this.zclient = curator;
    }

    public void create(String path, String content) throws Exception {
        if (zclient.checkExists().forPath(path) == null) {
            zclient.create().forPath(path);
        }
        zclient.setData().forPath(path, content.getBytes());
        System.out.println("添加成功!");
    }

    public void read(String path) throws Exception {
        String data = new String(zclient.getData().forPath(path), "utf-8");
        System.out.println("read data: " + data);
    }
}
