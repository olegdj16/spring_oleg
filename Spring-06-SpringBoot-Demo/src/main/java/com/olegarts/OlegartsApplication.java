package com.olegarts;

import com.olegarts.model.Comment;
import com.olegarts.service.CommentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class OlegartsApplication {

    public static void main(String[] args) {

        Comment comment = new Comment();
        comment.setAuthor("Johnson");
        comment.setText("Spring Framework");

        ApplicationContext context = SpringApplication.run(OlegartsApplication.class, args);

        CommentService cs = context.getBean(CommentService.class);
        cs.publishComment(comment);
    }

}
