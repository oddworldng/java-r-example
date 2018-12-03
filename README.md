# Example

## Description

Example of calling an R script from Java code without using JRI library (using the Rscript app).

## Rscript config

Add Rscript.exe to your Path variable: [...]\R\R-3.5.1\bin\x64\Rscript.exe (Windows)

## How to compile

```
javac RCall.java
```

## How to run

```
java RCall
```

## Output

```
Calling to R Script ...
[1] "Hello R World"
```

## Author
* **Andrés Nacimiento García**, computer engineer at [University of La Laguna](https://ull.es/). <andresnacimiento@gmail.com>