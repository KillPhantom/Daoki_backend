package com.daoki.basic.VO.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.validator.constraints.Length;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

/**
 * @author Alan
 * 2022-02-26
 * Utils: Intellij Idea
 * Description: this Object is used for creating the user-defined content
 */
@Data
@ApiModel(value = "a created content module")
@EqualsAndHashCode(callSuper = false)
public class CreateContentVO {

    @ApiModelProperty(value = "the body of a content module")
    @Length(min = 1, max = 1000, message = "the length of body is limited to 1~1000")
    private String body;

    @ApiModelProperty(value = "the title of content module")
    private String title;

    @ApiModelProperty(value = "the type of content module")
    @NotNull(message = "the type mustn't be null")
    private Integer type;

    @ApiModelProperty(value = "the contributors' ids of content module")
    @Size(max = 10, message = " The maximum contributor number limit is 10")
    private List<Long> contributors;

    @ApiModelProperty(value = "the position of this content module")
    @NotNull(message = "the position information mustn't be null")
    private Integer position;

    @ApiModelProperty(value = "language for the code data type")
    private String language;



}
