//wap in kotlin for set functions(additional)
fun main()
{
    val set1 = setOf(10,14,89,31)
    val set2 = setOf(11,14,22,90)
    //immutable sets

    //functions

    //1. conatins -check value exist in set or not
    println(set1.contains(14))

    //2. union - returns set from both set
    println(set1.union(set2))

    //3. inersets - returns common element from both set
    println(set1.intersect(set2))

    //4. subtract - will not add common element
    println(set1.subtract(set2))
}