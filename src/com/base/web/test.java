package com.base.web;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.JSON;

public class test {

		public static void main(String[] args) {
			Map<String,Integer> map = new HashMap<String, Integer>();
			map.put("", 1);
			map.put("", 2);
			//map.remove(2);
			System.out.println(JSON.toJSONString(map));
		}
}
