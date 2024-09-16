package com.mycompany.procesosapp;

public class Proceso {
  int time;
  String name;

  public Proceso(int time, String name) {
    this.time = time;
    this.name = name;
  }

  public int getTime() {
    return time;
  }

  public void setTime(int time) {
    this.time = time;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  protected Object clone() {
    return new Proceso(this.time, this.name);
  }
}
