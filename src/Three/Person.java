/**
 * \* Created with IntelliJ IDEA.
 * \* User: WANGTAO
 * \* Date: 2020/12/14
 * \* Time: 14:07
 * \* To change this template use File
 * \*Settings | File Templates.
 * \* Description:
 **/
package Three;

public class Person {
  private String name;
  public String getName(){
      return  name;
  }
  public void setName(String name){
      this.name=name;
  }
  Product shopping (Market market,String name){
      return market.sell(name);
  }
}
