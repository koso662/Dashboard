package com.template.domain.board.bean;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class BoardBean {

    private Long boardId;
    private String boardName;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

}
