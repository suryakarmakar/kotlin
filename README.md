## Kotlin-Programming Started 1/4/2025

```kt
fun main() {
    println("Hello World!")
}
```

Kotlin always starts in the main class or main file in the function main. This is a standard Kotlin way of running a
program. when we run kotlin file, the system automatically picks out the function called main that has these parameters.

- print():

print function are used to display the output on console. if we used print() function then after printing the
value no new line created. in this case we have to manually add new line using \n.

```kt
print("Print Function\n")
```

- println():

this is print line function. its same as print, but it automatically adds a new line after printing the value
on it.

```kt
println("Print Line Function")
```

### String:

A string is a chain of zero or more characters surrounded by double quotes.

Example:

"cat", "this is a string", ""

### Chars:

A char is a single character, surrounded by single quotes.

Example:

'A', 'a', ''

### Variables:

A variable is like a container for data.

Example:

```kt
var name = "Surya"
var age = 25
```

after defining a variable datatype we cant change a variable's datatype. Ex: name declared as a string so we cant
reassign number or any other datatype in name variable.

So we have two types of variables one is mutable(changeable) and another one is immutable(read only).

- Mutable:

we can change the value of the mutable variable after initialize. we can use var keyword to declare a mutable
variable.

```kt
var a = 10
```

- Immutable:

we cant change the value of the immutable variable. we can use val keyword to declare an immutable variable.

```kt
val pi = 3.14
```

- Variable names:

1. Names can contain letter, number and underscore.
2. Names must start with a letter or an underscore.
3. Names can be anything except Kotlin keywords.
4. Naming convention - use camelCase.

- String function:

length - return total length of the string.

```kt
val str = "String"
println(str.length)
```

trim() - remove space from start and end of the string.

```kt
println("   some text   ".trim())
```

get() - return a character based on index. we can do using [] also.

```kt
val str = "String"
println(str.get(2))
println(str[2])
```

substring() - return a substring form a string. we can pass string and end index.

```kt
val str = "String"
println(str.substring(3))
```

- String templates:

using this we can insert dynamic value on a string. an expression start with a $ sign and can have braces.

```kt
println("My name is $name")
println("2 + 2 = ${2 + 2}")
```

- Constants:

the value of the constant do not change. they are the top level variable, it's means we have to declare the outside of
the function.

```kt
const val BASE_URL = "example.com"
fun main() {
    println("$BASE_URL/api/v1/user")
}
```

### User Input:

- readln():

reading user input form console. every thing we read as a string data type, so we have to explicitly type cast string to
int or any other data type.

```kt
val firstName = readln()
val lastName = readln()

val a = readln().toInt()
```

### Random Number:

we can generate any random number using Random package. to use this package we have to import from kotlin.

```kt
import kotlin.random.Random
```

- nextInt()

it will give random integer. we can pass custom range. if we pass a 10 as a parameter then it will generate 0 to 9.

```kt
println(Random.nextInt(10))
```

another way we can pass starting and ending position. we have to pass from: 10 to until: 30. note that 10 will be
included but not 20. it will generate 10 to 19.

```kt
println(Random.nextInt(10, 20))
```

### Data Types:

- Integers:

```kt
val i = 10
println(i::class.java)
```

- Long:

```kt
val l = 700000000000000
println(l::class.java)
```

- Double:

by default all the real number in kotlin is double. to use floating data type we have to explicitly convert.

```kt
val d = 3.14
println(d::class.java)
```

- String:

```kt
val s = "text"
println(s::class.java)
```

- Character:

```kt
val c = 'c'
println(c::class.java)
```

- Boolean:

```kt
val b = true
println(b::class.java)
```

- Type declaration:

```kt
val bt: Byte = 10
println(bt::class.java)

val sh: Short = 20000
println(sh::class.java)

val it: Int = 20
println(it::class.java)

val lg: Long = 100
println(lg::class.java)
```

### Type Conversions:

A variable of a certain type can be converted into a different type, but there are some curtain rules to convert one
type to another type.

```kt
val it2 = 10
println(it2.toDouble())
```

If we convert to a smaller type, then some information might be lost or corrupted. so be carefully about converting
large datatype to smaller datatype.

```kt
val pi = 3.14
println(pi.toInt())
```

### Nullability:

if you use a variable with a null value, your program will crash with a NullPointerException(NPE). to solve this problem
kotlin provide some methods to guards the null values. kotlin differentiates between variables that can be null and
those that cannot, using the ? operator. using this operator we can define a nullable or non-nullable variable.

- non-nullable:

if a variable cant be null, then it must be given a value.

```kt
var name: String = "surya"
```

- nullable:

if a variable can be null, then you can still provide a value that is an optional, but if you do not provide a value
then you must provide value null.

```kt
var name: String? = null
```

the null keyword is used to assign the value null to a nullable value. note: we cant allow to assign null to a variable
that is not nullable, it will give an error.

```kt
var name: String? = "surya"
name = null
```

- null operator:

null operators are basically an operators that we can use, and we have to use on null values or on variables that can be
null. using "?" operator we can define a variable that can be null or that can have a null value.

- nullable operator (null safe call):

suppose we have a nullable variable, and we want to get the length of the variable. now the problem is if the variable
is null then the .length will give you an error, because null value don't have a length. to solve this issue kotlin
provided a nullable operator "?.". using this if the variable is not null then it will give the length otherwise it will
return the null.

```kt
var emp4: String? = "employee4"
println(emp4?.length)
emp4 = null
println(emp4?.length)
```

safe calls can be chained for multiple operator.

```kt
var emp5: String? = "employee5"
println(emp5?.length?.toDouble())
```

- nullable arithmetic operation:

Arithmetic operators can only work if your variables are not null. So we have a problem with arithmetic operators when
we are trying to do operations with no variables. So we have other ways to perform those same operations.

1. ?.plus() - addition
2. ?.minus - subtraction
3. ?.times - multiplication
4. ?.div - division
5. ?.rem - remainder

