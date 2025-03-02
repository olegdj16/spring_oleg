package com.olegarts.repository;

import com.olegarts.model.Comment;

public interface CommentRepository {
    void storeComment(Comment comment);
}
