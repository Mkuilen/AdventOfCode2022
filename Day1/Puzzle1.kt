fun main(){
    val inputStream: InputStream = File("../Input/Day1/puzzle1.txt").inputStream();
    val inputString = inputStream.bufferedReader().use { it.readText() }

    println(inputString)
}