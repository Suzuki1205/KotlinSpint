package org.example.Lesson_1

fun main(){
    var buyer: Int = 75
    var gratitude: String = ("Thank you for your order!")
   // println(gratitude + "Your order was:" + buyer)
    println(buyer)
    println(gratitude)
    var store_Employe: Int = 2000
    //В компании работает 2000 сотрудников ( Странно да? у них 75 заказов всего а штат 2000)
    //println("Employees:" + store_Employe)
    //Один уволился
    println("Employees:" + (store_Employe - 1))

}