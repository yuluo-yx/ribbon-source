package indi.yuluo.ribbon.provider.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author yuluo
 * @author 1481556636@qq.com
 */

@RestController
public class ConsumerController {

	@Autowired
	private RestTemplate restTemplate;

	@GetMapping("/test")
	public String test() {

		return restTemplate.getForObject("http://ribbon-provider/test", String.class);
	}

}
