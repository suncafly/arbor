package com.arbor.domain.modle;

import lombok.Data;
import org.jsondoc.core.annotation.ApiObject;
import org.jsondoc.core.annotation.ApiObjectField;

import java.io.Serializable;

/**
 * Created by apple on 03/04/2018.
 */
@Data
@ApiObject
public class User implements Serializable{

    @ApiObjectField(description = "The user's Name")
    private String name;

    @ApiObjectField(description = "The book's Email")
    private String email;

}
