package com.arbor.swagger2;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * Swagger-editor使用
 *
 * @author LiFang
 * @create 2018-06-16 9:19 PM
 */
@RestController
@RequestMapping("/test")
public class SwaggerEditor {

    @GetMapping(value = "/{id}")
    public Map<String, Object> findOne(
            @PathVariable("id") Long id,
            @RequestParam("name") String name) {
        Map<String, Object> map = new HashMap<>();
        map.put("id", id);
        map.put("name", name);
        return map;
    }

    @PostMapping("/")
    public Map<String, Object> insert(@RequestBody DogValueObject dogValueObject) {
        Map<String, Object> map = new HashMap<>();
        map.put("dogValueObject", dogValueObject);
        return map;
    }
}
