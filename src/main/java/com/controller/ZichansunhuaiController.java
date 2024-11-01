package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.ZichansunhuaiEntity;
import com.entity.view.ZichansunhuaiView;

import com.service.ZichansunhuaiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 资产损坏
 * 后端接口
 * @author 
 * @email 
 * @date 2021-03-20 22:53:13
 */
@RestController
@RequestMapping("/zichansunhuai")
public class ZichansunhuaiController {
    @Autowired
    private ZichansunhuaiService zichansunhuaiService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ZichansunhuaiEntity zichansunhuai,
		HttpServletRequest request){
        EntityWrapper<ZichansunhuaiEntity> ew = new EntityWrapper<ZichansunhuaiEntity>();
		PageUtils page = zichansunhuaiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zichansunhuai), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ZichansunhuaiEntity zichansunhuai, HttpServletRequest request){
        EntityWrapper<ZichansunhuaiEntity> ew = new EntityWrapper<ZichansunhuaiEntity>();
		PageUtils page = zichansunhuaiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zichansunhuai), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ZichansunhuaiEntity zichansunhuai){
       	EntityWrapper<ZichansunhuaiEntity> ew = new EntityWrapper<ZichansunhuaiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( zichansunhuai, "zichansunhuai")); 
        return R.ok().put("data", zichansunhuaiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ZichansunhuaiEntity zichansunhuai){
        EntityWrapper< ZichansunhuaiEntity> ew = new EntityWrapper< ZichansunhuaiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( zichansunhuai, "zichansunhuai")); 
		ZichansunhuaiView zichansunhuaiView =  zichansunhuaiService.selectView(ew);
		return R.ok("查询资产损坏成功").put("data", zichansunhuaiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ZichansunhuaiEntity zichansunhuai = zichansunhuaiService.selectById(id);
        return R.ok().put("data", zichansunhuai);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ZichansunhuaiEntity zichansunhuai = zichansunhuaiService.selectById(id);
        return R.ok().put("data", zichansunhuai);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ZichansunhuaiEntity zichansunhuai, HttpServletRequest request){
    	zichansunhuai.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(zichansunhuai);
        zichansunhuaiService.insert(zichansunhuai);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ZichansunhuaiEntity zichansunhuai, HttpServletRequest request){
    	zichansunhuai.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(zichansunhuai);
        zichansunhuaiService.insert(zichansunhuai);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody ZichansunhuaiEntity zichansunhuai, HttpServletRequest request){
        //ValidatorUtils.validateEntity(zichansunhuai);
        zichansunhuaiService.updateById(zichansunhuai);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        zichansunhuaiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<ZichansunhuaiEntity> wrapper = new EntityWrapper<ZichansunhuaiEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = zichansunhuaiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
