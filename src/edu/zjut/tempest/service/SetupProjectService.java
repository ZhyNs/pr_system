package edu.zjut.tempest.service;

import java.util.List;

import edu.zjut.tempest.entity.SetupProject;

public interface SetupProjectService {

	public int saveSetupPro(SetupProject setupPro);
	
	public int getCountOnAll();
	/**
	 * getList   分页所有项目立项结题记录
	 * @return
	 */
	public List<SetupProject> getAllList(int begin, int rowsPage);
	
	public List<SetupProject> getAllList();
	
	public List<SetupProject> getListByOfficalNumber(String officalNumber);
	
	public List<SetupProject> getListByCategory(String category);
	
	public List<SetupProject> getListByName(String name);
	
	public SetupProject getSetupProById(int id);
	
	public void deleteSetupPro(SetupProject setupPro);
	
}
