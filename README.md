# DesignPatterns
# Java 设计模式

## 目录：
1. 设计模式的七大原则
2. 设计模式分类
3. 其他

## 设计模式的七大原则：
### 1. 单一职责原则(SingleResponsibilityPrinciple)

##### 基本介绍

    对类来说的，即一个类应该只负责一项职责。如类A负责两个不同职责：职责1，职责2。
    当职责1需求变更而改变A时，可能造成职责2执行错误， 所以需要将类A的粒度分解为A1， A2

##### 注意事项和细节：
    1) 降低类的复杂度，一个类只负责一项职责。
    2) 提高类的可读性，可维护性
    3) 降低变更引起的风险
    4) 通常情况下， 我们应当遵守单一职责原则，只有逻辑足够简单，才可以在代码级违反单一职责原则；只有类中方法数量足够少，可以在方法级别保持单一职责原则


### 2. 接口隔离原则(Interface Segregation Principle)

##### 基本介绍
    1) 客户端不应该依赖它不需要的接口，即一个类对另一个类的依赖应该建立在最小的接口上
    2) 先看一张图:![基本介绍图](https://raw.githubusercontent.com/hezhiliang/DesignPatterns/master/img/%E6%8E%A5%E5%8F%A3%E9%9A%94%E7%A6%BB%E5%8E%9F%E5%88%99%E5%9F%BA%E6%9C%AC%E4%BB%8B%E7%BB%8D%E5%9B%BE1.png)
    3) 类A通过接口Interface1依赖类B，类C通过接口Interface1依赖类D，如果接口Interface1对于类A和类C来说不是最小接口，那么类B和类D必须去实现他们不需要的方法。
    4) 按隔离原则应当这样处理：将接口Interface1拆分为独立的几个接口，类A和类C分别与他们需要的接口建立依赖关系。也就是采用接口隔离原则


3. 依赖倒转原则


4. 里氏替代原则

5. 开闭原则
概念：
    软件实体如类，模块和函数应该对扩展开放（对提供方），
对修改关闭（对使用方）。用抽象构建框架，用实现扩展细节。
    编程中遵循其他原则，以及使用设计模式的目的就是遵循开闭原则。

6. 迪米特原则
7. 合成复用原则



## 设计模式分三大类：
一. 创建者模式（5种）：

二. 结构型模式（7种）：

三. 行为型模式（11种）：

