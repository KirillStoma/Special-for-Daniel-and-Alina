# Компилятор языка описывающего математические вычисления
В рамках данной работы реализован компилятор, способный преобразовывать язык математических вычислений в язык "Java"  

Вариант свойств языка 25

#Запуск компилятора 
  - Запустите Main.java 
  - Сгенерированный файл на языке Java находится в файле программы MainMath.java

#Алфавит
 - Файл языка ChislaLanguage.g4
 
#Процесс работы программы
  1) Создание лексера
  2) Создание парсера, основанного на лексере
  3) Создание дерева разбора
  4) Генерация строки с помощью визитора, который обрабатывает узлы дерева разбора
  5) Запись полученной строки в "Java" файл  
  6) Завершение работы

# Демонстрация работы компилятора, на примере файла test1.ch

## test1.ch: 
```
fun function (int data)
begin
    print data;
end

main
    begin
    int a = 9;
    flt b = 3.22;
    while (b>0)
      begin
          b=b-1;
          print b;
      end
    function(a);
end
```
## Сгенерированный Main.java: 
```java
public class Main {
private static void function(int data){
System.out.println(data);
}
public static void main(String[]args) throws Exception{
int a = 9;
float b = 3.22f;
while (b>0){
b=b-1;
System.out.println(b);
}
function(a);
}
}


```


