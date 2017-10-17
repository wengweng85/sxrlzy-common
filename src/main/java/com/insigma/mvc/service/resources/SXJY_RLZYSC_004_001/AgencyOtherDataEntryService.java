package com.insigma.mvc.service.resources.SXJY_RLZYSC_004_001;

import java.util.HashMap;

import com.insigma.dto.AjaxReturnMsg;
import com.insigma.mvc.model.Ee15;
import com.insigma.mvc.model.Ee16;
import com.insigma.mvc.model.Ef11;


public interface AgencyOtherDataEntryService {

	    //获取其他人力资源招聘数据的信息
		public HashMap<String,Object> getAgencyData( Ee15 ee15);	
		
		//增加其他服务招聘数据
		public AjaxReturnMsg saveAddRecruitData(Ee15 ee15);
		
		//修改录入招聘数据
		public AjaxReturnMsg upDateAgencyData(Ee15 ee15);
		
		//通过主键查询数据
		public Ee15 getEe15ById(String id);
		
		//通过机构编号获取机构的名称
		public Ef11 getOrganizationNameById(String aef101);

}
