package hello

import org.springframework.context.annotation.Configuration
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.context.annotation.ComponentScan
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.stereotype.Controller

/**
 * Configuring and mapping controller for Hello World program
 *
 * @author harsh00008
 * @since 1.0
 */

@Configuration
@EnableAutoConfiguration
@ComponentScan
@Controller
class HelloConfig {
	@RequestMapping(value = Array("/"))
	@ResponseBody
	def helloWorld(): String  = {
		return "Hey Hello World!"
	}
}
