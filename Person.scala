/**
 * Author: asami
 * Date: 13/04/13
 */
class Person(n : String,  lovers : Person) {  // 抽象クラスにするならabstruct 継承させたくなければ final
  // 基本コンストラクタ
  require(n != null)
  val name = n

  override def toString : String = name // Any.toStringのオーバーライド
  def this(n : String) = this(n, null)  // 補助コンストラクタ
  def introduction : String = "私の名前は " + name + " です。" +
                                (if (lovers != null) lovers.name + " さんとお付き合いしています。(｀・ω・´)ｷﾘｯ"
                                else "恋人？何それおいしいの？（´・ω・｀）")
}

// コンパニオンオブジェクト
// シングルトンになります
object Person
{

}
