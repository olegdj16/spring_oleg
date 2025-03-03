package com.olegarts;

import com.olegarts.config.ProjectConfig;
import com.olegarts.model.Comment;
import com.olegarts.service.CommentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * The `CydeoApp` class is the entry point of the application.
 * It demonstrates the use of Spring Framework to manage and inject dependencies.
 */
public class CydeoApp {
  public static void main(String[] args) {

    // Create a new Comment object and set its properties
    Comment comment = new Comment();
    comment.setAuthor("Johnson");
    comment.setText("Spring Framework");

    // Initialize the Spring application context using the ProjectConfig class
    ApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);

    // Retrieve the CommentService bean from the application context
    CommentService commentService = context.getBean(CommentService.class);

    // Publish the comment using the CommentService
    commentService.publishComment(comment);
  }
}
