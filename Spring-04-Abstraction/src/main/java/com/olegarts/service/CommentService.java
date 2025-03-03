package com.olegarts.service;

import com.olegarts.model.Comment;
import com.olegarts.proxy.CommentNotificationProxy;
import com.olegarts.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * The `CommentService` class is a Spring component that handles the publishing of comments.
 * It uses a `CommentRepository` to store comments and a `CommentNotificationProxy`
 * to send notifications.
 *
 *<p></p>
 * The `@Component` annotation indicates that this class is a Spring component,
 * and it will be automatically detected and registered as a bean by Spring's component scanning.
 */
@Component
public class CommentService {

  private final CommentRepository commentRepository;
  private final CommentNotificationProxy commentNotificationProxy;

  /**
   * Constructs a `CommentService` with the specified `CommentRepository`
   * and `CommentNotificationProxy`.
   *
   * @param commentRepository the repository to store comments
   * @param commentNotificationProxy the proxy to send comment notifications
   */
  public CommentService(CommentRepository commentRepository, @Qualifier("PUSH")
                        CommentNotificationProxy commentNotificationProxy) {
    this.commentRepository = commentRepository;
    this.commentNotificationProxy = commentNotificationProxy;
  }

  /**
   * Publishes the given comment by storing it in the repository and sending a notification.
   *
   * @param comment the comment to be published
   */
  public void publishComment(Comment comment) {
    commentRepository.storeComment(comment);
    commentNotificationProxy.sendComment(comment);
  }
}
