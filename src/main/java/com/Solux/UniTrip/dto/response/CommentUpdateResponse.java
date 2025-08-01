package com.Solux.UniTrip.dto.response;
//댓글 수정 response dto

import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@Builder
public class CommentUpdateResponse {
    private Long commentId;
    private String content;
    private LocalDateTime updatedAt;
}
