package com.insigma.mvc.service.resources.SXJY_RLZYSC_001_006;

import java.util.HashMap;

import com.insigma.dto.AjaxReturnMsg;
import com.insigma.mvc.model.EF11_DECLARE;
import com.insigma.mvc.model.Ef11;
import com.insigma.mvc.model.Ef12;

/**
 * ef11service
 * @author xizh
 *
 */
public interface HRAgencyChangeAuditService {
	
    public HashMap<String,Object> getEf11List( Ef11 ef11 );
	

	//�������ͨ��
	public AjaxReturnMsg singleAuditHRAgencyRegdata(Ef12 ef12);

   //��˲�ͨ��������
	public Ef11 getEf11InfoById(String id);

   //��������
	public AjaxReturnMsg saveNotPassAuditData(Ef12 ef12);


	public AjaxReturnMsg batAuditHRAgencyRegdata(Ef12 ef12);


	public Ef11 getEf11ById(String id);
	
	
}
