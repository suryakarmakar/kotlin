fun main() {
    // int
    val i = 10
    println(i::class.java)

    // long
    val l = 700000000000000
    println(l::class.java)

    // double
    val d = 3.14
    println(d::class.java)

    // string
    val s = "text"
    println(s::class.java)

    // char
    val c = 'c'
    println(c::class.java)

    // boolean
    val b = true
    println(b::class.java)

    // type declaration
    val bt: Byte = 10
    println(bt::class.java)

    val sh: Short = 20000
    println(sh::class.java)

    val it: Int = 20
    println(it::class.java)

    val lg: Long = 100
    println(lg::class.java)

    val lg2 = 100L
    println(lg2::class.java)

    val db: Double = 1.11
    println(db::class.java)

    val fl = 10.11F
    println(fl::class.java)

    val st: String = "string"
    println(st::class.java)

    val ch: Char = 'a'
    println(ch::class.java)

    val bol: Boolean = false
    println(bol::class.java)

    // type conversions
    val it2 = 10
    println(it2.toDouble())

    val pi = 3.14
    println(pi.toInt())
}