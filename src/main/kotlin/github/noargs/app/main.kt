package github.noargs.app

import org.apache.commons.cli.DefaultParser
import org.apache.commons.cli.Options
import javax.swing.JFrame


const val DEVELOPMENT_MODE = "developmentMode"

fun main(args: Array<String>){

    val options = Options()
    options.addOption(DEVELOPMENT_MODE, true, "developmentMode is on")
    val parser = DefaultParser()
    val commandLine = parser.parse(options, args)
    val optionValue = commandLine.getOptionValue(DEVELOPMENT_MODE)

    val app = App()

    // if (optionValue != null) app.developmentMode = Boolean.valueOf(optionValue)

    app.load()


//    val app = App()
//    app.minimumSize = java.awt.Dimension(500, 400)
//    app.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
//    app.isVisible = true

    println("Welcome [kanguin pos]:0.2")
}