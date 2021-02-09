package com.devfun.settingweb_boot.service;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import java.net.URL;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.*;

import java.text.SimpleDateFormat;
import java.text.ParseException;
import javax.xml.parsers.*;
import java.util.*;

import com.devfun.settingweb_boot.dao.StatisticMapper;

@Service
public class StatisticServiceImpl implements StatisticService {

	@Autowired
	private StatisticMapper uMapper;
	
	
	@Override
	public HashMap<String, Object> yearloginNum (String year){
		HashMap<String, Object> retVal = new HashMap<String, Object>();
		
		try {
			retVal = uMapper.selectYearLogin(year);
			retVal.put("year", year);
			retVal.put("is_success", true);
		}catch(Exception e) {
			retVal.put("totCnt", -999);
			retVal.put("year", year);
			retVal.put("is_success", false);
		}
		
		return retVal;
	}


	@Override
	public HashMap<String, Object> monthloginNum(String month) {
		HashMap<String, Object> retVal = new HashMap<String, Object>();
		
		try {
			retVal = uMapper.selectMonthLogin(month);
			retVal.put("month", month);
			retVal.put("is_success", true);
		}catch(Exception e) {
			retVal.put("totCnt", -999);
			retVal.put("month", month);
			retVal.put("is_success", false);
		}
		
		return retVal;
	}


	@Override
	public HashMap<String, Object> dayloginNum(String day) {
		HashMap<String, Object> retVal = new HashMap<String, Object>();
		
		try {
			retVal = uMapper.selectDayLogin(day);
			retVal.put("day", day);
			retVal.put("is_success", true);
		}catch(Exception e) {
			retVal.put("totCnt", -999);
			retVal.put("day", day);
			retVal.put("is_success", false);
		}
		return retVal;
	}


	@Override
	public HashMap<String, Object> deptmonthloginNum(String dept, String month) {
		HashMap<String, Object> retVal = new HashMap<String, Object>();
		
		try {
			retVal = uMapper.selectDeptMonthLogin(dept, month);
			retVal.put("Department", dept);
			retVal.put("month", month);
			retVal.put("is_success", true);
		}catch(Exception e) {
			retVal.put("totCnt", -999);
			retVal.put("Department", dept);
			retVal.put("month", month);
			retVal.put("is_success", false);
		}
		return retVal;
	}


	@Override
	public List<HashMap<String, Object>> monthAvgloginNum() {
		List<HashMap<String, Object>> retVal = new ArrayList<HashMap<String, Object>>();
		retVal = uMapper.selectMonthAvgLogin();
		System.out.println("retVal: " + retVal);
		
		return retVal;
	}


	@Override
	public HashMap<String, Object> userboardNum(String name, String month) {
		HashMap<String, Object> retVal = new HashMap<String, Object>();
		
		try {
			retVal = uMapper.selectUserBoard(name, month);
			retVal.put("UserName", name);
			retVal.put("month", month);
		}catch(Exception e) {
			retVal.put("totCnt", -999);
			retVal.put("UserName", name);
			retVal.put("month", month);
		}
		return retVal;
	}


}
