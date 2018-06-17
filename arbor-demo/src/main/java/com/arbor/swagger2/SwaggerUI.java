package com.arbor.swagger2;

import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;


/**
 * Swagger2 测试
 *
 * @author LiFang
 * @create 2018-06-11 3:05 PM
 */
@RestController
@RequestMapping("/swagger2")
@Api("这是一个swagger测试类")
public class SwaggerUI {

    @GetMapping(value = "/test/{id}")
    @ApiOperation(value = "ApiParam方式", notes = "this is a test")
    @ResponseBody
    public Map<String, Object> pathAndRequestParams(
            @ApiParam(value = "产品编号", required = true, defaultValue = "1", allowableValues = "1,2,3....") @PathVariable("id") Long id,
            @ApiParam(value = "名称") @RequestParam("name") String name) {
        Map<String, Object> map = new HashMap<>();
        map.put("id", id);
        map.put("name", name);
        return map;
    }

    @PostMapping("/test")
    @ApiOperation(value = "新增dog", notes = "宠物信息维护")
    public Map<String, Object> valueObjectParams(@RequestBody DogValueObject dogValueObject) {
        Map<String, Object> map = new HashMap<>();
        map.put("dogValueObject", dogValueObject);
        return map;
    }


    @ApiOperation(value = "ApiImplicitParams方式", notes = "宠物信息维护")
    @PostMapping("/property/{id}")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "编号", dataType = "long", paramType = "path", required = true, defaultValue = "1"),
            @ApiImplicitParam(name = "name", value = "名称", dataType = "string", paramType = "query", required = true, defaultValue = "zhangsan")
    })
    @ApiResponses({
            @ApiResponse(code = 400, message = "请求参数没填好")
    })
    public Map<String, Object> propertyParams(@PathVariable("id") int id, @RequestParam String name) {
        Map<String, Object> map = new HashMap<>();
        map.put("name", name);
        map.put("id", id);
        return map;
    }
}
