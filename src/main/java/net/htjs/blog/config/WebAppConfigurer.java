package net.htjs.blog.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * blog/net.htjs.blog.config
 *
 * @Description: 因为SpringBoot上传文件后不能直接访问文件，要设置资源路径
 * @Author: dingdongliang
 * @Date: 2018/8/23 8:02
 */
@Configuration
public class WebAppConfigurer implements WebMvcConfigurer {

    /**
     * 在配置文件中配置的文件保存路径
     */
    @Value("${img.path}")
    private String folder;

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/upload/**").addResourceLocations("file:" + folder);
    }
}
