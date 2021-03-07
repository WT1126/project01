/**
 * \* Created with IntelliJ IDEA.
 * \* User: WANGTAO
 * \* Date: 2020/12/14
 * \* Time: 11:10
 * \* To change this template use File
 * \*Settings | File Templates.
 * \* Description:
 **/
package Three;

public class Market {
    private  String MarketName;
    private Product [] productArr;
    public String getMarketName(){
        return MarketName;
    }
    public void setMarketName(String MarketName){
        this.MarketName=MarketName;
    }
    public Product [] getPrpductArr(){
        return productArr;
        
    }
    public void  setprobuctArr(Product [] probuctArr  ){
        this.productArr=probuctArr;
        
    }
    Product sell(String name) {
        for (int i = 0; i < productArr.length; i++) {
            if (productArr[i].getProName() == name) {
                return productArr[i];
            }
        }
        return null;
    }
 }
