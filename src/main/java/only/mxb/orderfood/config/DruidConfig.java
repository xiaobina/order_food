package only.mxb.orderfood.config;

/**
 * @author Isalo
 * @create 2020-03-18:28
 */
//@Configuration
public class DruidConfig {
//
//    @ConfigurationProperties(prefix = "spring.datasource")
//    @Bean
//    public DataSource druid() {
//        return new DruidDataSource();
//    }
//
//
//    //配置Druid的监控
//    //1、配置一个管理后台的Servlet
//    @Bean
//    public ServletRegistrationBean statViewServlet(){
//        ServletRegistrationBean bean = new ServletRegistrationBean(new StatViewServlet(), "/druid/*");
//        Map<String,String> initParams = new HashMap<>();
//
////        initParams.put("loginUsername","admin");
////        initParams.put("loginPassword","123456");
//        initParams.put("allow","");//默认就是允许所有访问
//        initParams.put("deny","localhost");
//
//        bean.setInitParameters(initParams);
//        return bean;
//    }
//
//
//    //2、配置一个web监控的filter
//    @Bean
//    public FilterRegistrationBean WebStatFilter(){
//        FilterRegistrationBean bean = new FilterRegistrationBean();
//        bean.setFilter(new WebStatFilter());
//
//        Map<String,String> initParams = new HashMap<>();
//        initParams.put("exclusions","*.js,*.css,/druid/*");
//
//        bean.setInitParameters(initParams);
//
//        bean.setUrlPatterns(Arrays.asList("/*"));
//
//        return  bean;
//    }
}