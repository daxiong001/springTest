package config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidPooledConnection;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;


@PropertySource("classpath:jdbc.properties")//配置加载property文件
public class DataSourceConfiguration {

    @Value("${driverClassName}")
    private String driverClassName;
    @Value("${url}")
    private String url;
    @Value("${username}")
    private String userName;
    @Value("${password}")
    private String passWord;

    @Bean("dataSource")
    public DataSource getDataSource(){
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(driverClassName);
        dataSource.setUrl(url);
        dataSource.setUsername(userName);
        dataSource.setPassword(passWord);
        return dataSource;
    }
}
