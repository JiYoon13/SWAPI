package com.devfun.settingweb_boot.test;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.devfun.settingweb_boot.dao.StatisticMapper;
import com.devfun.settingweb_boot.service.StatisticService;


@Controller
public class settingTest {
	
	@Autowired
	private StatisticService service;
	
	@ResponseBody
	@RequestMapping("/sqlyearStatistic")
	public Map<String, Object> sqlyear(String year) throws Exception{
		
		return service.yearloginNum(year);
	}
	
	@ResponseBody
	@RequestMapping("/sqlmonthStatistic")
	public Map<String, Object> sqltest(String month) throws Exception{
		
		return service.monthloginNum(month);
	}
	
	@ResponseBody
	@RequestMapping("/sqldayStatistic")
	public Map<String, Object> sqlday(String day) throws Exception{
		
		return service.dayloginNum(day);
	}
	
	@ResponseBody
	@RequestMapping("/sqldeptmonthStatistic")
	public Map<String, Object> sqldeptmonth(String dept, String month) throws Exception{
		
		return service.deptmonthloginNum(dept, month);
	}
	
	@ResponseBody
	@RequestMapping("/sqlmonthAvgStatistic")
	public List<HashMap<String, Object>> sqlmonthavg() throws Exception{
		
		return service.monthAvgloginNum();
	}
	
	@ResponseBody
	@RequestMapping("/sqluserboardStatistic")
	public Map<String, Object> sqluserboard(String name, String month) throws Exception{
		
		return service.userboardNum(name, month);
	}
	

	@RequestMapping("/test") 
    public ModelAndView test() throws Exception{ 
        ModelAndView mav = new ModelAndView("test"); 
        mav.addObject("name", "JIYOON"); 
        List<String> resultList = new ArrayList<String>(); 
        resultList.add("!!!HELLO WORLD!!!"); 
        resultList.add("설정 TEST!!!"); 
        resultList.add("설정 TEST!!!"); 
        resultList.add("설정 TEST!!!!!"); 
        resultList.add("설정 TEST!!!!!!"); 
        mav.addObject("list", resultList); 
        return mav; 
    }
}
