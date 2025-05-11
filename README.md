# Java Masterclass

## Summary
- [Primitive Types](#primitive-types)
  - [byte](#byte)
  - [short](#short)
  - [int](#int)
  - [long](#long)
  - [float](#float)
  - [double](#double)
  - [char](#char)
  - [boolean](#boolean)
- [String](#string)
  - [String vs StringBuilder](#string-vs-stringbuilder)
  - [Method](#method)

## Primitive types

- Primitive types have wrapper classes
    - byte -> Byte
    - short -> Short
    - int -> Integer
    - long -> Long
    - double -> Double
    - float -> Float
    - boolean -> Boolean
    - char -> Char

- If a value exceeds the limit of a type, Java wraps it around (overflow), without an exception:
```java
int x = Integer.MAX_VALUE;
System.out.print(x + 1); // prints -2147483648
```

### byte
- Size: 8 bits
- Range: -128 to 127
    
```java
// Examples dealing with byte:

byte x = 127; // fine - maximum value
byte y = 128; // throws an error - exceeds range

/* The value 128 is an int by default in Java, and the byte typecan only stores values from -128 to 127. By writting theexplicit cast, you're telling the compiler: "I know there mightbe data loss, but i want to force it anyway." */
byte z = (byte) 128;
```

### short
- Size: 16 bits
- Range: -32768 to 32767

```java
// Examples dealing with short:

short a = 32767; // fine - maximum value
short b = 32768; // throws an error - exceeds range

/* Similar to byte, this value is an int by default and exceeds short range. The cast forces the conversion but causes overflow */
short c = (short) 32768; // c becomes -32768 due to overflow
```

### int

- Size: 32 bits
- Range: –2,147,483,648 to 2,147,483,647
- **Default type for integers**

```java
// Examples dealing with int:

int d = 2147483647; // fine - maximum value for int
int e = 2147483648; // throws an error - exceeds range

/* This value is treated as a long by default with the L suffix */
long largeValue = 2147483648L;

/* Casting a long to int when the value exceeds the range causes overflow */
int f = (int) 2147483648L; // f becomes -2147483648 due to overflow
```

### long

- Size: 64 bits
- Range: –2,147,483,648 to 2,147,483,647
- Suffix **L** is used for long literals: 
```java
long l = 10000000000L;
```

```java
// Examples dealing with long:

long g = 9223372036854775807L; // fine - maximum value for long
long h = 9223372036854775808L; // throws an error - exceeds range

/* For very large literals, you must use the L suffix */
long i = 9223372036854775807; // error, treated as int which can't hold this value
long i = 9223372036854775807L; // correct
```

### float

- Size: 32 bits
- Range: Approximately ±3.4e38 (7 decimal digits)
- Suffix **f** or **F** is required: float f = 3.14f;

```java
// Examples dealing with float:

float j = 3.14f; // fine - must use 'f' suffix
float k = 3.14; // throws an error - 3.14 is double by default

/* Casting from double to float may lose precision */
float l = (float) 3.1415926535897932; // precision loss
```

### double

- Size: 64 bits
- Range: Approximately ±1.8e308 (15 decimal digits)
- **Default type for floating-point numbers**

```java
// Examples dealing with double:

double m = 3.14; // fine - doubles are the default for decimal literals
double n = 3.14d; // also fine - 'd' suffix is optional
double o = 1.7e308; // fine
double p = 1.8e308; // exceeds range, becomes Infinity
```

### char

- Size: 16 bits
- Stores a single Unicode character

```java
// Examples dealing with char:

char q = 'A'; // fine - using character literal
char r = 65; // fine - using Unicode value for 'A'
char s = -1; // throws an error - char is unsigned (0 to 65535)
char t = (char) -1; // t becomes 65535 due to unsigned representation
```

### boolean
- Size: JVM-dependent (usually 1 bit internally, but uses 1 byte in memory)
- Values: **true** or **false**

## String

- Strings are immutable, means that you can't change a String after it's created

### String vs StringBuilder

- The string class is immutable, but can be used much like a primitive data type

- The StringBuilder class is mutable, meaning it can be changed, but does not share the String's special features, such as being able to assign it a String literal or use the plus operator on it

- Both are classes, but the String class is in a special category in the java language

- The String is so instrinsic to the java language, it can be used like a 9th primitive type

## Method

- A method is a collection of statements, one or more, that perform an operation

- The main method is the entry point for any java code, and java looks for this main method to start and run the program