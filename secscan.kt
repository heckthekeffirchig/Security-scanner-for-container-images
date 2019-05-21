import java.io.File

fun main(args: Array<String>) {
    var dirs: MutableList<String> = ArrayList()
    var patterns:MutableList<String> = ArrayList()
    var name:String =" "
    var it:Int = 0
    var it2:Int = 0
    println("At the end of any step just write null and you will exit the step")
    println("Insert directories for search")
    while(name != "null")
    {
        name = readLine().toString()
        dirs.add(name)
        it++
    }
    println("")
    name =""
    println("Insert pattern, that you need to search (Insert one in a time you will get more than one field)")
    while (name != "null")
    {
        name = readLine().toString()
        patterns.add(name)
        it2++
    }

    for(k in patterns) {
        for (i in dirs) {
            File(i).walkBottomUp().forEach {
                if (it.toString().contains(k)) println(it.toString())
            }
        }
    }
}

