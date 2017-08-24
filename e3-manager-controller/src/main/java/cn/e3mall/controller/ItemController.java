package cn.e3mall.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.e3mall.pojo.TbItem;
import cn.e3mall.service.ItemService;

@Controller
public class ItemController {
	
	@Autowired
	private ItemService itemService;
	
	@RequestMapping(value="/index")
	public String index(){
		return "index";
	}
	
	@RequestMapping(value="item-list")
	public String item_list(){
		return "item-list";
	}
	
	@RequestMapping(value="/item/list")
	public @ResponseBody Map<String,Object> itemList(Integer page, Integer rows){
		Map<String, Object> map = itemService.itemList(page, rows);
		return map;
	}
}
