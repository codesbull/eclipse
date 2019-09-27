package com.belief.dao;

import java.util.ArrayList;

import com.belief.model.Adjunct;

//持久层抽象接口
public interface adjunctDao {
	void save(Adjunct adjunct);

	void delete(Adjunct adjunct);

	void update(Adjunct adjunct);

	Adjunct QueryById(String adjunct_id);
	
	ArrayList <Adjunct> QueryByMailId(String mail_id);
}