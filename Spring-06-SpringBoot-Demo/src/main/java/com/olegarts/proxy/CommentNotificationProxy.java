package com.olegarts.proxy;

import com.olegarts.model.Comment;

public interface CommentNotificationProxy {
    void sendComment(Comment comment);
}
