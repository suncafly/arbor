package com.arbor.kafka;

/**
 * @Auther: lifang
 * @Date: 2018/4/24 17:52
 * @Description:
 */

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Lifang
 * @since 2017/6/17.
 */
@Controller
@EnableAutoConfiguration
public class SampleController {

    public static Logger logger = LoggerFactory.getLogger(SampleController.class);

    @Autowired
    private KafkaTemplate<String, String> template;

    @Autowired
    private ObjectMapper objectMapper;

    @RequestMapping("/send")
    @ResponseBody
    String send(String topic, String key, String data) {
        template.send(topic, key, data);
        return "success";
    }

    @RequestMapping("/limit")
    @ResponseBody
    String limit(){
        LogMessageBO logMessageBO = new LogMessageBO();

        logMessageBO.setAccountId(1L);

        List<Map<String, Object>> itemList = new ArrayList<>();

        Map<String, Object> map1 = new HashMap<>();
        map1.put("count", 1);
        map1.put("itemId", 1);

        Map<String, Object> map2 = new HashMap<>();
        map2.put("count", 1);
        map2.put("itemId", 2);

        itemList.add(map1);
        itemList.add(map2);

        logMessageBO.setItemList(itemList);
        try {
            String data = objectMapper.writeValueAsString(logMessageBO);
            template.send("limit-discount-mall-purchase", data);
        } catch (JsonProcessingException e) {
            logger.error(e.getMessage(), e);
        }
        return "success";
    }

    @RequestMapping("/refund")
    @ResponseBody
    public String handleTradeRefund(){
        Map<String, Object> info = new HashMap<>();
        info.put("buyerAccountId", 1);
        info.put("itemId",1);
        info.put("returnNum",1);
        try{
            String content = objectMapper.writeValueAsString(info);
            template.send("crm-agree-refund", content);
        }catch (JsonProcessingException e) {
            logger.error(e.getMessage(), e);
        }
        return "success";
    }


    @KafkaListener(id = "t1", topics = "t1")
    public void listenT1(ConsumerRecord<?, ?> cr) throws Exception {
        logger.info("{} - {} : {}", cr.topic(), cr.key(), cr.value());
    }

    @KafkaListener(id = "t2", topics = "t2")
    public void listenT2(ConsumerRecord<?, ?> cr) throws Exception {
        System.out.println(cr.key() + ":" + cr.value());
        logger.info("{} - {} : {}", cr.topic(), cr.key(), cr.value());
    }

}
