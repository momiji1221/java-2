# java-lesson
for java experiment2


## 实验目的
初步了解分析系统需求，从学生选课角度了解系统中的实体及其关系，学会定义类中的属性以及方法；
掌握面向对象的类设计方法（属性、方法）；
掌握类的继承用法，通过构造方法实例化对象；
学会使用super()，用于实例化子类；
掌握使用Object根类的toString（）方法,应用在相关对象的信息输出中。


## 实验方法
1.阅读需求，大致想好创建的类，变量及其方法
2.分类分别编写teacher  course people student text五个类
3.调试并修改

## 实验过程
1.创建project，并在其下创建package xuanke，在package下创建teacher、course、Text、people、student五个class，根据需求分别将五个功能写入。
2.将Text作为主类，在其中将其余四个类的信息作println输出。
3.在teacher类中创建id，name，gender，teach四个变量，用this方法进行赋值，toString（）方法进行相关对象的信息输出（之后相同的变量名以及方法名略去，功能相同）
4.course类中创建id,name,place,time,tname(老师的名字),这五个变量，方法同上
5.people类中存储全部人员的信息，创建id,name,gender三个变量，方法同上
6.student类中创建id，name，gender，study四个变量，方法同上
7.检查变量名有无错误以及是否对应
8.检查方法是否有误

## 核心方法
'''
    Student stu1 = new Student("101","小明","男","工程制图CAD");
		Teacher tea1 = new Teacher("201","郝老师","女","经济学基础");
		Course cou1 = new Course("1","经济学基础","教307","第三四大节","郝老师");
		People peo1 = new People("101","小明","男");
		
		System.out.println(stu1.toString());
		System.out.println(tea1.toString());
		System.out.println(peo1.toString());
		System.out.println(cou1.toString());
'''

## 实验结果
因电脑问题结果未保存，故障处理后将马上完善本项

## 实验感想
首先要反思一下，并没有真正理解继承的用法，没有体现super方法，在之后的时间我会继续按要求完成这个实验，经过这次实验，我对信息的输出这方面有更深的理解，我将会进一步完善实验内容。

