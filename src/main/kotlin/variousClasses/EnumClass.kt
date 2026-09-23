package variousClasses

fun main(args: Array<String>) {
    println(Seasons.values()[3])
    println(Seasons.SPRING.ordinal)
   val seasons: Seasons = Seasons.valueOf("WINTER")

    println(Seasons.SUMMER.nameInPolish)

    when (seasons) {
        Seasons.SPRING -> println("Flowers grow")
        Seasons.SUMMER -> println("It's hot")
        Seasons.AUTUMN -> println("It's raining")
        Seasons.WINTER -> println("It's winter. Snow is falling")

    }
}