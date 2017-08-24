package cn.e3mall.service;

import java.util.List;
import java.util.Map;

import cn.e3mall.pojo.TbItem;

public interface ItemService {
	
	public Map<String, Object> itemList(Integer page, Integer rows);
}
