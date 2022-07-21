package org.mcausc78.craft4j

import org.mcausc78.craft4j.api.gui.Button
import org.mcausc78.craft4j.api.gui.Frame
import org.mcausc78.craft4j.api.json.JsonBuilder
import org.mcausc78.craft4j.api.os.OSUtil
import java.lang.Exception
import java.lang.System

public class Information {
    fun main(args : Array<String>) {
        // jvm accept only main function with args paramater
        println("Did you want to see Craft4J example?")
        val os = OSUtil.getOS().toString()
        val separator = OSUtil.getFileSeparator()
        println("Your OS is $os, file separator is $separator")
        var builder = JsonBuilder()
        val env = System.getenv()
        for ((key, value) in env) {
            builder.put(key, value)
        }
        val builded = builder.build()
        println("System environment in JSON: $builded")
        try {
            var f = Frame("Hello, world!")
            var b = Button("Click me!")
            b.getButton().addActionListener { ev -> println("Hello, world!") }
            b.getButton().setBounds(0, 0, 256, 256)
            f.getFrame().setSize(256, 256)
            f.getFrame().getContentPane().add(b.getButton())
            f.build()
        } catch (ex: java.lang.Exception) {
            println("Failed to setup frame!")
        }
    }
}
// Information.main()
fun main() {
    Information().main(arrayOf(""))
}