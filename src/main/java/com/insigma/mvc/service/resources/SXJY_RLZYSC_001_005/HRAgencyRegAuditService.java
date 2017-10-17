package com.insigma.mvc.service.resources.SXJY_RLZYSC_001_005;


import java.util.HashMap;

import com.insigma.dto.AjaxReturnMsg;
import com.insigma.mvc.model.EF11_DECLARE;
import com.insigma.mvc.model.Ef11;
import com.insigma.mvc.model.Ef12;





/**
 * ef11 service
 * @author pangyy
 *
 */
public interface HRAgencyRegAuditService {
	
	public HashMap<String,Object> getEf11List( Ef11 ef11 );
	
	public Ef11 getEf11ById(String aab998);
	
	public Ef11 getEf11InfoById(String aab998,String aef133);
	
	public EF11_DECLARE getEf11DeclareByAef101(String aab998);
	
	public AjaxReturnMsg batAuditHRAgencyRegdata(Ef12 ef12);
	
	public AjaxReturnMsg singleAuditHRAgencyRegdata(Ef12 ef12);
	
	public AjaxReturnMsg saveNotPassAuditData(Ef12 ef12);

}
