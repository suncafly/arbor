package com.arbor.kafka;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * @Auther: lifang
 * @Date: 2018/4/25 16:32
 * @Description:
 */

public class LogMessageBO implements Serializable {
    private Long accountId;
    private String orderNo;
    private List<Map<String, Object>> itemList;

    public LogMessageBO() {
    }

    public Long getAccountId() {
        return this.accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public String getOrderNo() {
        return this.orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public List<Map<String, Object>> getItemList() {
        return this.itemList;
    }

    public void setItemList(List<Map<String, Object>> itemList) {
        this.itemList = itemList;
    }
}