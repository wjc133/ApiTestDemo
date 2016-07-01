##Lambda表达式眼中的外部世界
###lambda眼中的this
在lambda中，this不是指向lambda表达式产生的那个SAM对象，而是声明它的外部对象。

##方法引用（Method reference）
方法引用可以在某些条件成立的情况下，更加简化lambda表达式的声明。方法引用语法格式有以下三种：

- objectName::instanceMethod
- ClassName::staticMethod
- ClassName::instanceMethod

前两种方式类似，等同于把lambda表达式的参数直接当成instanceMethod|staticMethod的参数来调用。
例如：
`System.out::println` 等同于 `x->System.out.println(x)`
`Math::max`           等同于 `(x, y)->Math.max(x,y)`

最后一种方式，等同于把lambda表达式的第一个参数当成instanceMethod的目标对象，其他剩余参数当成该方法的参数。
例如：
`String::toLowerCase` 等同于 `x->x.toLowerCase()`

##构造器引用（construct reference）
语法如下：ClassName::new，把lambda表达式的参数当成ClassName构造器的参数
例如:
`BigDecimal::new`     等同于 `x->new BigDecimal(x)`

##Stream
Stream的性能问题
性能问题
有些细心的同学可能会有这样的疑问：在对于一个Stream进行多次转换操作，每次都对Stream的每个元素进行转换，而且是执行多次，这样时间复杂度就是一个for循环里把所有操作都做掉的N（转换的次数）倍啊。其实不是这样的，转换操作都是lazy的，多个转换操作只会在汇聚操作（见下节）的时候融合起来，一次循环完成。我们可以这样简单的理解，Stream里有个操作函数的集合，每次转换操作就是把转换函数放入这个集合中，在汇聚操作的时候循环Stream对应的集合，然后对每个元素执行所有的函数。



##个人感悟

Lambda的适用场景：如果有方法需要传入接口或者抽象类作为参数，那么该参数可以通过Lambda表达式来定义。