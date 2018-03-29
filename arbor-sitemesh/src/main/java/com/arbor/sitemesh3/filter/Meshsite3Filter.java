package com.arbor.sitemesh3.filter;

import com.arbor.sitemesh3.configure.SitemeshProperites;
import com.arbor.sitemesh3.tagrule.MyTagRuleBundle;
import org.sitemesh.builder.SiteMeshFilterBuilder;
import org.sitemesh.config.ConfigurableSiteMeshFilter;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * sitemesh 自定义配置
 * @author xiaojf 2017/12/21 16:12
 */
public class Meshsite3Filter extends ConfigurableSiteMeshFilter {

    @Autowired
    private SitemeshProperites sitemeshProperites;

    @Override
    protected void applyCustomConfiguration(SiteMeshFilterBuilder builder) {
//        builder.addDecoratorPath("/*", "/layout")//拦截规则
//                .addExcludedPath("/static/**") //白名单
//                .addTagRuleBundle(new MyTagRuleBundle());//自定义标签

        //是否开启sitemesh
        boolean open = sitemeshProperites.isOpen();
        if(!open){
            return;
        }

        //需要装饰的访问路径
        String contentPath = sitemeshProperites.getContentPath();
        //装饰器页面路径
        String decoratorPath = sitemeshProperites.getDecoratorPath();
        //不需要装饰的访问路径,多个之间用英文逗号分隔
        String excludedPaths = sitemeshProperites.getExcludedPaths();

        // 通过配置文件
        if(!"".equals(contentPath) && !"".equals(decoratorPath)){
            builder.addDecoratorPath(contentPath, decoratorPath);
        }

        if (!"".equals(excludedPaths)) {
            String paths[] = excludedPaths.split(",");
            for (String path : paths) {
                builder.addExcludedPath(path);
            }
        }
        builder.addTagRuleBundle(new MyTagRuleBundle());//自定义标签
    }





}
