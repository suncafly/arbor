package com.arbor.swagger2;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * DogValueObject 实体
 *
 * @author LiFang
 * @create 2018-06-11 3:40 PM
 */
@Data
@ApiModel(value="Dog值对象", description = "(¦3[▓▓] 晚安")
public class DogValueObject {
    @ApiModelProperty(value="用户名", required = true)
    private String name;
    @ApiModelProperty(value="年龄", required = true)
    private int age;
}
