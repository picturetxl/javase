

Java 版本

![image-20210605200757534](/Users/tailiang/dev/javase/Readme.assets/image-20210605200757534.png)





java源代码的文件名必须与public class 的类名相同

![image-20210605191321619](/Users/tailiang/dev/javase/Readme.assets/image-20210605191321619.png)



编译生成Welcome.class

```java
javac Welcome.java 
```

运行

```java
java Welcome
```



注释

```java
/**
 * @version
 * @author
 */
```





数据类型

| int     | 4字节 |                    |
| ------- | ----- | ------------------ |
| short   | 2字节 |                    |
| long    | 8字节 |                    |
| byte    | 1字节 |                    |
| float   | 4字节 |                    |
| double  | 8字节 |                    |
| char    | 1字节 | 强烈建议不要使用？ |
| boolean |       |                    |

类型转换



![image-20210605201132679](/Users/tailiang/dev/javase/Readme.assets/image-20210605201132679.png)

## unicode 编码？

## 码点和代码单元？





java中变量必须要初始化

![image-20210605193248973](/Users/tailiang/dev/javase/Readme.assets/image-20210605193248973.png)

![image-20210605193237706](/Users/tailiang/dev/javase/Readme.assets/image-20210605193237706.png)



常量 final

只能初始化的时候赋值，后面则不能再更改 这符合常量的定义

习惯上，常量用大写

```java
public class Constants
{
    public static void main(String[] args)
    {
        final double CM_PER_INCH = 2.54;
        double paperWidth = 8.5;
        double paperHeight = 11;
        System.out.println("Paper size in centimeters:"
            + paperWidth * CM_PER_INCH + " by " + paperHeight * CM_PER_INCH );
    }
}
```

![image-20210605193840231](/Users/tailiang/dev/javase/Readme.assets/image-20210605193840231.png)



类常量

在类中供多个方法使用

必须加上static，否则报错

![image-20210605195405060](/Users/tailiang/dev/javase/Readme.assets/image-20210605195405060.png)

```java
public class Constants2
{
    final static double CM_PER_INCH = 2.54;// must add static 
    
    public static void main(String[] args)
    {
        double paperWidth = 8.5;
        double paperHeight = 11;
        System.out.println("Paper size in centimeters:"
            + paperWidth * CM_PER_INCH + " by " + paperHeight * CM_PER_INCH );
    }
}         
```

> 现在这个常量只能在这个类内部使用，因为没有加public 暴露出去





Math

floorMod(int,int)  :arrow_right: 求余数

```java
public class TestMath
{
    public static void main(String[] args)
    {
        double x = 4;
        double y = Math.sqrt(x);
        System.out.println(y);

        System.out.print("4%2=");
        System.out.println(Math.floorMod(4,2));
        System.out.print("-4%2=");
        System.out.println(Math.floorMod(-4,2));
        System.out.print("4%3=");
        System.out.println(Math.floorMod(4,3));
        System.out.print("-4%3=");
        System.out.println(Math.floorMod(-4,3));
    }
}

```

![image-20210605200743160](/Users/tailiang/dev/javase/Readme.assets/image-20210605200743160.png)





进制

0b1001 表示二进制数

0xFF 表示十六进制数



位运算符

| &    | and  |                    |
| ---- | ---- | ------------------ |
| \|   | or   |                    |
| ^    | xor  |                    |
| ~    | not  |                    |
| >>   | 右移 | 使用符号位填充高位 |
| <<   | 左移 |                    |
| >>>  | 右移 | 使用0填充高位      |

> 不存在<<<



运算符优先级

![image-20210605201854264](/Users/tailiang/dev/javase/Readme.assets/image-20210605201854264.png)

![image-20210605201903276](/Users/tailiang/dev/javase/Readme.assets/image-20210605201903276.png)







String 类

1. 不可变字符串
2. 检测字符串内容是否相等用equals方法，不要用==
3. 
4. 