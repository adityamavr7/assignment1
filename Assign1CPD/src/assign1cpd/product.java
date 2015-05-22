/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package assign1cpd;

/**
 *
 * @author c0633176
 */
public class product {
    String productId;
    String Quantity;

    public product() {
    }

    public product(String productId, String Quantity) {
        this.productId = productId;
        this.Quantity = Quantity;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getQuantity() {
        return Quantity;
    }

    public void setQuantity(String Quantity) {
        this.Quantity = Quantity;
    }
    
}
