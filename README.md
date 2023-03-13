# JavaDesignPattern
java设计模式代码库

# (ChatGPT给出的答案) Java中面试常见的设计模式包括：

### 单例模式（Singleton Pattern）：常被问及如何实现单例、单例模式的优缺点以及实现的线程安全问题等。
#### 如何实现单例
- 饿汉式，线程安全
- 懒汉式，不加锁，线程不安全
- 懒汉式，加锁，线程安全，效率低
- 双重检查 线程安全，效率高
- 静态内部类
- 枚举
#### 单例模式的优缺点
> 单例模式的优点：
- 保证系统中只有一个实例，避免资源浪费 
- 维护系统中唯一的一份状态，避免多个实例之间逻辑上的错误或者不一致性问题
- 一定程度上提高系统的性能表现

> 单例模式的缺点：
- 单例模式会使得代码复杂度增加，降低代码可维护性
- 单例模式的单例对象在整个程序运行期间都不会被销毁，可能导致资源长时间不能得到释放，从而降低整体性能表现
- 滥用单例模式可能会导致系统出现全局性的复杂性和耦合性问题


### 工厂模式（Factory Pattern）：常被问及如何实现简单工厂、工厂方法、抽象工厂等，以及应用场景、优缺点等。
> 如何实现简单工厂,以及应用场景、优缺点等
- 使用if/else 或者switch/cash 来获取对象
- **应用场景**：简单工厂模式适用于需要创建的对象类型少，且客户端只需要告诉工厂要什么类型的对象即可，不需要知道具体的实现类名，帮助客户端更好地管理多个具体产品的实现。、
- **优缺点**：
  - 简单工厂模式的优点是能够隐藏创建对象的过程，客户端只需传入需要的参数即可获取所需对象，同时可以降低客户端与具体实现类之间的耦合。
  - 缺点是工厂类集中了所有产品的生产逻辑，管理和维护困难，新增产品时需要修改工厂类的代码，**不符合开闭原则**。

> 如何实现工厂方法,以及应用场景、优缺点等
- （工业制度标准化）在简单工厂的基础上，将创建的对象进行拆分，实现不同对象不同的工厂
- **应用场景**：工厂方法模式适用于需要创建多种具体实现类的产品类，通过定义一个工厂接口和相应的工厂实现类来帮助客户端管理多个具体类的实现，同时也能够降低系统耦合度，增加代码的可扩展性和可维护性。因此，当客户端需要创建多个相关产品类的实例时，且客户端希望能够灵活地添加新的产品实现类时，可以使用工厂方法模式。
- **优缺点**：
  - 优点：封装对象的创建过程，符合单一职责原则；能够很容易地添加新的产品实现，符合开闭原则。
  - 缺点：类的个数容易过多，增加代码结构的复杂性；不能保证返回的对象类型与客户端期望的类型一致。
> 如何实现抽象工厂,以及应用场景、优缺点等
- 1





### 观察者模式（Observer Pattern）：常被问及如何实现观察者与被观察者之间的通信机制、推拉模型、多线程下的观察者等。

### 装饰器模式（Decorator Pattern）：常被问及如何实现动态添加功能、装饰器和被装饰者的区别、装饰器与继承的比较等。

### 适配器模式（Adapter Pattern）：常被问及如何实现类适配器和对象适配器、适配器模式与桥接模式、代理模式的不同等。

### 策略模式（Strategy Pattern）：常被问及如何实现不同算法的切换、优化策略模式、与状态模式的比较等。

### 原型模式（Prototype Pattern）：常被问及如何实现深度拷贝、浅度拷贝、原型模式与工厂方法的比较等。

### 模板方法模式（Template Method Pattern）：常被问及如何实现算法的稳定结构、钩子函数、与策略模式和状态模式的比较等。

### 建造者模式（Builder Pattern）：常被问及如何应对复杂对象的创建、如何优化建造者模式、与工厂模式和抽象工厂模式的比较等。

### 外观模式（Facade Pattern）：常被问及如何封装底层细节、与代理模式的共同点与区别、与适配器模式和桥接模式的比较等。