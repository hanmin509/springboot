package com.example.springboot.crud.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

@Schema(description = "dataParam")
@Getter
@Setter
public class DataVO {

    @Schema(description = "데이터 위치", defaultValue = "0")
    private int index;

    @Schema(description = "수정할 문자")
    private String text;

}
