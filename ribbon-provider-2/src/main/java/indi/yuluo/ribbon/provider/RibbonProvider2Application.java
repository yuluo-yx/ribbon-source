package indi.yuluo.ribbon.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author yuluo
 * @author 1481556636@qq.com
 */

@EnableDiscoveryClient
@SpringBootApplication
public class RibbonProvider2Application {

	public static void main(String[] args) {

		SpringApplication.run(RibbonProvider2Application.class);
	}

}
