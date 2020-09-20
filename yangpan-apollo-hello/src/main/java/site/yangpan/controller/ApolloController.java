package site.yangpan.controller;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 注解@EnableApolloConfig可以指定我们使用apollo中那个namespace
 */
@EnableApolloConfig("application")
@RestController
@RequestMapping("/apollo")
public class ApolloController {

	/**
	 * 这里的${my.name}属性没有定义在propertis里面，而是配置在apollo中
	 */
	@Value("${my.name}")
	private String myName;

	@GetMapping("/test")
	public String sayHello(){
		return "Hello " + myName;
	}
}
