package com.example.entity;

import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

//
@Entity
@Table(name = "squidRecord")
public class SquidRecord {

	@Id
	int serial;
	String stage;
	private int killCount;
	private int deathCount;
	private int resultFlg;

	public int getSerial() {
		return serial;
	}
	public void setSerial(int serial) {
		this.serial = serial;
	}
	public String getStage() {
		return stage;
	}
	public void setStage(String stage) {
		this.stage = stage;
	}
	public int getKillCount() {
		return killCount;
	}
	public void setKillCount(int killCount) {
		this.killCount = killCount;
	}
	public int getDeathCount() {
		return deathCount;
	}
	public void setDeathCount(int deathCount) {
		this.deathCount = deathCount;
	}
	public int getResultFlg() {
		return resultFlg;
	}
	public void setResultFlg(int resultFlg) {
		this.resultFlg = resultFlg;
	}


	@Override
	public String toString() {
		return "SquidRecord [serial=" + serial + ", stage=" + stage + ", killCount=" + killCount + ", deathCount=" + deathCount + ", result=" +  convertResult() + "]";
	}

	public String convertResult() {
		return (resultFlg == 0) ? "win" : "lose";
	}

}
