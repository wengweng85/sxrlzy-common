package com.insigma.mvc.service.resources.SXJY_RLZYSC_007_002;

import java.util.HashMap;

import com.insigma.mvc.model.EE18;
import com.insigma.mvc.model.Ef11;

public interface InfoBusinessEE18Service {

	//获取招聘数据的信息
		public HashMap<String,Object> getRecruitData(EE18 ee18);

		public Ef11 getOrganizationNameById(String aef101);

		//通过主键查询数据
		public EE18 getEe18ById(String eee181);
}
