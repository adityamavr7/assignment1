/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package assign1cpd;

/**
 *
 * @author c0649623
 */
public class Purchase {
    private String productId;
    private int quantity;
    
    public Purchase() {
        productId = "";
        quantity = 0;
    }
    public Purchase(String productId, int quantity) {
        this.productId = productId;
        this.quantity = quantity;
    }
    
    public String getProductId() {
        return productId;
    }
    public void setProductId(String productId) {
        this.productId = productId;
    }
    
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    public String toString() {
        String str = "\"productId\": " + productId +", \"quantity\": " + quantity;
        return str;
    }
}
