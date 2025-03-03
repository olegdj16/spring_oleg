package com.olegarts.model;

import lombok.Data;

/**
 * The `Comment` class represents a comment with an author and text.
 * It uses Lombok's `@Data` annotation to generate boilerplate code such as
 * getters, setters, and toString.
 */
@Data
public class Comment {
  private String author;
  private String text;
}
