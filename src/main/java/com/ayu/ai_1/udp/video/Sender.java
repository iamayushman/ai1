package com.ayu.ai_1.udp.video;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class Sender {
  public static void main(String[] args) throws IOException {

    DatagramSocket socket = new DatagramSocket();

    File file =
        new File(
            "C:\\Users\\Ayushman\\OneDrive - Quest\\Documents\\Ayu\\development\\ai-1\\src\\main\\java\\com\\ayu\\ai_1\\udp\\video\\855029-hd_1920_1080_30fps.mp4");
    FileInputStream fis = new FileInputStream(file);
    DatagramPacket pack;
    InetAddress address = InetAddress.getByName("127.0.0.1");

    int size = 0;
    byte[] buffer = new byte[1000];
    ByteBuffer bb = ByteBuffer.allocate(4);
    bb.order(ByteOrder.BIG_ENDIAN);

    while (true) {
      size = fis.read(buffer);
      pack = new DatagramPacket(buffer, buffer.length, address, 5000);
      socket.send(pack);
    }
  }
}
