package com.elite.network;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
import java.util.Arrays;

/**
 * Created by wjc133
 * Date: 2016/8/18
 * Time: 16:39
 */
public class UdpTestServer {
    public static void main(String[] args) throws Exception {
        DatagramPacket receive = new DatagramPacket(new byte[1024],1024);
        DatagramSocket server = new DatagramSocket(8888);

        System.out.println("---------------------------------");
        System.out.println("Server current start......");
        System.out.println("---------------------------------");


            server.receive(receive);

            byte[] recvByte = Arrays.copyOfRange(receive.getData(), 0,
                    receive.getLength());

            System.out.println("Server receive msg:" + new String(recvByte));

    }
}
