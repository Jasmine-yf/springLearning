import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Random;

@Configuration  //表示当前的类是一个配置类
@ComponentScan(basePackages= {"com.huwei","com.mini"})  //将来要托管的bean要扫描的包及子包

public class AppConfig {    //java容器的配置

    @Bean
    public Random r(){
        return new Random();
    }

}
