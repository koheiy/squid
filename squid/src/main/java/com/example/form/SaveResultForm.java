package com.example.form;

import java.io.Serializable;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class SaveResultForm implements Serializable {

	private static final long serialVersionUID = 1L;

	/** ステージ名 */
	@NotNull
	@Size(min=1, max=130)
	private String stage;

	/** キル数 */
	@Min(0)
	@Max(250)
	private Integer killCount;

	/** デス数 */
	@Min(0)
	@Max(250)
	private Integer deathCount;

	/** 結果 */
	@Min(1)
	@Max(1)
	private Integer resultFlg;

	public String getStage() {
		return stage;
	}

	public void setStage(String stage) {
		this.stage = stage;
	}

	public Integer getKillCount() {
		return killCount;
	}

	public void setKillCount(Integer killCount) {
		this.killCount = killCount;
	}

	public Integer getDeathCount() {
		return deathCount;
	}

	public void setDeathCount(Integer deathCount) {
		this.deathCount = deathCount;
	}

	public Integer getResultFlg() {
		return resultFlg;
	}

	public void setResultFlg(Integer resultFlg) {
		this.resultFlg = resultFlg;
	}

}
