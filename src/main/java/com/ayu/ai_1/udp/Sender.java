package com.ayu.ai_1.udp;

import java.net.*;
import java.util.stream.Stream;

public class Sender {
  public static void main(String[] args) throws SocketException, UnknownHostException {

    try (DatagramSocket socket = new DatagramSocket()) {
      Stream.iterate(0, x -> x + 1)
          .parallel()
          .limit(10_000_000)
          .map(String::valueOf)
          .map(val -> val + " Rome rome tera naam pukare.......")
          .forEach(
              number -> {
                try {
                  InetAddress ip = InetAddress.getLocalHost();
                  DatagramPacket packet =
                      new DatagramPacket(number.getBytes(), number.length(), ip, 5000);
                  System.out.println("Sending " + number + " to " + ip);
                  socket.send(packet);
                } catch (Exception e) {
                  throw new RuntimeException(e);
                }
              });
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }
}
