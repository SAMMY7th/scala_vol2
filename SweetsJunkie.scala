/**
 * Author: asami
 * Date: 13/04/13
 */
trait SweetsJunkie {
  def favoriteSweets : String  // バーチャルメソッド
  def sayHungry  = favoriteSweets + "を食べたいなぁ"  // 具象メソッド
}
