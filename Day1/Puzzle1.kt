package Day1;

import java.io.File
import java.io.InputStream

fun main(args: Array<String>){
    val inputStream: InputStream = File("Input/Day1/puzzle1.txt").inputStream();
    val inputString = inputStream.bufferedReader().use { it.readText() }



}