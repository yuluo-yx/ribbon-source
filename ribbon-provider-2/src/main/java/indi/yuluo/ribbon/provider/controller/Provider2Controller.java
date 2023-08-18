package indi.yuluo.ribbon.provider.controller;

import com.alibaba.cloud.nacos.registry.NacosRegistration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yuluo
 * @author 1481556636@qq.com
 */

@RestController
public class Provider2Controller {

	@Autowired
	private NacosRegistration nacosRegistration;

	@GetMapping("/test")
	public String test() {

		return "Route in :" + nacosRegistration.getHost() + ", port: " + nacosRegistration.getPort();
	}

}
