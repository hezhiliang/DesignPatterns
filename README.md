# DesignPatterns
# Java 设计模式

## 一、目录：
1. 设计模式的七大原则
2. 设计模式分类
3. 其他

## 二、设计模式的七大原则：
### 1. 单一职责原则(SingleResponsibilityPrinciple)

##### 基本介绍

    对类来说的，即一个类应该只负责一项职责。如类A负责两个不同职责：职责1，职责2。
    当职责1需求变更而改变A时，可能造成职责2执行错误， 所以需要将类A的粒度分解为A1， A2

##### 注意事项和细节：
    1) 降低类的复杂度，一个类只负责一项职责。
    2) 提高类的可读性，可维护性
    3) 降低变更引起的风险
    4) 通常情况下， 我们应当遵守单一职责原则，只有逻辑足够简单，才可以在代码级违反单一职责原则；只有类中方法数量足够少，可以在方法级别保持单一职责原则

[代码演示看 com.atguigu.principle.singleresponsibility](https://github.com/hezhiliang/DesignPatterns/tree/master/src/com/atguigu/principle/singleresponsibility)

### 2. 接口隔离原则(Interface Segregation Principle)

##### 基本介绍
    1) 客户端不应该依赖它不需要的接口，即一个类对另一个类的依赖应该建立在最小的接口上
    2) 先看一张图:（见下"基本介绍图"）
    3) 类A通过接口Interface1依赖类B，类C通过接口Interface1依赖类D，如果接口Interface1对于类A和类C来说不是最小接口，那么类B和类D必须去实现他们不需要的方法。
    4) 按隔离原则应当这样处理：将接口Interface1拆分为独立的几个接口，类A和类C分别与他们需要的接口建立依赖关系。也就是采用接口隔离原则

![接口隔离原则基本介绍图1.png](https://raw.githubusercontent.com/hezhiliang/DesignPatterns/master/img/%E6%8E%A5%E5%8F%A3%E9%9A%94%E7%A6%BB%E5%8E%9F%E5%88%99%E5%9F%BA%E6%9C%AC%E4%BB%8B%E7%BB%8D%E5%9B%BE1.png "接口隔离原则基本介绍图1")

[代码演示看 com/atguigu/principle/inversion/DependecyInversion.java](https://github.com/hezhiliang/DesignPatterns/tree/master/src/com/atguigu/principle/inversion/DependecyInversion.java)

###### 应传统方法的问题和使用接口隔离原则改进，如图：

![接口隔离原则改进图1.jpg](https://github.com/hezhiliang/DesignPatterns/blob/master/img/%E6%8E%A5%E5%8F%A3%E9%9A%94%E7%A6%BB%E5%8E%9F%E5%88%99%E6%94%B9%E8%BF%9B%E5%9B%BE1.jpg "接口隔离原则改进图1")

    1) 类A通过接口Interface1依赖类B，类C通过接口Interface1依赖类D，如果接口Interface1对于类A和类C来说不是最小接口，那么类B和类D必须去实现他们不需要的方法
    2) 将接口Interface1拆分为独立的几个接口，类A和类C分别与他们需要的接口建立依赖关系。也就是采用接口隔离原则
    3) 接口Interface1中出现的方法，根据实际情况拆分为三个接口


[代码演示看 com/atguigu/principle/inversion/improve/DependecyInversion.java](https://github.com/hezhiliang/DesignPatterns/blob/master/src/com/atguigu/principle/inversion/improve/DependecyInversion.java)

### 3. 依赖倒转原则(Dependence Inversion Principle)
##### 基本介绍
    1) 高层模块不应该依赖低层模块，二者都应该依赖其抽象
    2) 抽象不应该依赖细节，细节应该依赖抽象
    3) 依赖倒转(倒置)的中心思想是面向接口编程
    4) 依赖倒转原则是基于这样的设计理念：相对于细节的多变性，抽象的东西要稳定的多。以抽象为基础搭建的架构比以细节为基础的架构要稳定的多。在java中，抽象指的是接口或抽象类，细节就是具体的实现类
    5) 使用接口或抽象类的目的是制定好规范，而不涉及任何具体的操作，把展现细节的任务交给他们的实现类去完成

##### 注意事项和细节
    1) 低层模块尽量都要有抽象类或接口，或者两者都有，程序稳定性更好.
    2) 变量的声明类型尽量是抽象类或接口, 这样我们的变量引用和实际对象间，就存在一个缓冲层，利于程序扩展和优化
    3) 继承时遵循里氏替换原则
   
[代码演示看 com.atguigu.principle.demeter](https://github.com/hezhiliang/DesignPatterns/tree/master/src/com/atguigu/principle/demeter/)   
    
### 4. 里氏替代原则(Liskov Substitution Principle)
##### OO中的继承性的思考和说明
    1) 继承包含这样一层含义：父类中凡是已经实现好的方法， 实际上是在设定规范和契约，虽然它不强制要求所有的子类必须遵循这些契约，但是如果子类对这些已经实现的方法任意修改，就会对整个继承体系造成破坏。
    2) 继承在给程序设计带来便利的同时，也带来了弊端。比如使用继承会给程序带来侵入性，程序的可移植性降低，增加对象间的耦合性，如果一个类被其他的类所继承，则当这个类需要修改时，必须考虑到所有的子类，并且父类修改后，所有涉及到子类的功能都有可能产生故障
    3) 问题提出：在编程中，如何正确的使用继承? => 里氏替换原则
    
##### 基本介绍
    1) 里氏替换原则(Liskov Substitution Principle)在1988年，由麻省理工学院的以为姓里的女士提出的。
    2) 如果对每个类型为T1的对象o1，都有类型为T2的对象o2，使得以T1定义的所有程序P在所有的对象o1都代换成o2时，程序P的行为没有发生变化，那么类型T2是类型T1的子类型。换句话说，所有引用基类的地方必须能透明地使用其子类的对象。
    3) 在使用继承时，遵循里氏替换原则，在子类中尽量不要重写父类的方法
    4) 里氏替换原则告诉我们，继承实际上让两个类耦合性增强了， 在适当的情况下，可以通过聚合，组合，依赖 来解决问题。 

##### 优化方法
     通用的做法是：原来的父类和子类都继承一个更通俗的基类，原有的继承关系去掉，采用依赖，聚合，组合等关系代替


[代码演示看 com.atguigu.principle.liskov](https://github.com/hezhiliang/DesignPatterns/tree/master/src/com/atguigu/principle/liskov/)

### 5. 开闭原则(Open Closed Principle)
##### 基本介绍
    1) 开闭原则（Open Closed Principle） 是编程中最基础、最重要的设计原则
    2) 一个软件实体如类，模块和函数应该对扩展开放(对提供方)， 对修改关闭(对使用方)。 用抽象构建框架，用实现扩展细节。
    3) 当软件需要变化时，尽量通过扩展软件实体的行为来实现变化，而不是通过修改已有的代码来实现变化。
    4) 编程中遵循其它原则，以及使用设计模式的目的就是遵循开闭原则。

###### 看一个画图形的功能。类图设计，如下:

![开闭原则演示代码的类图设计.jpg](https://raw.githubusercontent.com/hezhiliang/DesignPatterns/master/img/%E5%BC%80%E9%97%AD%E5%8E%9F%E5%88%99%E6%BC%94%E7%A4%BA%E4%BB%A3%E7%A0%81%E7%9A%84%E7%B1%BB%E5%9B%BE%E8%AE%BE%E8%AE%A1.jpg "开闭原则演示代码的类图设计")

###### 看下面一段代码：

[代码演示看com.atguigu.principle.ocp.java](https://github.com/hezhiliang/DesignPatterns/blob/master/src/com/atguigu/principle/ocp/Ocp.java)

###### 方式1的优缺点
1) 优点是比较好理解，简单易操作。
2) 缺点是违反了设计模式的ocp原则，即对扩展开放(提供方)，对修改关闭(使用方)。即当我们给类增加新功能的时候，尽量不修改代码，或者尽可能少修改代码.
3) 比如我们这时要新增加一个图形种类 三角形，我们需要做如下修改， 修改的地方较多
4) 代码演示(略，详情看代码)


###### 方式1的改进的思路分析
    思路： 把创建Shape类做成抽象类，并提供一个抽象的draw方法，让子类去实现即可，这样我们有新的图形种类时，只需要让新的图形类继承Shape，并实现draw方法即可，使用方的代码就不需要修 -> 满足了开闭原则

[代码演示看com/atguigu/principle/ocp/improve/Ocp.java](https://github.com/hezhiliang/DesignPatterns/blob/master/src/com/atguigu/principle/ocp/improve/Ocp.java)


### 6. 迪米特原则
##### 基本介绍
    1) 一个对象应该对其他对象保持最少的了解
    2) 类与类关系越密切，耦合度越大
    3) 迪米特法则(Demeter Principle)又叫最少知道原则，即一个类对自己依赖的类知道的越少越好。也就是说，对于被依赖的类不管多么复杂，都尽量将逻辑封装在类的内部。对外除了提供的public 方法，不对外泄露任何信息
    4) 迪米特法则还有个更简单的定义：只与直接的朋友通信
    5) 直接的朋友：每个对象都会与其他对象有耦合关系，只要两个对象之间有耦合关系，我们就说这两个对象之间是朋友关系。耦合的方式很多，依赖，关联，组合，聚合等。其中，我们称出现成员变量，方法参数，方法返回值中的类为直接的朋友，而出现在局部变量中的类不是直接的朋友。也就是说，陌生的类最好不要以局部变量的形式出现在类的内部。


[代码演示看 com/atguigu/principle/demeter/Demeter1.java](https://github.com/hezhiliang/DesignPatterns/tree/master/src/com/atguigu/principle/demeter/Demeter1.java)

##### 7. 合成复用原则

##### 基本介绍
    原则是尽量使用合成/聚合的方式，而不是使用继承
       
## 三、设计模式分三大类：

#### 一. 创建者模式（5种）：
   ##### 1. 单例模式
   
    单例模式有八种方式：
        1) 饿汉式(静态常量)
        2) 饿汉式（静态代码块）
        3) 懒汉式(线程不安全)
        4) 懒汉式(线程安全，同步方法)
        5) 懒汉式(线程不安全，同步代码块)
        6) 懒汉式-双重检查
        7) 懒汉式-静态内部类
        8) 懒汉式-枚举
        
   ##### 2. 抽象工厂模式
   
    基本介绍
    1) 抽象工厂模式：定义了一个interface用于创建相关或有依赖关系的对象簇，而无需指明具体的类
    2) 抽象工厂模式可以将简单工厂模式和工厂方法模式进行整合。
    3) 从设计层面看，抽象工厂模式就是对简单工厂模式的改进(或者称为进一步的抽象)。
    4) 将工厂抽象成两层， AbsFactory(抽象工厂) 和 具体实现的工厂子类。程序员可以根据创建对象类型使用对应的工厂子类。 这样将单个的简单工厂类变成了工厂簇(cu)，更利于代码的维护和扩展。

   ##### 3. 原型模式
   
    基本介绍
    1) 原型模式(Prototype模式)是指：用原型实例指定创建对象的种类，并且通过拷贝这些原型， 创建新的对象
    2) 原型模式是一种创建型设计模式，允许一个对象再创建另外一个可定制的对象，无需知道如何创建的细节
    3) 工作原理是:通过将一个原型对象传给那个要发动创建的对象，这个要发动创建的对象通过请求原型对象拷贝它们自己来实施创建，即 对象.clone()
    4) 形象的理解：孙大圣拔出猴毛， 变出其它孙大圣
    
   ##### 4. 建造者模式
    
   ##### 5. 工厂模式 (包含简单工厂模式)
   
    工厂方法模式基本介绍：定义了一个创建对象的抽象方法，由子类决定要实例化的类。工厂方法模式将对象的实例化推迟到子类
    
    简单工厂模式基本介绍
    1) 简单工厂模式是属于创建者模式，是工厂模式的一种。 简单工厂模式是由一个工厂对象决定创建出哪一种产品类的实例。简单工厂模式是工厂模式家族中最简单实用的模式。
    2) 简单工厂模式：定义了一个创建对象的类，由这个类来封装实例化对象的行为。
    3) 在软件开发中，当我们会用到大量的创建某种、某类或者某批对象时，就会使用。
    
   
#### 二. 结构型模式（7种）：
    1. 适配器模式、
    2. 桥接模式、
    3. 装饰模式、
    4. 组合模式、
    5. 外观模式、
    6. 享元模式、
    7. 代理模式。
#### 三. 行为型模式（11种）：
    1. 模版方法模式、
    2. 命令模式、
    3. 访问者模式、
    4. 迭代器模式、
    5. 观察者模式、
    6. 中介者模式、
    7. 备忘录模式、
    8. 解释器模式（Interpreter模式）、
    9. 状态模式、
    10. 策略模式、
    11. 职责链模式(责任链模式)。

注意：不同的书籍上对分类和名称略有差别

