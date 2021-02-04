package com.devfun.settingweb_boot.service;

import java.util.HashMap;
import java.util.List;

public interface StatisticService {
	public HashMap<String, Object> yearloginNum (String year);
	public HashMap<String, Object> monthloginNum (String month);
	public HashMap<String, Object> dayloginNum (String day);
	public HashMap<String, Object> deptmonthloginNum (String dept, String month);
	public List<HashMap<String, Object>> monthAvgloginNum();
	public HashMap<String, Object> userboardNum (String name, String month);

}
