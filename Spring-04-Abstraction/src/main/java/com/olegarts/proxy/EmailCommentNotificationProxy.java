package com.olegarts.proxy;

import com.olegarts.model.Comment;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * The `EmailCommentNotificationProxy` class is a Spring component that implements the
 * `CommentNotificationProxy` interface.
 * It is responsible for sending email notifications when a comment is published.
 *
 * <p>The `@Component` annotation indicates that this class is a Spring component,
 * and it will be automatically detected and registered as a bean by Spring's component scanning.
 * The `@Qualifier("EMAIL")` annotation is used to distinguish this implementation from others.
 */
@Component
@Qualifier("EMAIL")
public class EmailCommentNotificationProxy implements CommentNotificationProxy {

  /**
  * Sends an email notification for the given comment.
  *
  * @param comment the comment to be notified about
  */
  @Override
  public void sendComment(Comment comment) {
    System.out.println("Sending notification for comment : " + comment.getText());
  }
}