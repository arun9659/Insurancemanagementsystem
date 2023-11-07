package com.example.entity;

import java.util.List;

import lombok.Data;

@Data
public class Allpolicy {
  public List<vechileentityfirstparty> getFirstparty() {
		return firstparty;
	}
	public void setFirstparty(List<vechileentityfirstparty> firstparty) {
		this.firstparty = firstparty;
	}
	public List<vechilethirdpary> getThirdparty() {
		return thirdparty;
	}
	public void setThirdparty(List<vechilethirdpary> thirdparty) {
		this.thirdparty = thirdparty;
	}
private List<vechileentityfirstparty> firstparty;
  private List<vechilethirdpary> thirdparty;
}
