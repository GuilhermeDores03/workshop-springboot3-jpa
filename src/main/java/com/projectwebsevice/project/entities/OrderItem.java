package com.projectwebsevice.project.entities;

import java.io.Serializable;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.projectwebsevice.project.entities.pk.OrderItemPk;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_order_item")
public class OrderItem implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private OrderItemPk id = new OrderItemPk();
	
	private Integer quatity;
	private Double price;

	//constructors
	public OrderItem() {
	}

	public OrderItem(Order order, Product product, Integer quatity, Double price) {
		id.setOrder(order);
		id.setProduct(product);
		this.quatity = quatity;
		this.price = price;
	}

	//methods
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OrderItem other = (OrderItem) obj;
		return Objects.equals(id, other.id);
	}
	
	//getters setters
	public Integer getQuatity() {
		return quatity;
	}

	public void setQuatity(Integer quatity) {
		this.quatity = quatity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	@JsonIgnore
	public Order getOrder() {
		return id.getOrder();
	}
	
	public void setOrder(Order order) {
		id.setOrder(order);
	}
	
	public Product getProduct() {
		return id.getProduct();
	}
	
	public void setProduct(Product product) {
		id.setProduct(product);
	}
}
