/**
 * Author: asami
 * Date: 13/04/13
 */
//class Programer(n : String, l : Person, fl: String) extends Person(n, l) with SweetsJunkie  {
class Programer(n : String, l : Person, fl: String) extends Person(n, l) {
  var favoriteLang = fl

  def this(n : String, l : Person) = this(n, l, null)
  def this(n : String) = this(n, null, null)
  def this(n : String, fl: String) = this(n, null, fl)
//  override val favoriteSweets = "チョコレート"
  override def introduction : String = super.introduction + " 好きな言語は" +
                                          (if (favoriteLang != null && !favoriteLang.isEmpty() ) favoriteLang + "です。"
                                           else "特にありません。" )
}
