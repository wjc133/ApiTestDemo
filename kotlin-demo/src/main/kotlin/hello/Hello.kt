/**
 * Created by wjc133
 * Date: 2016/10/20
 * Time: 17:03
 */
package hello

import hello.view.MyView

//var stu = Student()
var stu = GoodStudent()

fun getHelloString(): String {
    return "Hello, World!!!"
}

fun createXm() {
    stu.name = "小明"
    stu.number = 10001
}

fun main(args: Array<String>) {
    println(getHelloString())
    createXm()
    println(stu)
    stu.learn("MATH")
    var mView = MyView()
    mView.height = 1024
    mView.width = 768
    mView.draw()
}

