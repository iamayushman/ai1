package com.ayu.ai_1.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class Receiver {
  public static void main(String[] args) {

    try (DatagramSocket socket = new DatagramSocket(5000)) {

      byte[] buf = new byte[1024];
      DatagramPacket packet = new DatagramPacket(buf, buf.length);
      while (true) {
        socket.receive(packet);
        String s = new String(packet.getData(), 0, packet.getLength());
        System.out.println("received : " + s);
      }

    } catch (SocketException ignored) {

    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }
}
