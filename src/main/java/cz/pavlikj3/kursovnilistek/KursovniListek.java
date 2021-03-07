package cz.pavlikj3.kursovnilistek;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "kursovnilistek")
public class KursovniListek 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id; 
	
	@Column(nullable = false)
	private String currencyFullName;
	
	@Column(nullable = false)
	private Double cashBuy;
	
	@Column(nullable = false)
	private  Double cashSell;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCurrencyFullName() {
		return currencyFullName;
	}
	public void setCurrencyFullName(String currencyFullName) {
		this.currencyFullName = currencyFullName;
	}
	public Double getCashBuy() {
		return cashBuy;
	}
	public void setCashBuy(Double cashBuy) {
		this.cashBuy = cashBuy;
	}
	public Double getCashSell() {
		return cashSell;
	}
	public void setCashSell(Double cashSell) {
		this.cashSell = cashSell;
	}
}
