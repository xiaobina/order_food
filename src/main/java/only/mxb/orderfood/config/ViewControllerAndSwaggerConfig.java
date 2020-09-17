package only.mxb.orderfood.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

/**
 * @author Isalo
 * @create 2020-03-18:06
 * <p>
 * 使用WebMvcConfigurationSupport(WebMvcConfigurerAdapter已弃用)来拓展
 * SpringMVC的功能，WebMvcConfigurationSupport是一个抽象类，用Ctrl+O可以选择要实现的方法
 * @EnableWebMvc：完全控制SpringMVC的配置，只能使用其最简单的功能，不建议使用该注解
 *
 * @EnableSwagger2:开启swagger2，不进行配置时默认使用其默认配置
 */
@Configuration
@EnableSwagger2
public class ViewControllerAndSwaggerConfig extends WebMvcConfigurationSupport {

    @Override
    protected void addViewControllers(ViewControllerRegistry registry) {
        System.out.println("viewController");

        registry.addViewController("").setViewName("login");
        registry.addViewController("/").setViewName("login");

        registry.addViewController("/log").setViewName("welcome");
        super.addViewControllers(registry);
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        //释放静态资源和首页
        registry.addResourceHandler("/**")
                .addResourceLocations("classpath:/static/");
        registry.addResourceHandler("/**")
                .addResourceLocations("classpath:/public/");
        //配置swagger2
        registry.addResourceHandler("swagger-ui.html")
                .addResourceLocations("classpath:/META-INF/resources/");
        registry.addResourceHandler("/webjars/**")
                .addResourceLocations("classpath:/META-INF/resources/webjars/");
        super.addResourceHandlers(registry);
    }

    @Bean
    public Docket docket() {
        return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo());
    }

    private ApiInfo apiInfo() {
        //作者信息
        Contact authorMessage = new Contact("mxb", "http://47.101.45.221:8080", "1151745765@qq.com");
        return new ApiInfo(
                //api标题
                "点餐系统api文档"
                //api描述
                , "前端小心被打哦！"
                //api版本
                , "1.0.0"
                //后台代码URL
                , "http://47.101.45.221:8080"
                //作者信息
                , authorMessage
                , "Apache 2.0"
                , "http://www.apache.org/licenses/LICENSE-2.0"
                , new ArrayList());
    }

}