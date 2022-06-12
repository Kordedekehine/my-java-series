package com.company;

public enum Greetings implements Mood {
  SMALL("How far my gee"),
    LONG("Heeey! Brodie whats good"),
    EXTRALARGE("Boss Man!! Oga mii longest time");

  private final String pleasing;

  Greetings(String pleasing) {
    this.pleasing = pleasing;
  }

  @Override
  public String helloWorld() {
    return " These greeting comes in different mood";
  }

  public String getPleasing() {
    return pleasing;
  }
}
