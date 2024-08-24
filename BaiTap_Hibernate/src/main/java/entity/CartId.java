package entity;
// Generated Aug 24, 2024, 4:44:16 PM by Hibernate Tools 4.3.6.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * CartId generated by hbm2java
 */
@Embeddable
public class CartId implements java.io.Serializable {

	private String cartId;
	private int productId;

	public CartId() {
	}

	public CartId(String cartId, int productId) {
		this.cartId = cartId;
		this.productId = productId;
	}

	@Column(name = "CartId", nullable = false, length = 32)
	public String getCartId() {
		return this.cartId;
	}

	public void setCartId(String cartId) {
		this.cartId = cartId;
	}

	@Column(name = "ProductId", nullable = false)
	public int getProductId() {
		return this.productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof CartId))
			return false;
		CartId castOther = (CartId) other;

		return ((this.getCartId() == castOther.getCartId()) || (this.getCartId() != null
				&& castOther.getCartId() != null && this.getCartId().equals(castOther.getCartId())))
				&& (this.getProductId() == castOther.getProductId());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getCartId() == null ? 0 : this.getCartId().hashCode());
		result = 37 * result + this.getProductId();
		return result;
	}

}
