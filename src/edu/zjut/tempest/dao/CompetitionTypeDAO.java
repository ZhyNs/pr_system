package edu.zjut.tempest.dao;

import java.util.List;

import edu.zjut.tempest.entity.CompetitionType;

public interface CompetitionTypeDAO {

	public void saveCT(CompetitionType ct);
	
	public CompetitionType getByNameAndCategory(String name, int category);
	
	public CompetitionType getById(int id);
	/**
	 * getListByCategory 获得某种类别的赛事列表
	 * @param category
	 * @return
	 */
	public List<CompetitionType> getListByCategory(int category);
}
