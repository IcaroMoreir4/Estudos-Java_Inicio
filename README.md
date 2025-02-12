# Meu Primeiro Código em Java

Estou no início das férias e comecei a aprender Java. Estou migrando do front-end para o back-end. Este código é a resolução de um exercício do curso de Java OO da Udemy, do professor Nelio Alves.

## Exercício de Fixação

Em um novo programa, inicie as seguintes variáveis:
```java
String product1 = "Computer";
String product2 = "Office desk";
int age = 30;
int code = 5290;
char gender = 'F';
double price1 = 2100.0;
double price2 = 650.50;
double measure = 53.234567;
```

Em seguida, usando os valores das variáveis, produza a seguinte saída na tela do console:
```
Products:
Computer, which price is $ 2100,00
Office desk, which price is $ 650,50
Record: 30 years old, code 5290 and gender: F
Measure with eight decimal places: 53,23456700
Rounded (three decimal places): 53,235
US decimal point: 53.235
```

## Meu Código

```java
package main;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        String product1 = "Computer";
        String product2 = "Office desk";
        
        int age = 30;
        int code = 5290;
        char gender = 'F';
        
        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;
        
        System.out.printf("%s, which price is $ %.2f\n", product1, price1);
        System.out.printf("%s, which price is $ %.2f\n", product2, price2);
        
        System.out.printf("%d years old, code %d and gender: %s\n", age, code, gender);
        
        System.out.println("Measure with eight decimal places: " + measure);
        System.out.printf("Rounded (three decimal places): %.3f\n", measure);
        Locale.setDefault(Locale.US);
        System.out.printf("US decimal point: %.3f\n", measure);
    }
}
```

## Comentários

Este exercício me ajudou a praticar a formatação de saída em Java e a usar diferentes tipos de variáveis. Estou animado para continuar aprendendo e melhorando minhas habilidades em Java!