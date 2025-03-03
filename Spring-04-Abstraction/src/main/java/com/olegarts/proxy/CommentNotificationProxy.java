package com.olegarts.proxy;

import com.olegarts.model.Comment;

/**
 * The `CommentNotificationProxy` interface defines a contract for sending comment notifications.
 * Implementations of this interface are responsible for sending notifications when a comment
 * is published.
 */
public interface CommentNotificationProxy {

  /**
   * Sends a notification for the given comment.
   *
   * @param comment the comment to be notified about
   */
  void sendComment(Comment comment);
}
