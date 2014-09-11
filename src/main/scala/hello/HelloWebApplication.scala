package hello

import org.springframework.boot.SpringApplication
/**
 * Sample application for running springboot with gradle and scala stack
 * Base repo : https://github.com/sithu/HelloScala
 * Original author sithu
 * Via Gradle: gradle bootRun
 *
 * @author harsh00008
 * @since 1.0
 */
object HelloWebApplication {
	def main(args: Array[String]) {
	   SpringApplication.run(classOf[HelloConfig]);
	}
}
