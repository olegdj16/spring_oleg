package com.olegarts.repository;

import com.olegarts.model.Comment;
import org.springframework.stereotype.Component;

/**
 * The `DBCommentRepository` class is a Spring component that implements the `CommentRepository` interface.
 * It is responsible for storing comments in the database.
 *
 * The `@Component` annotation indicates that this class is a Spring component,
 * and it will be automatically detected and registered as a bean by Spring's component scanning.
 * This class will be injected into the `CommentService` where needed.
 */
@Component
public class DBCommentRepository implements CommentRepository{

    /**
     * Stores the given comment in the database.
     *
     * @param comment the comment to be stored
     */
    @Override
    public void storeComment(Comment comment){
        System.out.println("Storing comment : " + comment.getText());

    }
}
