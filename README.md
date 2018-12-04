# Example

## Description

Example of calling an R script from Java code without using JRI library (using the Rscript app).

## Rscript config

Add `Rscript.exe` to your Path variable: [...]\R\R-3.5.1\bin\x64\Rscript.exe (Windows)

## How to compile

```
javac RCall.java
```

## How to run

```
java RCall
```

## How to run (with arguments)

```
java RCall input output
```

## Output

```
Calling to R Script (helloRWorld.R) ...
[1] "Hello R World"
```

## Output (with arguments)

```
Calling to R Script (helloRWorld.R) ...
[1] "[input," "output]"
```

## Requirements

This code has been tested using:
* R: 3.5.1
* Java: 1.8.0_191

## Author
* **Andrés Nacimiento García**, computer engineer at [University of La Laguna](https://ull.es/). <andresnacimiento at gmail.com>
