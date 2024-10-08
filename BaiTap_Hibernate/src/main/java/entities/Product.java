package entities;
// Generated Aug 24, 2024, 4:49:54 PM by Hibernate Tools 4.3.6.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Product generated by hbm2java
 */
@Entity
@Table(name = "product", catalog = "bai4_minishop")
public class Product implements java.io.Serializable {

	private Integer productId;
	private int categoryId;
	private int publisherId;
	private int authorId;
	private String isbn;
	private String title;
	private short pages;
	private short year;
	private String weight;
	private String size;
	private String description;
	private String content;
	private String imageUrl;
	private int price;
	private Set<Cart> carts = new HashSet<Cart>(0);

	public Product() {
	}

	public Product(int categoryId, int publisherId, int authorId, String isbn, String title, short pages, short year,
			String description, int price) {
		this.categoryId = categoryId;
		this.publisherId = publisherId;
		this.authorId = authorId;
		this.isbn = isbn;
		this.title = title;
		this.pages = pages;
		this.year = year;
		this.description = description;
		this.price = price;
	}

	public Product(int categoryId, int publisherId, int authorId, String isbn, String title, short pages, short year,
			String weight, String size, String description, String content, String imageUrl, int price,
			Set<Cart> carts) {
		this.categoryId = categoryId;
		this.publisherId = publisherId;
		this.authorId = authorId;
		this.isbn = isbn;
		this.title = title;
		this.pages = pages;
		this.year = year;
		this.weight = weight;
		this.size = size;
		this.description = description;
		this.content = content;
		this.imageUrl = imageUrl;
		this.price = price;
		this.carts = carts;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "ProductId", unique = true, nullable = false)
	public Integer getProductId() {
		return this.productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	@Column(name = "CategoryId", nullable = false)
	public int getCategoryId() {
		return this.categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	@Column(name = "PublisherId", nullable = false)
	public int getPublisherId() {
		return this.publisherId;
	}

	public void setPublisherId(int publisherId) {
		this.publisherId = publisherId;
	}

	@Column(name = "AuthorId", nullable = false)
	public int getAuthorId() {
		return this.authorId;
	}

	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}

	@Column(name = "ISBN", nullable = false, length = 16)
	public String getIsbn() {
		return this.isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	@Column(name = "Title", nullable = false, length = 128)
	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Column(name = "Pages", nullable = false)
	public short getPages() {
		return this.pages;
	}

	public void setPages(short pages) {
		this.pages = pages;
	}

	@Column(name = "Year", nullable = false)
	public short getYear() {
		return this.year;
	}

	public void setYear(short year) {
		this.year = year;
	}

	@Column(name = "Weight", length = 32)
	public String getWeight() {
		return this.weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	@Column(name = "Size", length = 16)
	public String getSize() {
		return this.size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	@Column(name = "Description", nullable = false, length = 1024)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "Content", length = 2048)
	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Column(name = "ImageUrl", length = 128)
	public String getImageUrl() {
		return this.imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	@Column(name = "Price", nullable = false)
	public int getPrice() {
		return this.price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "product")
	public Set<Cart> getCarts() {
		return this.carts;
	}

	public void setCarts(Set<Cart> carts) {
		this.carts = carts;
	}

}
