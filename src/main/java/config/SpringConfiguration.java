package config;



import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;


@Configuration//标识该类是spring的核心配置类
@ComponentScan("sghl")//配置全局扫描目录
@Import(DataSourceConfiguration.class)
public class SpringConfiguration {

}
