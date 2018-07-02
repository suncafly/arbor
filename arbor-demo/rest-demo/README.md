Rest测试demo
================================
模拟测试
--------
##PersonControllerTest 
过滤器
--------
CommonFilter 继承Filter 声明@Component

SpecialFitler 继承Filte 不声明@Component通过@bean注入

    FilterRegistrationBean registrationBean = new FilterRegistrationBean();
    SpecialFitler specialFitler = new SpecialFitler();
    registrationBean.setFilter(specialFitler);
    List<String> urls = new ArrayList<>();
    urls.add("/*");
    registrationBean.setUrlPatterns(urls);
    return registrationBean;
拦截器
------
TimeInterceptor 

    @Autowired
    private  TimeInterceptor timeInterceptor;
    
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(timeInterceptor);
    }
    
 
