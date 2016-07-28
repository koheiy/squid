package com.example.dao;

import java.util.List;

import org.seasar.doma.Dao;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.boot.ConfigAutowireable;

import com.example.entity.SquidRecord;

@ConfigAutowireable
@Dao
public interface SquidResultDao {

	@Select
	public List<SquidRecord> selectAll();

	@Insert
	public int insert(SquidRecord entity);
}
