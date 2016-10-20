package hello.view

/**
 * Created by wjc133
 * Date: 2016/10/20
 * Time: 17:37
 */
open class View {
    var width=0
    var height=0

   open fun draw(){
        println("I'm drawing in a $width * $height place.")
    }
}