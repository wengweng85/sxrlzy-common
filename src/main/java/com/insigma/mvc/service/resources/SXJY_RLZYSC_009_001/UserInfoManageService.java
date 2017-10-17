package com.insigma.mvc.service.resources.SXJY_RLZYSC_009_001;


import java.util.HashMap;

import com.insigma.dto.AjaxReturnMsg;
import com.insigma.mvc.model.Ec12;
import com.insigma.mvc.model.Ec13;
import com.insigma.mvc.model.Ef11;

public interface UserInfoManageService {

	
	public AjaxReturnMsg saveEc12Data(Ec12 ec12,Ec13 ec13);
	
	public AjaxReturnMsg chanagePwdEc12Data(Ec12 ec12);
	
	public AjaxReturnMsg resetPwdEc12Data(Ec12 ec12);
	
	public AjaxReturnMsg batResetPwdEc12Data(Ec12 ec12);
	
	public AjaxReturnMsg getHRAgencyUserPwdById(String id,String pwd);
	
	public AjaxReturnMsg getUserInfoByAec101(String id);
	
	public AjaxReturnMsg getUserInfoByAab998(String id);
	
	public HashMap<String,Object> getHRAgencyUserInfoList( Ec12 ec12 );
	
}
