package com.arbor.domain.service;

import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by apple on 03/04/2018.
 */
@Service
public class BackupService {

    @PostConstruct
    public void init(){
        System.out.println("恢复备份信息");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("删除备份信息");
    }
}
