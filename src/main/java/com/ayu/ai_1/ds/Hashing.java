package com.ayu.ai_1.ds;

import lombok.NonNull;

public interface Hashing {
  static void main(String[] args) {
    System.out.println(hashString("customer name Validation_Rule_719"));
    System.out.println(hashString("customer address Validation_Rule_719"));
    System.out.println(hashString("customer Validation_Rule_719"));
  }

  public static @NonNull String hashString(String name) {
    // the nLength is supposed to be determined by db object type
    return hashString(name, 18);
  }

  public static @NonNull String hashString(String name, int nLength) {
    if (nLength <= 2) {
      return "";
    }

    int truncateLength = 0;
    if (nLength <= 6) {
      truncateLength = 1;
    } else if (nLength < 18) {
      truncateLength = nLength - 6;
    }

    if (!name.isEmpty()) {
      return getHashString(name, truncateLength);
    } else {
      return "_0";
    }
  }

  private static @NonNull String getHashString(String name, int truncateLength) {
    long val = 0;
    byte[] bytes = name.getBytes();
    for (byte b : bytes) {
      val = (val << 8 | val >>> 24) + (b & 0xFF);
    }
    int nHash = Math.abs((int) val);

    String hashString = "" + nHash;

    if (truncateLength > 0) {
      hashString = hashString.substring(Math.max(1, hashString.length() - truncateLength));
    }
    return "_" + hashString;
  }
}
