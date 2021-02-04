package com.devfun.settingweb_boot.dao;

import java.util.HashMap;
import java.util.List;

import com.devfun.settingweb_boot.dto.StatisticDto;

public interface StatisticMapper {
	public HashMap<String,Object> selectYearLogin(String year);
	public HashMap<String,Object> selectMonthLogin(String month);
	public HashMap<String,Object> selectDayLogin(String day);
	public HashMap<String,Object> selectDeptMonthLogin(String dept, String month);
	public List<HashMap<String,Object>> selectMonthAvgLogin();
	public HashMap<String,Object> selectUserBoard(String name, String month);
	public HashMap<String,Object> selectExceptHolidayLogin(String month);

}
