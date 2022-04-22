package com.template.domain.board;

import com.template.domain.board.response.GetBoardResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController("/v1.0/boards")
@RequiredArgsConstructor
public class BoardController {

    private final BoardService boardService;


    @GetMapping("")
    public GetBoardResponse getBoard() {
        return new GetBoardResponse();
    }
}
