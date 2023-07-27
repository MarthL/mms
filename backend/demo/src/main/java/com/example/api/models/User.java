package com.example.api.models;

public class User {
  private int id;
  private String name;

  public User(int id, String name) {
    this.id = id;
    this.name = name;
  }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) throws IllegalAccessException {
    if (name == null || name.length() == 0) {
      throw new IllegalAccessException("this name cannot be null");
    }
  }
}
