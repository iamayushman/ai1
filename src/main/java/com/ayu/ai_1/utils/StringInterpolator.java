package com.ayu.ai_1.utils;

public interface StringInterpolator {

  static String interpolate(String template, Object... params) {
    if (template == null) {
      return null;
    }
    return String.format(template.replaceAll("\\{}", "%s"), params);
  }
}
