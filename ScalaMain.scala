/**
 * Author: asami
 * Date: 13/04/13
 */
object ScalaMain {
  def main(args : Array[String]){
    val kinoko = new Programmer("きの子", "Scala") with SweetsJunkie { override val favoriteSweets = "チョコレート" }
    println(kinoko.introduction)
    println(kinoko.sayHungry)
  }
}