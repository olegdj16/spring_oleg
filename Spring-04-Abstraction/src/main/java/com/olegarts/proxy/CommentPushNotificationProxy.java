package com.olegarts.proxy;

import com.olegarts.model.Comment;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * The `CommentPushNotificationProxy` class is a Spring component that implements the
 * `CommentNotificationProxy` interface.
 * It is responsible for sending push notifications when a comment is published.
 *
 * <p>The `@Component` annotation indicates that this class is a Spring component,
 * and it will be automatically detected and registered as a bean by Spring's component scanning.
 * The `@Qualifier("PUSH")` annotation is used to distinguish this implementation from others.
 */
@Component
@Qualifier("PUSH")
public class CommentPushNotificationProxy implements CommentNotificationProxy {

  /**
  * Sends a push notification for the given comment.
  *
  * @param comment the comment to be notified about
  */
  @Override
  public void sendComment(Comment comment) {
    System.out.println("Sending push notification for comment : " + comment.getText());
  }
}