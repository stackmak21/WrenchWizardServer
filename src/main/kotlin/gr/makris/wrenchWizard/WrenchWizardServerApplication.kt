package gr.makris.wrenchWizard

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class WrenchWizardServerApplication

fun main(args: Array<String>) {
	runApplication<WrenchWizardServerApplication>(*args)
}
