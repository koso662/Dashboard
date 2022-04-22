package com.template.domain.board.response;

import com.template.common.bean.DomainResponse;
import com.template.domain.board.bean.BoardBean;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class GetBoardResponse extends DomainResponse {

    private List<BoardBean> data;

}
