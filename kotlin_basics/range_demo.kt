// wap in kotlin for range

fun main()
{
    // range 1: 1 to 10 with 1 increment
    for (i in 1..10)
    {
        print(i)
    }
    println()
    //range 2 : 10 to 1 -1 decrement
    for(i in 10 downTo 1)
    {
        print(i)
    }
    println()
    // range 3 : 1 to 10 with increment of 2
    for (i in 1..10 step 2)
    {
        print(i)
    }
    println()
    // range 4 : 10 to 1 with decrement of 2
    for( i in 10 downTo 1 step 2)
    {
        print(i)
    }
}