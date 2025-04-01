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