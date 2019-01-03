package net.vipmro.user.resource.domain.model.dto;

import lombok.Builder;
import lombok.Data;

/**
 * @author: liuHua
 * @create: 2018-10-30 16:04
 **/

@Data
@Builder
public class UserInfoDTO {
	private String userName;
	private Integer id;
	private String mobile;
	private Integer companyId;
	private String companyName;
	private String companyAddress;
}
