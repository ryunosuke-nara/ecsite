package jp.co.internous.ecsite.model.dto;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;

import jp.co.internous.ecsite.model.domain.TblPurchase;

public class HistoryDto {
	
	private int id;
	private int userId;
	private int goodsId;
	private String goodsName;
	private int itemCount;
	private int total;
	private String createdAt;
	
	public HistoryDto() {}
	
	public HistoryDto(TblPurchase entry) {
		this.id = entry.getId();
		this.userId = entry.getUserId();
		this.goodsId = entry.getUserId();
		this.goodsName = entry.getGoodsName();
		this.itemCount = entry.getItemCount();
		this.total = entry.getTotal();
		
		Timestamp d = entry.getCreatedAt();
		SimpleDateFormat f = new SimpleDateFormat("yyyy/MM/dd/ HH:mm:ss");
		this.createdAt = f.format(d);
		
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getUserId() {
		return userId;
	}
	
	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	public String getGoodsName() {
		return goodsName;
	}
	
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	
	public int getItemCount() {
		return itemCount;
	}
	
	public void setItemCount(int itemCount) {
		this.itemCount = itemCount;
	}
	
	public int getTotal() {
		return total;
	}
	
	public void setTotal(int total) {
		this.total = total;
	}
	
	public String getCreatedAt() {
		return createdAt;
	}
	
	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

}
