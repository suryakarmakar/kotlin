fun main() {
    /* 1. create an immutable variable and print it to the console.
    output - My cat's name is "Fluffy" */
    val catName: String = "My cat\'s name is \"Fluffy\""
    println(catName)

    /* 2. print the length of the catName variable. */
    println(catName.length)

    /* 3. extract the string "car" from this variable and print it */
    val myCar: String = "My car won't start"
    println(myCar.substring(3, 6))

    /* 4. print a personalised message for that customer to the console */
    val customerName: String = "John"
    println("$customerName welcome to the store")

    /* 5. print to the console then amount of the fruit available */
    val apples: Int = 3
    val oranges: Int = 6
    println("Total number of fruit is ${apples + oranges}")
}