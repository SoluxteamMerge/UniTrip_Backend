package com.Solux.UniTrip.entity;
//댓글 좋아요 엔티티
//백다현

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "comment_likes")
@Getter
@NoArgsConstructor
public class CommentLikes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "like_id")
    private Long likeId;

    @Column(name = "comment_id")
    private Long commentId;

    @Column(name = "user_id")
    private Long userId;

    @Column(name = "liked_at")
    private LocalDateTime likedAt;


    public CommentLikes(Long commentId, Long userId) {
        this.commentId = commentId;
        this.userId = userId;
        this.likedAt = LocalDateTime.now();
    }
}
